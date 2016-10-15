package com.cn.java.controller;

  
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.java.data.model.User;
import com.cn.java.service.IUserService;
import com.cn.java.service.IZixuntypeService;  
  
  
@Controller  
@RequestMapping("/user")  
public class ZixuntypeController {  
    @Resource  
    private IZixuntypeService zixuntypeService;  
      
    @Resource
    private IUserService userService;
    
    @RequestMapping("/showUser")
    @ResponseBody
    public Model showUser(HttpServletRequest request,Model model){  
        int id = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(id);  
        model.addAttribute("user", user);  
        return model;  
    }  
}  