package com.suncreate.bigdata.washout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EscapeMysql2LibraApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscapeMysql2LibraApplication.class, args);
    }

}
