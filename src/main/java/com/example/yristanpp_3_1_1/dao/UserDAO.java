package com.example.yristanpp_3_1_1.dao;


import com.example.yristanpp_3_1_1.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();
    public void saveUsers(User user);
    public void deleteUsers(int id);
    public User getUsers(int id);
    public void updateUsers(User updateUsers);

}