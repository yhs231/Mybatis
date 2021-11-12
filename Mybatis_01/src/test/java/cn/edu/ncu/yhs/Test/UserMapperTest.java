package cn.edu.ncu.yhs.Test;

import cn.edu.ncu.yhs.dao.UserMapper;
import cn.edu.ncu.yhs.pojo.User;
import cn.edu.ncu.yhs.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test1(){
         SqlSession sqlSession = null;
        try {
            //获取参数
             sqlSession = MybatisUtils.getSqlSession();
            //获取接口类，并执行里面的相关方法
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            // 关闭连接
            sqlSession.close();
        }
    }
    @Test
    public void test2(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(2);
            System.out.println(userById);
        } catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }
    //增删改需要提交事务
    @Test
    public void test3(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.insert(new User(4, "丁文强", "135791"));
            System.out.println(i);
            sqlSession.commit();
        } catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }
    //增删改需要提交事务
    @Test
    public void test4(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.updateUser(new User(4, "谢老版", "135790"));
            System.out.println(i);
            sqlSession.commit();
        } catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }
    //增删改需要提交事务
    @Test
    public void test5(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.deleteUser(4);
            System.out.println(i);
            sqlSession.commit();
        } catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }

    //用map测试
    @Test
    public void mapTest6(){
        SqlSession sqlSession=null;
        try{
             sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> map=new HashMap<String,Object>();

            //注意的是map表示键值对，所以一个参数对应一个map.put();
            map.put("username","王三麻子");
            map.put("id",3);
            mapper.updateUser2(map);
            sqlSession.commit();
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }
    
    //模糊查询
    @Test
    public void likeTest(){
        SqlSession sqlSession=null;
        try{
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userLike = mapper.getUserLike("%李%");
            for (User user : userLike) {
                System.out.println(user);
            }
            sqlSession.commit();
        } catch(Exception e ){
            e.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }
}
