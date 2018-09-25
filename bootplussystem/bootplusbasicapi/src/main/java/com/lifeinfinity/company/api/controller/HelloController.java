package com.lifeinfinity.company.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Created By: zhangyuhang@gridsum.com
 * @Description:
 * @Date: Created on 2018/9/15
 * @Modified By:
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
