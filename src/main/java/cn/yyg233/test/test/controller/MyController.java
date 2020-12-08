package cn.yyg233.test.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/8
 */
@RequestMapping("/rest")
@Controller
public class MyController {


    @GetMapping("/getDdlTypeRule")
    @ResponseBody
    public DdlType getDdlTypeRule() {
        String defaultDdlRule = "{\"ALTERADDCOLUMN\":\"NORMAL\",\"ALTERDROPCOLUMN\":\"IGNORE\",\"ALTERRENAMECOLUMN\":\"WARNING\"}";
        DdlType ddlType = JSON.parseObject(defaultDdlRule,
            new TypeReference<DdlType>() {
        });
        return ddlType;
    }
}
