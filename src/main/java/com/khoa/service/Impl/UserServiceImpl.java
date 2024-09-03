package com.khoa.service.Impl;


import com.khoa.config.JwtProvider;
import com.khoa.modal.User;
import com.khoa.repository.UserRepository;
import com.khoa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt) {
        String email = JwtProvider.getEmailFromToken(jwt);
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
