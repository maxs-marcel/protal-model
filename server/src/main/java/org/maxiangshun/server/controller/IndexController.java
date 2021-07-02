package org.maxiangshun.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Maxs.Marcel
 * @since 2021/7/2
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping({"", "index"})
    public String indexPage(){
        return "index";
    }
}
