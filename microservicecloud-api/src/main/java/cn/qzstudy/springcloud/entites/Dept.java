package cn.qzstudy.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author Q Z
 * @date 2019/11/13-13:55
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库


    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(1L).setDb_source("1111").setDname("hao");
        System.out.println(dept);
    }
}
