package com.test;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HttpServletBean;

@Controller

public class HelloController {

	@RequestMapping(value = "/")
    public String printHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "hello_world";
    }
	
	@RequestMapping(value = "/processLogin")
    public String getName(ModelMap modelMap,HttpServletRequest req){
String name=req.getParameter("username");
        // add attribute to load modelMap
        modelMap.addAttribute("username",name);

        // return the name of the file to be loaded "hello_world.jsp"
        return "result";
    }

}