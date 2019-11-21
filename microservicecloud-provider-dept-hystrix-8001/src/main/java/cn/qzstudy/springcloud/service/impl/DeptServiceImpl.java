package cn.qzstudy.springcloud.service.impl;

import cn.qzstudy.springcloud.dao.DeptDao;
import cn.qzstudy.springcloud.entites.Dept;
import cn.qzstudy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/13-15:24
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept find(Long id) {


        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        if(deptDao==null){
            System.out.println(11333);
        }
        return deptDao.findAll();
    }
}
