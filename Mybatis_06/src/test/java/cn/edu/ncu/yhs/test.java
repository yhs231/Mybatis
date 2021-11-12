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
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> stu = mapper.getStu();
        for (Student student : stu) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> sits = mapper.getStudent();
        for (Student sit : sits) {
            System.out.println(sit);
        }
        sqlSession.close();
    }

}
