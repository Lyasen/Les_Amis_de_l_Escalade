package fr.lyasen.climbing.domaine.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
}
