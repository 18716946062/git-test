package com.test.entity.VO.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

@Data
public class SenAndRec implements Serializable {

//    @JSONField(name="key_as_string")
//    private String time;

    private String time;

    @JSONField(name="max_sent")
    private Values maxSent;
    @JSONField(name="min_sent")
    private Values minSent;
    @JSONField(name="max_received")
    private Values maxReceived;
    @JSONField(name="min_received")
    private Values minReceived;

    //返回
    private Values sumRec;
    private Values sumSent;
}
