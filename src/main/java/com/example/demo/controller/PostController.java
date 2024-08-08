package com.example.demo.controller;

import com.example.demo.model.entity.ResponseEntityList;
import com.example.demo.model.vo.PostInfoVO;
import com.example.demo.service.Post.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private IPostService postService;

    @RequestMapping("/query")
    public ResponseEntityList<?> query () {
        List<PostInfoVO> post = postService.query();
        return new ResponseEntityList<>(post);
    }
}
