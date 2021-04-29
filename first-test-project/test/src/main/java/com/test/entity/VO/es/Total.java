package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class Total implements Serializable {

    /**
     * cpu使用总的百分比
     */
    private Double pct;
}
