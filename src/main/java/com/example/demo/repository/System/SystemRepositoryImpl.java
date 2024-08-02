package com.example.demo.repository.System;

import com.example.demo.model.vo.WebsiteAssetsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SystemRepositoryImpl implements ISystemRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public WebsiteAssetsVO findWebsiteAssets () {
        String sql = "SELECT * FROM WEBSITE_ASSETS wa";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(WebsiteAssetsVO.class));
    }
}
