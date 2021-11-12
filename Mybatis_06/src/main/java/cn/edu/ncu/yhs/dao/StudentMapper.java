package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {


      List<Student> getStu();

      List<Student> getStudent();

}
