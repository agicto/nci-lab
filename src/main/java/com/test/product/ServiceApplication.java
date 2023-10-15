package com.test.product;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 
 * @version v1.0.0
 * @date 2023/10/7 17:03
 */
@Slf4j
@SpringBootApplication
@MapperScan({"com.test.product.mapper"})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
