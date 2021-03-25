package com.sleepymango.blog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author sleepymango
 * @Date 2021/3/25 19:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private String status;
    private String message;
    private T data;
}