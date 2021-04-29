package com.test.entity.VO.es;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("server_montior")
public class ServerMonitor {

    //主机名-localip
    private String id;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    //主机名
    private String hostName;

    //操作系统
    private String hostOsName;

    //内存使用百分比
    @TableField("memory_actual_used_pct")
    private Double memoryActualUsedPct;

    //内存总数
//    private Long memoryTotal;
    private Long memoryFree;

    //内存已使用数
//    private Long memoryUsedBytes;
    @TableField("memory_actual_used_bytes")
    private Long memoryActualUsedBytes;

    //磁盘总大小
    @TableField("file_system_total")
    private Long filesystemTotal;

    //磁盘使用百分比
    @TableField("file_system_used_pct")
    private Double filesystemUsedPct;

    //磁盘使用大小
    @TableField("file_system_used_bytes")
    private Long filesystemUsedBytes;

    //cpu核心数
    private Integer cpuCores;

    //cpu使用百分比
    private Double cpuTotalPct;

    //ip
    private String localIp;

    //ip
    private String remoteIp;

    //采集时间
    private Date timestamp;
    //状态
    private Integer status;
}