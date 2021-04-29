package com.test.entity.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorCodeExportVo implements Serializable {
    @Excel(name = "名字")
    private String name;

    @Excel(name = "时间" ,exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date age;

    @Excel(name = "数量" )
    private Integer number;
}
