package com.suncreate.bigdata.washout.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.suncreate.bigdata.washout.repository.libra",
        entityManagerFactoryRef = "libraEntityManager",
        transactionManagerRef = "libraTransactionManager"
)
public class LibraDataSourceConfig {

    private final MultipleDataSourceProperties properties;

    public LibraDataSourceConfig(MultipleDataSourceProperties properties) {
        this.properties = properties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean libraEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(libraDataSource());
        em.setPackagesToScan("com.suncreate.bigdata.washout.model.libra");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaPropertyMap(properties.getLibra().getHibernate().getProperties());

        return em;
    }

    @Bean
    @ConfigurationProperties("spring.datasource.secondary")
    public DataSource libraDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean
    public PlatformTransactionManager libraTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(libraEntityManager().getObject());
        return transactionManager;
    }
}