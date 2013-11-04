package com.tomatoblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author aaron
 */
@Controller
public class DefaultController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("hello", "test run");
        return "/index";
    }
}