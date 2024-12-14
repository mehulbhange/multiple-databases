package com.learn.multiple_databases.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class PostgresDatabaseConfig {

    @ConfigurationProperties("spring.datasource.pg")
    @Bean
    public DataSourceProperties postgresDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource postgresDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(postgresDataSourceProperties().getUrl());
        dataSource.setUsername(postgresDataSourceProperties().getUsername());
        dataSource.setPassword(postgresDataSourceProperties().getPassword());
        //dataSource.setDriverClassName(dataSourceProperties().getDriverClassName());

        System.out.println("Driver Manager Data Source: " + dataSource);

        return dataSource;
    }

}
