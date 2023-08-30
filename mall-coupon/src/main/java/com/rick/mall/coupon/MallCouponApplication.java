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
 *
 * 2. 细节：
 * 1) 命名空间：用于实现配置隔离
 * 		默认：public，默认新增的所有配置都在public
 * 		a. 开发，测试，生产：利用命名空间来做环境隔离
 * 		   注意在 bootstrap.properties 上配置 namespace:
 * 		   spring.cloud.nacos.config.namespace=fa811c74-b47e-43db-a433-aed178b6c185
 * 		b. 每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间。只加载自己的命名空间下的所有配置
 * 2) 配置集：所有的配置的集合
 * 3) 配置集ID：类似文件名（Data ID)。
 * 4) 配置集分组：
 * 		默认所有的配置集都属于 DEFAULT_GROUP：1111，618，1212
 * 项目中的使用：每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 */
@MapperScan("com.rick.mall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
