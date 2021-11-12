package cn.edu.ncu.yhs.test;

import cn.edu.ncu.yhs.dao.UserMapper;
import cn.edu.ncu.yhs.pojo.User;
import cn.edu.ncu.yhs.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest02{

    static Logger logger= Logger.getLogger(UserMapperTest02.class);
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            //获取接口类，并执行里面的相关方法
        logger.info("info:进入成功");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList1();
            for (User user : userList) {
                System.out.println(user);
            }
            sqlSession.close();

    }


    @Test
    public void pageTest(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            logger.info("info:进入成功") ;
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("startIndex",0);
            map.put("pageSize",3);
            List<User> userPage = mapper.getUserPage(map);
            for (User user : userPage) {
                System.out.println(user);
            }
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }







    }

}