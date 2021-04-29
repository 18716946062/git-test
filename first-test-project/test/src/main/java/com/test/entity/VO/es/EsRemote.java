package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class EsRemote implements Serializable {

    /**
     * 远程ip
     */
    private String ip;
}
