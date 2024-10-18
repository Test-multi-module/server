package com.api.config;

import com.db.schema.config.DatabaseConfig;
import com.db.schema.config.FlywayConfig;
import io.beanmapper.BeanMapper;
import io.beanmapper.config.BeanMapperBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.api", "com.db", "com.db.schema"})
@Import({DatabaseConfig.class, FlywayConfig.class})
public class ApiBeanConfig {

    @Bean
    public BeanMapper beanMapper(){
        return new BeanMapperBuilder().withoutDefaultConverters().build();
    }
}