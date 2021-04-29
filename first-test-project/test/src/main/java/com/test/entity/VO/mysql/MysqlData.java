package com.test.entity.VO.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MysqlData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String userId;
    private String name;
    private String aliasName;
    private Integer status;
    private Integer instanceType;
    private Integer instanceConfig;
    private String instanceVersion;
    private String userName;
    private String password;
    private String configs;
    private String topology;
    private Date createTime;
    private Date modifyTime;
    private List<Machines> machines;

}
