package com.lanyuan.controller.student;

import com.lanyuan.util.Common;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
    public String index(){

        return Common.BACKGROUND_PATH + "/stu/role/list";
    }



}
