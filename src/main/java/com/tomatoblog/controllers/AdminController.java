package com.tomatoblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/5/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminController {
    @RequestMapping(value="/admin", method= RequestMethod.GET)
    public String index(ModelMap map){
        return "/admin/index";
    }
}
