package com.dxy.artemis.totti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dxy.artemis.*"})
@MapperScan("com.dxy.artemis.totti.dao.mapper")
public class ArtemisTottiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisTottiApplication.class, args);
    }

}
