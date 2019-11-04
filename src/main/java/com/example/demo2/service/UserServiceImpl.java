package com.example.demo2.service;

import com.example.demo2.dao.UserDao;
import com.example.demo2.vo.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userdao;

    @Override
    public UserDb findById(Long findById) {
        UserDb user = userdao.getOne(findById);
        return user;
    }
}
