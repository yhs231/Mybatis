package cn.edu.ncu.yhs.test;

import cn.edu.ncu.yhs.dao.UserMapper;
import cn.edu.ncu.yhs.pojo.User;
import cn.edu.ncu.yhs.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest02{
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            //获取接口类，并执行里面的相关方法
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList1();
            for (User user : userList) {
                System.out.println(user);
            }
            sqlSession.close();

    }

}