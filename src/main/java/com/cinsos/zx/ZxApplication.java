package com.cinsos.zx;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com/cinsos/zx/mapper")//扫描manpper得包
@ServletComponentScan("com/cinsos/zx/service")
public class ZxApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxApplication.class, args);
        }

        }
