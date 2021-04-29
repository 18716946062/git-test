package com.test.entity.VO.mysql;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class BaseData implements Serializable {
    private static final long serialVersionUID = 1L;
    private MysqlBaseData data;
    private Long code;
    private String message;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public MysqlBaseData getData() {
        return data;
    }

    public void setData(MysqlBaseData data) {
        this.data = data;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
