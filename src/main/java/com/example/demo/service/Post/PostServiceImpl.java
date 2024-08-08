package com.example.demo.service.Post;

import com.example.demo.model.vo.PostInfoVO;
import com.example.demo.repository.Post.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements IPostService {

    @Autowired
    private IPostRepository postRepository;

    public List<PostInfoVO> query () {
        return postRepository.query();
    }
}
