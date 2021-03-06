package com.sleepymango.blog.service;

import com.sleepymango.blog.entity.User;

/**
 * @Description:
 * @Author sleepymango
 * @Date 2021-03-24 13:54:51
 */
public interface UserService {
    /**
     * 通过用户ID查找用户
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 通过用户名查找用户
     * @param name
     * @return
     */
    User findByName(String name);
}