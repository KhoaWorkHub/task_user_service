package com.khoa.service;

import com.khoa.modal.User;

import java.util.List;

public interface UserService {

    User getUserProfile(String jwt);

    List<User> getAllUsers();
}
