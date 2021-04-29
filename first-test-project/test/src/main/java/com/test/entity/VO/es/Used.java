package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class Used implements Serializable {

    /**
     * 使用率
     * */
    private Double pct;
}
