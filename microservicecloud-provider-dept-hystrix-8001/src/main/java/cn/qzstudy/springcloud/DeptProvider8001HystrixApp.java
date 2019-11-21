package cn.qzstudy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * @Author Q Z
 * @date 2019/11/13-15:39
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrix熔断机制的支持
public class DeptProvider8001HystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001HystrixApp.class,args);
    }
}
