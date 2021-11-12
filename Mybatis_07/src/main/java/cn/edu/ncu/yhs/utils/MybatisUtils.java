package cn.edu.ncu.yhs.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

   static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

    public static SqlSession getSqlSession(){
       //自动提交事务 Boolean值
      return sqlSessionFactory.openSession(true);
    }
}
