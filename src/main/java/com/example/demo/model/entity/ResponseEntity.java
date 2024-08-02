package com.example.demo.model.entity;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private T data;

    public ResponseEntity(T data) {
        this.data = data;
    }
}
