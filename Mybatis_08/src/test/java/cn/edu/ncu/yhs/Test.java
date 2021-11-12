package cn.edu.ncu.yhs;

import cn.edu.ncu.yhs.dao.StudentMapper;
import cn.edu.ncu.yhs.pojo.Student;
import cn.edu.ncu.yhs.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {


@org.junit.Test
public void test1(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
    HashMap map = new HashMap();
//    加入if判断 第八个Mybatis主要了解动态SQL
//    map.put("id",1);
     map.put("name","李四");
    List<Student> students = mapper.inserts(map);
    for (Student student : students) {
        System.out.println(student);
    }
    sqlSession.close();
}



   @org.junit.Test
    public void test2(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
       HashMap map = new HashMap();
       ArrayList<Integer> ids = new ArrayList<>();
       ids.add(1);
       ids.add(2);

       map.put("ids",ids);
       List<Student> querys = mapper.query(map);
       for (Student  query : querys) {
           System.out.println(query);
       }
       sqlSession.close();

   }

}
