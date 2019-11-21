package cn.qzstudy.springcloud.controller;

import cn.qzstudy.springcloud.entites.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/13-19:22
 */
@RestController
public class DeptControllerConsumer {

//    private String REST_URL_PREFIX = "http://localhost:8001";
    private String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list/", List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);

    }


}
