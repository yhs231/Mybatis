package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    //查询所有用户
    List<User> getUserList1();
    //分页
    List<User> getUserPage(Map<String,Object> map );

}
