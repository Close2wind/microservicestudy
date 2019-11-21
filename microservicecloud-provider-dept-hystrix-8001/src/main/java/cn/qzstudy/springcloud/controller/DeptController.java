package cn.qzstudy.springcloud.controller;


import cn.qzstudy.springcloud.entites.Dept;
import cn.qzstudy.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/13-15:29
 */

@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrixFind")
    public Dept find(@PathVariable("id") Long id){
        Dept dept = deptService.find(id);
        if(dept==null){
            throw new RuntimeException("该ID："+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrixFind(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息，null---@HystrixCommand").setDb_source("no this database in MySQL");
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }


    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("**********************"+list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance serviceInstance : srvList) {
            System.out.println(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
        }
        return this.discoveryClient;

    }

}
