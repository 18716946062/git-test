package com.test.controller;

import com.test.entity.VO.ErrorCodeExportVo;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class ExportController {
    /**
     * 错误码导出
     */
    @GetMapping(value = "/errorExport")
    public void ErrorExport(HttpServletResponse response) {
      try {
            ArrayList<ErrorCodeExportVo> list = new ArrayList<>();
            for (int i = 1; i <101 ; i++) {
               list.add(new ErrorCodeExportVo("name"+i, new Date(), i));
            }
//           ExportParams exportParams = new ExportParams("errors", "errors");
//          exportParams.setType(ExcelType.XSSF);
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), ErrorCodeExportVo.class, list);
//          ExcelExportUtil.closeExportBigExcel();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssSSS");
            String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
            // 指定下载的文件名--设置响应头
            response.setHeader("Content-Disposition", "attachment;filename=" + "errors-" + dateTime + ".xlsx");
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            // 写出数据输出流到页面
            OutputStream output = response.getOutputStream();
            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
            workbook.write(bufferedOutPut);
            bufferedOutPut.flush();
            bufferedOutPut.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
      }
    }

}
