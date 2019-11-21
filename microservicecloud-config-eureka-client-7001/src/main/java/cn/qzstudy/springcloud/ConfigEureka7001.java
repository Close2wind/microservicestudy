package cn.qzstudy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Q Z
 * @date 2019/11/21-16:14
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka7001.class,args);
    }
}
