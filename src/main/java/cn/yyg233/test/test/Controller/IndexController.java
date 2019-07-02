package cn.yyg233.test.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yige.yyg
 * @date 2019-07-01 10:28 PM
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
