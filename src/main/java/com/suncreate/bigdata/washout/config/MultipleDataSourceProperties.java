package com.suncreate.bigdata.washout.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class MultipleDataSourceProperties {

    private MysqlDataSourceProperties mysql = new MysqlDataSourceProperties();

    private LibraDataSourceProperties libra = new LibraDataSourceProperties();

    @Data
    public static class MysqlDataSourceProperties {
        private HibernateProperties hibernate = new HibernateProperties();
    }

    @Data
    public static class LibraDataSourceProperties {
        private HibernateProperties hibernate = new HibernateProperties();
    }

    @Data
    public static class HibernateProperties {
        private Map<String, String> properties = new HashMap<>();
    }

}