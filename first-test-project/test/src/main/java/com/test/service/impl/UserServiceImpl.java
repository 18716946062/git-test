package com.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zsy123
 * @since 2021-01-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void doThreadPool(){
        //todo 多线程
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
         for (int i = 0 ; i < 100 ; i++){
            final int finalint = i;
            threadPool.execute(() -> {
                try {
                    User user = new User(null, "zw" + finalint, finalint, "男", "重庆",new Date());
                    System.out.println(Thread.currentThread().getName()+" 开始执行");
                    long startTime = System.currentTimeMillis();
                    long endTime = System.currentTimeMillis();
                    System.out.println("请求时间： "+(endTime - startTime));
                    this.save(user);
                    System.out.println(Thread.currentThread().getName()+" 结束执行");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }

    @Override
    @Async
    public void Asyn(Integer i) {
        try {
            User user = new User(null, "zw" + i, i, "男", "重庆",new Date());
            System.out.println(Thread.currentThread().getName()+" 开始执行");
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            System.out.println("请求时间： "+(endTime - startTime));
            this.save(user);
            System.out.println(Thread.currentThread().getName()+" 结束执行");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
