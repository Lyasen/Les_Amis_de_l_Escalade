package fr.lyasen.climbing.domaine.properties;

import fr.lyasen.climbing.service.forms.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserDetailService customUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception {
        managerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .and()
                .formLogin()
                .loginPage("/connection") // <- landing view for the form
                .loginProcessingUrl("/perform_login") // <- url of the action in the form
                .usernameParameter("pseudo").passwordParameter("password") // <- <input> names in the form
                .defaultSuccessUrl("/main") // <- when login succeed
                .failureUrl("/connection?error=true") // <- when login failed
                .permitAll() // permit any user to login
                .and()
                .logout()
                //.logoutUrl("/perform_logout") // <- only POST supported but we use GET with a <href>
                .logoutRequestMatcher(new AntPathRequestMatcher("/perform_logout")) // <- support any HTTP method + url of the <href>
                .logoutSuccessUrl("/connection") // <- when logout succeed
                .deleteCookies("JSESSIONID")
                .and()
                .authorizeRequests()
                //TODO : authorized path by user role
                .anyRequest()
                .permitAll();
    }

    /*
     *  Configuration for encrypting a password
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}