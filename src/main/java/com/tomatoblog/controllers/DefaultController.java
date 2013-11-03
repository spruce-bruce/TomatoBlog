package com.tomatoblog.controllers;

import com.tomatoblog.dao.JdbcPostDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    JdbcPostDAOImpl postDAO;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(ModelMap map){
        //JdbcPostDAOImpl postDAO = new JdbcPostDAOImpl();
        int count = postDAO.getPostCount();
        map.addAttribute("hello", Integer.toString(count));
        return "/index";
    }
    
    // @RequestMapping(value="/viewdemo")
    // public String demo(@ModelAttribute("SpringWeb") Person person, ModelMap map){
    //     map.put("personObject", person);
    //     map.addAttribute("helloAgain", "Hello (again) spring from NB");
        
    //     return "demo";
    // }
}