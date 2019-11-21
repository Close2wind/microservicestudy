package cn.qzstudy.springcloud.controller;

import cn.qzstudy.springcloud.entites.Dept;
import cn.qzstudy.springcloud.service.DeptClientService;
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
//    private String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Resource
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }



}
