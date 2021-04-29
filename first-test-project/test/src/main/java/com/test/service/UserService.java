package com.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.entity.User;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy123
 * @since 2021-01-31
 */
public interface UserService extends IService<User> {
    public void doThreadPool();
    public void Asyn(Integer i);
}
