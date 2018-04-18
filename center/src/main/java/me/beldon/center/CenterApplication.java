package me.beldon.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Beldon
 */
@SpringBootApplication
@EnableEurekaServer
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }
}