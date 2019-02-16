package com.bdqn.dao;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll()throws Exception;
    /**
     * 用户登陆 根据手机号和密码
     */
    @Select("select * from User where phone=#{phone} and password=#{pwd}")
    User findByPhonePwd(@Param(value="phone") String phone,@Param
            (value="pwd") String pwd)throws Exception;
    /**
     * 添加用户
     */
    @Insert("insert into value")
    int addUser(User user)throws Exception;
    /**
     * 修改用户
     */
    int update(User user)throws Exception;
    /**
     * 删除用户 根据id
     */
    int deleteUser(@Param(value="id") int id)throws Exception;
    /**
     * 根据id查询用户
     */
    User findById(@Param(value="id") int id)throws Exception;
    /**
     * 根据phone查询用户
     */
    User findByPhone(@Param(value="phone") String phone)throws Exception;


}
