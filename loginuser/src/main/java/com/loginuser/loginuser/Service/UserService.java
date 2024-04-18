package com.loginuser.loginuser.Service;

import java.util.List;
import com.loginuser.loginuser.Dto.UserDTO;
import com.loginuser.loginuser.Entity.User;

public interface UserService {
    User register(UserDTO userDTO);
    User login(UserDTO userDTO);
    void logout(UserDTO userDTO);
    User findByEmail(String email);
    List<User> findAllUsers();
}
