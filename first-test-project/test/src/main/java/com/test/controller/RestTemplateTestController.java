package com.test.controller;

import com.test.entity.VO.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class RestTemplateTestController {

    @PostMapping("/restTemplateTest")
    public ResultVO restTemplateTest(@RequestBody List<String> l) {
        return new ResultVO(l);
    }

    @GetMapping("test")
    public String test(String s) {
        String str = s;
        return s;
    }

}
