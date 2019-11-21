package cn.qzstudy.springcloud.service;

import cn.qzstudy.springcloud.entites.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/13-15:23
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept find(Long id);

    public List<Dept> list();
}
