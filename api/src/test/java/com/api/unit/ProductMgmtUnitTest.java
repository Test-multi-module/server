package com.api.unit;

import com.db.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test-profile")
public class ProductMgmtUnitTest {
   // @Autowired ProductRepository productRepository;
    @Test void testGetProductsRepository(){
       //todo
    }
}
