package org.shadow.mall.shadowmalleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShadowMallEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShadowMallEurekaServerApplication.class, args);
	}

}
