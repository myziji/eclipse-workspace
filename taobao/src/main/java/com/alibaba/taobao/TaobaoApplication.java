package com.alibaba.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages="com.alibaba.taobao")
public class TaobaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaobaoApplication.class, args);
	}

}
