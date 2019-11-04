package com.example.demo2.dao;

import com.example.demo2.vo.UserDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends JpaRepository<UserDb,Long>{

}
