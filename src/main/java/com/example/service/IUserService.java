package com.example.service;

import com.example.domain.UserDO;
import com.example.domain.query.UserQuery;

import java.util.List;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description : 用户服务接口
 */
public interface IUserService {

    //查询（不用实体类传参）
    List<UserDO> queryTable(String userName);
    //查询（用实体类传参）
    List<UserDO> queryTable(UserQuery userQuery);
}
