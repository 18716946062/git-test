package com.test.entity.dto;

import com.test.entity.VO.es.Cpu;
import com.test.entity.VO.es.Filesystem;
import com.test.entity.VO.es.Memory;
import com.test.entity.VO.es.Network;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class EsDto implements Serializable {

    private String cores;

    private String diskTotal;

    private String memoryTotal;

    private String localIp;

    private String remoteIp;

    private String platform;

    private List<Cpu> cpuPercentList;

    private List<Memory> memoryPercentList;

    private List<Filesystem> diskPercentList;

    private List<Network> inOutNetworkList;

}
