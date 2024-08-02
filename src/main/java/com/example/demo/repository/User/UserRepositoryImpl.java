package com.example.demo.repository.User;

import com.example.demo.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserInfoVO findUserInfo () {
        String sql = "SELECT * FROM USER_INFO";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserInfoVO.class));
    }
}
