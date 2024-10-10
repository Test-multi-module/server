package com.api.unit;

import com.api.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test-profile")
class ApiApplicationTests {

    @Autowired ProductController productController;

    @Value("${app.test}")
    private String test;
    @Test
    void contextLoads() throws Exception {
        assertThat(productController).isNotNull();
        assertEquals("word for test profile", test);
    }
}