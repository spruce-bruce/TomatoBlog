package com.tomatoblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        map.addAttribute("hello", "w00");
        return "/index";
    }
    
    // @RequestMapping(value="/viewdemo")
    // public String demo(@ModelAttribute("SpringWeb") Person person, ModelMap map){
    //     map.put("personObject", person);
    //     map.addAttribute("helloAgain", "Hello (again) spring from NB");
        
    //     return "demo";
    // }
}