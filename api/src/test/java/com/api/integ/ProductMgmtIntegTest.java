package com.api.integ;

import com.api.dtos.filters.ProductFilter;
import com.api.dtos.models.ProductDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test-profile")
public class ProductMgmtIntegTest extends IntegTestBase{

    @LocalServerPort private int port;

    @Autowired private TestRestTemplate restTemplate;

    @Test
    void testGetProductsEndpoints() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/products/58",
                String.class)).contains("{\"rating\":5,\"id\":58,\"title\":\"new title1\",\"price\":65,\"description\":\"new desc1\",\"categories\":\"books\"}");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/products",
                String.class)).contains("{\"rating\":5,\"id\":58,\"title\":\"new title1\",\"price\":65,\"description\":\"new desc1\",\"categories\":\"books\"}");
    }

    @Test
    void testProductsSearch(){
        ProductFilter productFilter = ProductFilter.builder().price(24).build();
        String test = this.restTemplate.getForObject("http://localhost:" + port + "/search", String.class, productFilter);
    }
}