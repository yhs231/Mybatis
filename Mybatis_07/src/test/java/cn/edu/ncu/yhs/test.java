package cn.edu.ncu.yhs;

import cn.edu.ncu.yhs.dao.StudentMapper;
import cn.edu.ncu.yhs.dao.TeacherMapper;
import cn.edu.ncu.yhs.pojo.Student;
import cn.edu.ncu.yhs.pojo.Teacher;
import cn.edu.ncu.yhs.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
 @Test
 public void test1(){
     SqlSession sqlSession = MybatisUtils.getSqlSession();
     TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
     List<Teacher> teachers = mapper.getTeacher(1);
     for (Teacher teacher : teachers) {
         System.out.println(teacher);
     }
     sqlSession.close();
 }

}
