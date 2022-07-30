package com.rjs.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rjs.mybatisplus.mapper.UserMapper;

import com.rjs.mybatisplus.pojo.User;
import com.rjs.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: 软件手
 * @date: 2022/7/31 1:01
 * @description:
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
