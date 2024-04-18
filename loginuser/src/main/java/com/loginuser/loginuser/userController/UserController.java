package com.loginuser.loginuser.userController;

import com.loginuser.loginuser.Dto.UserDTO;
import com.loginuser.loginuser.Entity.User;
import com.loginuser.loginuser.Service.impl.UserServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServiceIMPL userService;
    

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDTO userDTO) {
        User user = userService.register(userDTO);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDTO userDTO) {
        User user = userService.login(userDTO);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).build();
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<User> logout(@RequestBody UserDTO userDTO) {
        userService.logout(userDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();       
        return ResponseEntity.ok(users);
    }
}
