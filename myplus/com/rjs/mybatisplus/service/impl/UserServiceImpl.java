package com.rjs.mybatisplus.service.impl;

import com.rjs.mybatisplus.entity.User;
import com.rjs.mybatisplus.mapper.UserMapper;
import com.rjs.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 软件手
 * @since 2022-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
