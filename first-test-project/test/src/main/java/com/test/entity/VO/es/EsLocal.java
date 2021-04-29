package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class EsLocal implements Serializable {
    /**
     * 本地ip
     */
    private String ip;
}
