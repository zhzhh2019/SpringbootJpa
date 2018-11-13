package com.myproject.service;

import com.myproject.dao.UserDao;
import com.myproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    UserDao userDao;
    /**
     * 返回全部数据
     * @return
     */
    public List<User> getAllUser() {
        return  userDao.findAll();
    }
    public User findUserById(int id){
        return userDao.findUserById(id);
    }
}
