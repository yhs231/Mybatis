package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
     @Select("select * from Mybatis.teacher")
    Teacher getTeacher(@Param("id") int id);
}
