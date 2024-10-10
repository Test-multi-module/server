package com.api.config;

import com.api.controllers.ProductController;
import com.api.controllers.ReviewController;
import com.api.services.ProductService;
import com.api.services.ReviewService;
import com.db.models.Product;
import com.db.models.Review;
import com.db.services.ProductServiceDS;
import com.db.services.ReviewServiceDS;
import io.beanmapper.BeanMapper;
import io.beanmapper.config.BeanMapperBuilder;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.api", "com.db"})
public class ApiBeanConfig {
    @Bean
    public BeanMapper beanMapper(){return new BeanMapperBuilder().withoutDefaultConverters().build();}
}