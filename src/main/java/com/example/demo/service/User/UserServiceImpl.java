package com.example.demo.service.User;

import com.example.demo.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.User.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public UserInfoVO getUserInfo () {
        return userRepository.findUserInfo();
    }
}
