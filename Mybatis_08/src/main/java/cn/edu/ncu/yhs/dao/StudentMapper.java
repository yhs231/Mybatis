package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    //查询学生
    List<Student>  inserts(Map map );

    //遍历输出
    List<Student> query(Map map);


}
