package com.task.haulmont.config;

import com.task.haulmont.dao.author.AuthorDao;
import com.task.haulmont.dao.author.AuthorDaoImpl;
import com.task.haulmont.service.author.AuthorService;
import com.task.haulmont.service.author.AuthorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.task.haulmont.service", "com.task.haulmont.dao"})
public class SpringConfig {
    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/haulmont?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("komajavadev");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
//    @Bean
//    public AuthorDao getAuthorDao(){
//        return new AuthorDaoImpl(getJdbcTemplate());
//    }
//    @Bean
//    public AuthorService getAuthorSerivce(){
//        return new AuthorServiceImpl();
//    }
}
