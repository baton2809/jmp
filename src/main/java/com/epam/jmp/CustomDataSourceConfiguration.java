package com.epam.jmp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class CustomDataSourceConfiguration {

    @Bean(name = "dataSource")
    @ConditionalOnMissingBean(DataSource.class)
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db");
        dataSource.setUsername( "user" );
        dataSource.setPassword( "pass" );
        return dataSource;
    }
}
