package com.test.entity.VO.mysql;

import lombok.Data;

import java.io.Serializable;

@Data
public class InstanceBase implements Serializable {
    private static final long serialVersionUID = 1L;
    private MysqlData data;
    private Long code;
    private String message;
}
