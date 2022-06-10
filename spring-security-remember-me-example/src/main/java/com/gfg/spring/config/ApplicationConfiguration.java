package com.gfg.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:database.properties")
public class ApplicationConfiguration {

  @Autowired
  private Environment environment;

  @Bean
  public DataSource getDataSource() {
    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(environment.getProperty("mysql.dirver"));
    basicDataSource.setUrl(environment.getProperty("mysql.jdbcUrl"));
    basicDataSource.setUsername(environment.getProperty("mysql.username"));
    basicDataSource.setPassword(environment.getProperty("mysql.password"));
    return basicDataSource;
  }
}
