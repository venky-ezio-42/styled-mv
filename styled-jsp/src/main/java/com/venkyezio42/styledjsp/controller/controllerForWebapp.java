package com.venkyezio42.styledjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerForWebapp {

    @RequestMapping("/")
    public ModelAndView start() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("starter");

        System.out.print("In blank starter.");

        return mv;
    }

    @RequestMapping("/home")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");

        System.out.println("in Home now.");

        return mv;
    }

    @RequestMapping("/party")
    public ModelAndView welcome(@RequestParam("name") String myName) {

        ModelAndView mv = new ModelAndView();

        mv.addObject("name" , myName);
        mv.setViewName("party");

        System.out.println("in party now." + myName);

        return mv;
    }
}
