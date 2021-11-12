package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据ID查用户
    User getUserById(int id);
    //插入一个用户
    int insert(User user);
    //修改用户信息
    int updateUser(User user );
    //删除一个用户
    int deleteUser(int id);


    //万能map:解决不用new 对象的方法操作数据库对象
    // 修改用户信息
    int updateUser2(Map<String,Object> map);

    //模糊查询
    List<User> getUserLike(String name);

}
