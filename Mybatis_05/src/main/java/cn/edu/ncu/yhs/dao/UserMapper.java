package cn.edu.ncu.yhs.dao;

import cn.edu.ncu.yhs.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    //必须注册绑定到核心配置文件中去实现接口
    //查询所有用户
    //使用注解编程：关于@Param("")必须加在参数类型前，一个参数时可以不用，但最好用
    @Select("select * from user")
    List<User> getUserList1();


    //方法存在多个参数，必须在参数前加@Param("")
    @Select("select * from user where id=#{id}")
    User getUser(@Param("id") int id);

}
