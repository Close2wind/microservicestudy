package cn.qzstudy.springcloud;

import cn.qzstudy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author Q Z
 * @date 2019/11/13-19:40
 */

@EnableEurekaClient
@SpringBootApplication
//在启动该微服务的时候就能去加载我们自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class,args);
    }
}
