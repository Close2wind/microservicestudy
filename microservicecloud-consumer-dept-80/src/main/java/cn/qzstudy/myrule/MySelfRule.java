package cn.qzstudy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Q Z
 * @date 2019/11/15-16:32
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRuleQZ();//自定义为每个服务调用五次后，
    }
}
