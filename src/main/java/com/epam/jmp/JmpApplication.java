package com.epam.jmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmpApplication.class, args);
    }

    // Introduce a configuration(using @Configuration) which should have a method annotated with @Bean which returns a configured data source instance.
	/*@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:db");
		dataSource.setUsername( "user" );
		dataSource.setPassword( "pass" );
		return dataSource;
	}*/
}
