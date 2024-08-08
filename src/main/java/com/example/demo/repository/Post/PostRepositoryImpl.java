package com.example.demo.repository.Post;

import com.example.demo.model.vo.PostInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl implements IPostRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<PostInfoVO> query () {
        String sql = "SELECT * FROM POST_INFO pi2";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(PostInfoVO.class));
    }
}
