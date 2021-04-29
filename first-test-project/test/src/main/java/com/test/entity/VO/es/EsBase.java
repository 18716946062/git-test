package com.test.entity.VO.es;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

@Data
public class EsBase implements Serializable {

    @JSONField(name="_source")
    private Source source;


}
