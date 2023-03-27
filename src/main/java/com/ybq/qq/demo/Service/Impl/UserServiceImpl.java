package com.ybq.qq.demo.Service.Impl;

import com.ybq.qq.demo.Service.UserService;
import com.ybq.qq.demo.dao.UserMapper;
import com.ybq.qq.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(String account,String password) {
        User user = userMapper.selectById(account, password);
        if(user==null){
            return false;
        }else {
            if (account.equals(user.getAccount()) && password.equals(user.getPassword()))
                return true;
            else
                return false;
        }
    }
}
