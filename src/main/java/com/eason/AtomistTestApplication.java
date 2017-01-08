package com.eason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class AtomistTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtomistTestApplication.class, args);
    }
}
