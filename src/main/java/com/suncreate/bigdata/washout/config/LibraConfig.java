package com.suncreate.bigdata.washout.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "libraEntityManagerFactory" ,
        transactionManagerRef = "libraTransactionManager" ,
        basePackages = {"com.suncreate.bigdata.washout.repository.libra"} // 【1】
)
public class LibraConfig {

    @Autowired
    private HibernateProperties hibernateProperties;

    @Autowired
    private JpaProperties jpaProperties ;
    
   
    @Bean(name = "libraDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary") // 【2】
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
    

    @Bean(name = "libraEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("libraDataSource") DataSource dataSource , Environment environment
    ) {
        Map<String,Object> properties =
                hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(),new HibernateSettings());
        LocalContainerEntityManagerFactoryBean libra = builder
                .dataSource(dataSource)
                .packages("com.suncreate.bigdata.washout.model.libra") // 【3】
                .persistenceUnit("libra")
                .properties(properties)
                .build();
        return libra ;
    }
    

    @Bean(name = "libraTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("libraEntityManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}