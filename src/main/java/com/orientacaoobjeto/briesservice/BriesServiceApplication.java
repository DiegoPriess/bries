package com.orientacaoobjeto.briesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BriesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BriesServiceApplication.class, args);
    }

   /* @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_bries?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        sessionFactory.setDataSource(dataSource);
        return sessionFactory;
    }*/
}
