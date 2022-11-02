package com.example.yristanpp_3_1_1.service;

import com.example.yristanpp_3_1_1.dao.UserDAO;
import com.example.yristanpp_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
    private final UserDAO userDAO;
    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override

    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional
    public void updateUsers(User updateUser) {
        userDAO.updateUsers(updateUser);

    }

    @Override
    @Transactional
    public void saveUsers(User user) {
        userDAO.saveUsers(user);
    }


    @Override
    @Transactional
    public void deleteUsers(int id) {
        userDAO.deleteUsers(id);
    }


    @Override
    @Transactional
    public User getUsers(int id) {
        return userDAO.getUsers(id);
    }





}