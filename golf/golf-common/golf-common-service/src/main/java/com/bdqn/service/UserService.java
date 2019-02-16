package com.bdqn.service;

import com.bdqn.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll()throws Exception;
    User findByPhonePwd(String phone,String pwd)throws Exception;
    int addUser(User user)throws Exception;
    int update(User user)throws Exception;
    int deleteUser(int id)throws Exception;
    User findById(int id)throws Exception;
    User findByPhone(String phone)throws Exception;
}
