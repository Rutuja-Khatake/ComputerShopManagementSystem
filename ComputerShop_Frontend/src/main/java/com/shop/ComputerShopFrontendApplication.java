	package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.shop")
	public class ComputerShopFrontendApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(ComputerShopFrontendApplication.class, args);
	    }
	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

	}
	
