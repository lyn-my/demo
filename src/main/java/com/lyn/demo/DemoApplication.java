package com.lyn.demo;

import com.lyn.demo.config.MyFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Configurable
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication .run(DemoApplication.class, args);
		//new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean(new MyFilter());
		registration.addUrlPatterns("/Demo/*"); //
		registration.addInitParameter("paramName", "paramValue"); //
		registration.setName("testFilter");
		registration.setOrder(1);
		return registration;
	}

}

