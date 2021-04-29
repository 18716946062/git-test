package com.test.entity.VO.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Machines implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String instanceId;
    private Integer machineType;
    private String machineName;
    private String port;
    private String userName;
    private String password;
    private String config;

}
