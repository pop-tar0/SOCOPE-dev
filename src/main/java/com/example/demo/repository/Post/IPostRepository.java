package com.example.demo.repository.Post;

import com.example.demo.model.vo.PostInfoVO;

import java.util.List;

public interface IPostRepository {
    List<PostInfoVO> query ();
}
