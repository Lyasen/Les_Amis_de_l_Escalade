package fr.lyasen.climbing.domaine.properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/**
 * Declare a MessageRessource Spring Bean to load validation.properties automatically by Spring in memory
 */
@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/Scss/**", "/img/**")
                .addResourceLocations("classpath:/static/Scss/", "classpath:/static/img/")
                .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS));
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        //  load file : messages.properties
        messageSource.setBasename("locale/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public MessageSource validationMessage() {
        ReloadableResourceBundleMessageSource validate = new ReloadableResourceBundleMessageSource();
        // load file : validation.properties
        validate.setBasename("locale/validation");
        validate.setDefaultEncoding("UTF-8");
        return validate;
    }
}
