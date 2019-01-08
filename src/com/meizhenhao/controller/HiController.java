package com.meizhenhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 梅真好
 * @company 京东商城（上海）
 * @create 2019-01-08 15:07
 */
@Controller
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("username","张三");

        return "say";
    }
}
