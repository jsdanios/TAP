package com.tts.PizzaApp.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PizzaControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private PizzaController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        assertNotNull(controller);
    }

    @Test
    void doesThisWork() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("pizza");
    }
    
}