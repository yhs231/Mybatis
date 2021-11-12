package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.Teacher;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher(@Param("tid")int id);
}
