package com.test.entity.VO.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

@Data
public class OpenTab implements Serializable {

//    @JSONField(name="key_as_string")
//    private String time;

    private String time;

    @JSONField(name="sum_opentab")
    private Values sumOpentab;

}
