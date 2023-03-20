package com.epam.jmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.util.matcher.PathPatternParserServerWebExchangeMatcher;

import javax.sql.DataSource;


@Configuration
//@EnableWebFluxSecurity
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


	// Expose Default Spring Actuator by configuring SecurityWebFilterChain bean
	/*@Bean
	public SecurityWebFilterChain securityWebFilterChain(
			ServerHttpSecurity http) {
		return http.authorizeExchange()
				.pathMatchers("/actuator/**")
				.permitAll()
				.anyExchange()
				.authenticated()
				.and()
				.build();
	}*/
}
