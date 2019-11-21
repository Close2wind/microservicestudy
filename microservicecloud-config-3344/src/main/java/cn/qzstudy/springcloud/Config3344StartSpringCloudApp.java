package cn.qzstudy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author Q Z
 * @date 2019/11/21-10:32
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config3344StartSpringCloudApp.class,args);
    }
}
