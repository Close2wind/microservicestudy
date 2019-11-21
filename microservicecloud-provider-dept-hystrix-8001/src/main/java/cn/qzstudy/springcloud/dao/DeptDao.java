package cn.qzstudy.springcloud.dao;

import cn.qzstudy.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author Q Z
 * @date 2019/11/13-15:14
 */

@Mapper
public interface DeptDao {
    //@Insert("INSERT INTO dept(dname,db_source) VALUES (#{dname}, DATABASE())")
    public boolean addDept(Dept dept);

    //@Select("SELECT deptno,dname,db_source FROM dept WHERE deptno=#{deptno}")
    public Dept findById(Long id);

    //@Select("SELECT deptno,dname,db_source FROM dept")
    public List<Dept> findAll();

}
