package cn.qzstudy.springcloud.rest;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Q Z
 * @date 2019/11/13-19:18
 */
@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RoundRobinRule();//轮训算法
//        return new RandomRule(); //随机算法
        return new RetryRule();//重试

    }



}
