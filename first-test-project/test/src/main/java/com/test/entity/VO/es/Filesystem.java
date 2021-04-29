package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class Filesystem implements Serializable {

    /**
     * 磁盘总大小
     * */
    private Long total;

    private Used used;
}
