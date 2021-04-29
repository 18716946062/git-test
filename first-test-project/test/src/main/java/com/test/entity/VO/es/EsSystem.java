package com.test.entity.VO.es;

import lombok.Data;

import java.io.Serializable;

@Data
public class EsSystem implements Serializable {

    private Network network;

    private Cpu cpu;

    private Memory memory;

    private Filesystem filesystem;

    private EsSocket socket;
}
