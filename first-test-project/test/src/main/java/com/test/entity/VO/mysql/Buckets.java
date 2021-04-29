package com.test.entity.VO.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;


@Data
public class Buckets implements Serializable {


    private String time;

    @JSONField(name="max_select")
    private Values maxSelect;
    @JSONField(name="min_select")
    private Values minSelect;

    @JSONField(name="max_delete")
    private Values maxDelete;
    @JSONField(name="min_delect")
    private Values minDelete;

    @JSONField(name="max_insert")
    private Values maxInsert;
    @JSONField(name="min_insert")
    private Values minInsert;

    @JSONField(name="max_update")
    private Values maxUpdate;
    @JSONField(name="min_update")
    private Values minUpdate;

    //返回的数据
    private Values sumSelect;
    private Values sumDelete;
    private Values sumInsert;
    private Values sumUpdate;

}
