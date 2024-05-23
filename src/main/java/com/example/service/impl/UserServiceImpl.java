package com.example.service.impl;

import com.example.domain.UserDO;
import com.example.domain.query.UserQuery;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description : 用户服务实现类
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> queryTable(String userName) {
        UserQuery userQuery = new UserQuery();
        userQuery.setUserName(userName);
        return this.queryTable(userQuery);
    }

    @Override
    public List<UserDO> queryTable(UserQuery userQuery) {
        return userMapper.selectAll(userQuery);
    }
}
