package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class EsSocket implements Serializable {

    private EsRemote remote;

    private EsLocal local;

}
