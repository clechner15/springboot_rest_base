package com.lechner.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class DemoApplication.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lechner.demo.termin")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages  = "com.lechner.demo.termin")
@EntityScan(basePackages  = "com.lechner.demo.termin")
public class DemoApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	
	

}
