package com.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy123
 * @since 2021-01-31
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> getDate(@Param("satrtTime") Date satrtTime,@Param("endTime") Date endTime);
}
