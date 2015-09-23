/*
 * 
 */
package org.refme.refme_server_prototype.init;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author prashant
 */
@EnableTransactionManagement
@Configuration
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan({"org.refme.refme_server_prototype.init"})
public class HibernateConfiguration {

    
    @Autowired
    private Environment environment;
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        ds.setUrl(environment.getRequiredProperty("jdbc.url"));
        ds.setUsername(environment.getRequiredProperty("jdbc.username"));
        ds.setPassword(environment.getRequiredProperty("jdbc.password"));
        return ds;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean asfb = new LocalSessionFactoryBean();
        asfb.setDataSource(dataSource());
        asfb.setPackagesToScan(new String[]{"org.refme.refme_server_prototype.hib_pojo"});
        asfb.setHibernateProperties(hibernateProperties());
        return asfb;
    }
    
    @Bean
    public Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        return properties;
    }              
    
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sf){
        HibernateTransactionManager txMngr = new HibernateTransactionManager();
        txMngr.setDataSource(dataSource());
        txMngr.setSessionFactory(sf);
        return txMngr;
    }
}
