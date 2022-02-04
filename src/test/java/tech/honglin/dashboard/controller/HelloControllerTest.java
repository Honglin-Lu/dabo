package tech.honglin.dashboard.controller;

import org.apache.logging.log4j.message.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;
import tech.honglin.dashboard.DashboardApplication;

import java.net.URI;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {


    @Test
    void testGet() {
//        TestRestTemplate testRestTemplate  = new TestRestTemplate();
//        ResponseEntity<String> response = testRestTemplate.getForEntity("http://localhost:8080/echo", String.class);
//        assertThat(response.getBody()).isEqualTo("hello world");
//        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void testEcho(){
        int a = 1;
        assertThat(a).isEqualTo(1);
    }

    @Test
    void testOut() {
        int a = 1;
        assertThat(a).isEqualTo(2);
    }
}