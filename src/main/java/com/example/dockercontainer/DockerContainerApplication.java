package com.example.dockercontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerContainerApplication.class, args);
        System.out.println("ola mundo");
    }

}
