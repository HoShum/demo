package com.example.controller;

import com.example.common.R;
import com.example.domain.UserDO;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description :
 */
@RestController
@RequestMapping(value = "/demo/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/table")
    public R<List<UserDO>> findAllUser(@RequestParam(value = "userName") String userName) {
        List<UserDO> users = userService.queryTable(userName);
        return R.OK(users, "查询成功");
    }
}
