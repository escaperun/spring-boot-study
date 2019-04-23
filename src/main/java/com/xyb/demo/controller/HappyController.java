package com.xyb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luyang
 * @ClassName HappyController
 * @description 〈功能详细描述〉
 * @time 2019/4/1715:26
 * @modificationHistory <记录修改历史记录 who where what>
 */
@RestController
public class HappyController {

    @RequestMapping("/happy")
    public String Happy(){
        return "Hello SpringBoot!";
    }
}
