package com.test.entity.VO.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

@Data
public class Connect implements Serializable {


    private String time;

    @JSONField(name="min_connections")
    private Values minConnections;
    @JSONField(name="max_connections")
    private Values maxConnections;

    //返回的
    private Values connections;

}
