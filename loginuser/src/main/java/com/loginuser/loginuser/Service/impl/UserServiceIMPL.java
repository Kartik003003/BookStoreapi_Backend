package com.loginuser.loginuser.Service.impl;

import com.loginuser.loginuser.Dto.UserDTO;
import com.loginuser.loginuser.Entity.User;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL  {

    @Autowired
    private com.loginuser.loginuser.Repo.UserRepository userRepository;

    public User register(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword((userDTO.getPassword()));
        user.setFullname(userDTO.getFullname());
        user.setUsern(userDTO.getUsern());
        user.setRole(userDTO.getRole());
        user.setLogindate(userDTO.getLoginDate());
        user.setLogintime(userDTO.getLoginTime());
        return userRepository.save(user);
    }

    public User login(UserDTO userDTO) {
        User user = userRepository.findByEmail(userDTO.getEmail());

        if (user != null && user.getPassword().equals(userDTO.getPassword()) && user.getEmail().equals(userDTO.getEmail()) && user.getRole().equals(userDTO.getRole())) {
            Date currentDate = new Date();
            user.setLogindate(Date.from(currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            user.setLogintime(new Date());
            userRepository.save(user);
            return user;
        } else {
            return null;
        }
    }

    public void logout(UserDTO userDTO) {
        User user = userRepository.findByEmail(userDTO.getEmail());

        if (user != null && user.getEmail().equals(userDTO.getEmail())) {
            user.setLogintime(new Date());
            userRepository.save(user);
        }
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
