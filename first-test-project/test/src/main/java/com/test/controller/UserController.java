package com.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.entity.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zsy123
 * @since 2021-01-31
 */
@Controller
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @GetMapping("/testUser")
    @ResponseBody
    public List<User> testUser() {
        List<User> list = userMapper.selectList(new QueryWrapper<>());
         return list;
    }

    @GetMapping("/testDate")
    public List<User> testDate(@RequestParam(value = "satrtTime",required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date satrtTime,
                               @RequestParam(value = "endTime",required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date endTime) {
        List<User> list = userMapper.getDate(satrtTime, endTime);
        return list;
    }
}

