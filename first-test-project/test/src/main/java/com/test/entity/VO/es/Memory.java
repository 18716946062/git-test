package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class Memory implements Serializable {
    /**
     * 内存总大小
     */
    private Long total;

    private Used used;

    private Actual actual;

}
