package com.test.entity.VO.es;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Source implements Serializable {

    @JSONField(name="@timestamp")
    private LocalDateTime timestamp;

    private EsSystem system;

    private EsHost host;
}
