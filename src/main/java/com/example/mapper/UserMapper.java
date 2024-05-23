package com.example.mapper;

import com.example.domain.UserDO;
import com.example.domain.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description :
 */
@Mapper
public interface UserMapper {

    List<UserDO> selectAll(UserQuery userQuery);
}
