package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class EsHost implements Serializable {
    /**
     * 主机名
     */
    private String hostname;

    private Os os;
}
