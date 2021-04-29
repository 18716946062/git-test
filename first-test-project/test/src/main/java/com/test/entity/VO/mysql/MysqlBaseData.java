package com.test.entity.VO.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MysqlBaseData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer total;
    private List<MysqlData> list;
    private String token;
}
