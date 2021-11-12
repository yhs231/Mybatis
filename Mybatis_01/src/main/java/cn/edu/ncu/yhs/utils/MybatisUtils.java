package cn.edu.ncu.yhs.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
//获取资源
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
//创建执行sql的对象SqlSession
    public static SqlSession getSqlSession(){
      return sqlSessionFactory.openSession();
    }
}
