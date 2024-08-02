package com.example.demo.model.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class ResponseEntityList<T> {

    private Map<String, Object> data = new HashMap<>();

    public ResponseEntityList(List<?> list) {
        this.data.put("list", list);
    }
}
