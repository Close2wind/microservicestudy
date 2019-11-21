package cn.qzstudy.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Q Z
 * @date 2019/11/21-11:50
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;


    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName: "+applicationName+"\t eurekaServers: "+eurekaServers+"\t port: "+port;
        System.out.println("*******str: "+str);
        return "applicationName: "+applicationName+"\t eurekaServers: "+eurekaServers+"\t port: "+port;
    }
}