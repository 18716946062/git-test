package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cpu implements Serializable {

    private Total total;

    /**
     * cpu核数
     */
    private Integer cores;
}
