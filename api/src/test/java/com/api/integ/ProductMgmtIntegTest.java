package com.api.integ;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test-profile")
public class ProductMgmtIntegTest extends IntegTestBase{

    @LocalServerPort private int port;

    @Autowired private TestRestTemplate restTemplate;

    @Test@Disabled
    void testGetProductsEndpoints() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/products/58",
                String.class)).contains("{\"rating\":5,\"id\":58,\"title\":\"new title1\",\"price\":65,\"description\":\"new desc1\",\"categories\":\"books\"}");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/products",
                String.class)).contains("{\"rating\":5,\"id\":58,\"title\":\"new title1\",\"price\":65,\"description\":\"new desc1\",\"categories\":\"books\"}");
    }

    @Test
    void test() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/public/products/2",
                String.class)).contains("\"rating\":4,\"id\":2,\"title\":\"Space Odyssey\",\"price\":15,\"description\":\"Science fiction novel\",\"categories\":\"Books\"");
    }
}