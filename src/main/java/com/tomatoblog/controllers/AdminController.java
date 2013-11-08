package com.tomatoblog.controllers;

import com.tomatoblog.dao.PostDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/5/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminController {

    @Autowired
    public PostDAOImpl postDao;

    @RequestMapping(value="/admin", method= RequestMethod.GET)
    public String index(ModelMap map){
        List posts = postDao.getPosts();
        map.addAttribute("posts", posts);

        return "/admin/index";
    }

    @RequestMapping(value={"/admin/post/add", "/admin/post/edit"})
    public String postForm(ModelMap map){
        return "/admin/post/form";
    }
}
