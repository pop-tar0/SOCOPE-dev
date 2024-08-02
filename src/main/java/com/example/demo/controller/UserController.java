package com.example.demo.controller;

import com.example.demo.model.entity.ResponseEntity;
import com.example.demo.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.User.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public ResponseEntity<UserInfoVO> login () {
        UserInfoVO userInfo = userService.getUserInfo();
        return new ResponseEntity<>(userInfo);
    }
}
