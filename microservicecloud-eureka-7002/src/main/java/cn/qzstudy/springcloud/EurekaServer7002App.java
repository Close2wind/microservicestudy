package cn.qzstudy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Q Z
 * @date 2019/11/13-20:12
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002App.class,args);
    }
}
