package com.test.entity.VO.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsData implements Serializable {
    private Double pct;
    private LocalDateTime time;

    /**
     * 返回时间字符串
     */
    private String returnTime;


    public EsData(Double pct, LocalDateTime time) {
        this.pct = pct;
        this.time = time;
    }

}
