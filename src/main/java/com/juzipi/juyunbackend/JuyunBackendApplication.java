package com.juzipi.juyunbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.juzipi.juyunbackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class JuyunBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JuyunBackendApplication.class, args);
    }

}
