package cn.qzstudy.springcloud;

import cn.qzstudy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Q Z
 * @date 2019/11/13-19:40
 */

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"cn.qzstudy.springcloud"})
public class DeptConsumer80FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class,args);
    }
}
