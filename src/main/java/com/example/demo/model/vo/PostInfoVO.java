package com.example.demo.model.vo;

import lombok.Data;

@Data
public class PostInfoVO {
    private String posterPhotoUrl;
    private String posterName;
    private String content;
    private String postImgUrl;
    private String likeQty;
    private String postedTime;
}
