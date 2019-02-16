package com.bdqn.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bdqn.dao.UserDao;
import com.bdqn.pojo.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public User findByPhonePwd(String phone, String pwd) throws Exception {
        User user=this.findByPhone(phone);
        if(user!=null && user.getPassword().equals(pwd)){
            return user;
        }
        return null;
    }

    @Override
    public int addUser(User user) throws Exception {
        return userDao.addUser(user);
    }

    @Override
    public int update(User user) throws Exception {
        return userDao.update(user);
    }

    @Override
    public int deleteUser(int id) throws Exception {
        return userDao.deleteUser(id);
    }

    @Override
    public User findById(int id) throws Exception {
        return userDao.findById(id);
    }

    @Override
    public User findByPhone(String phone) throws Exception {
        return userDao.findByPhone(phone);
    }
}
