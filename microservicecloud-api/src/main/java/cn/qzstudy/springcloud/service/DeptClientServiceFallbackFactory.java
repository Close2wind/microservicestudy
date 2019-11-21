package cn.qzstudy.springcloud.service;

import cn.qzstudy.springcloud.entites.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/20-13:54
 */

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息，null---@HystrixCommand").setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
