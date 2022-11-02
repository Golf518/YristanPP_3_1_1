package com.example.yristanpp_3_1_1.service;

import com.example.yristanpp_3_1_1.model.User;
import org.springframework.stereotype.Service;



import java.util.List;
@Service
public interface UserService {
    public void updateUsers(User updaeUser);
    public void saveUsers (User user);
    public void deleteUsers (int id);
    public User getUsers(int id);
    public List<User> getAllUser();
}