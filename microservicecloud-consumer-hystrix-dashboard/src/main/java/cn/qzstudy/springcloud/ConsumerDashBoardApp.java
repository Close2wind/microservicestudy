package cn.qzstudy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author Q Z
 * @date 2019/11/20-19:43
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDashBoardApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashBoardApp.class,args);
    }
}
