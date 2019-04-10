package com.jing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**开启发现服务功能*/
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	/**
	 * 帮助我们发送http请求的
	 * @return
	 */
	@LoadBalanced  //负载均衡机制
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
