package com.tomatoblog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.apache.commons.dbcp.BasicDataSource;

import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tomatoblog.controllers", "com.tomatoblog.dao"})
@PropertySource({"classpath:db.properties", "classpath:hibernate.properties"})
public class WebConfig extends WebMvcConfigurerAdapter {
    @Value("${jdbc.driver}") private String jdbcDriver;
    @Value("${jdbc.url}") private String jdbcUrl;
    @Value("${jdbc.username}") private String jdbcUsername;
    @Value("${jdbc.password}") private String jdbcPassword;

    @Value("${hibernate.dialect}") private String hibernateDialect;
    @Value("${hibernate.show_sql}") private String hibernateShowSql;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(jdbcDriver);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[]{"com.tomatoblog.domain"});

        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory().getObject());
        return txManager;
    }

	@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    Properties hibernateProperties(){
        return new Properties(){
            {
                setProperty("hibernate.dialect", hibernateDialect);
            }
        };
    }
}
