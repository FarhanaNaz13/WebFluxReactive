package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class SpringWebFlux {
        static {
        BlockHound.install();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringWebFlux.class, args);
    }
}
