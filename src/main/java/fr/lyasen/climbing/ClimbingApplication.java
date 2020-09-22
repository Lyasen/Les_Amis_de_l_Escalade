package fr.lyasen.climbing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Scanner;

@SpringBootApplication
public class ClimbingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimbingApplication.class, args);
	}
}
