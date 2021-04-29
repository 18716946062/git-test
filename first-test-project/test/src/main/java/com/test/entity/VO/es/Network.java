package com.test.entity.VO.es;

import com.alibaba.fastjson.annotation.JSONField;
import com.test.entity.VO.mysql.Values;
import lombok.Data;

import java.io.Serializable;

@Data
public class Network implements Serializable {

    /**
     * 网卡入口包大小
     */
    @JSONField(name="sum_in")
    private Values in;

    /**
     * 网卡出口包大小
     */
    @JSONField(name="sum_out")
    private Values out;

    /**
     * 返回时 要的时间
     */
    @JSONField(name="key_as_string")
    private String time;



}
