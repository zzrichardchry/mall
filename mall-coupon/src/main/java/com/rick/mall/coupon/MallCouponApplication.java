package com.rick.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 如何使用 Nacos 作为配置中心统一管理
 * 1) 引入依赖，并且在 application 里面添加对应的配置字段
 * 2) 创建一个 bootstrap.properties，新版 Spring Cloud 需要引入 spring-cloud-starter-bootstrap 依赖
 * 3) 在配置中心配置一个 dataID 配置
 * 4) 给应用名.properties 添加任何配置
 * 5) 动态获取配置：@RefreshScope 和 @Value("${配置项的名字}")，配置中心的值后加载，会覆盖。
 */
@MapperScan("com.rick.mall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
