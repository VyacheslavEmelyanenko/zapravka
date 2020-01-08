package ru.javabegin.zapravka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class ZapravkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZapravkaApplication.class, args);
    }

}
