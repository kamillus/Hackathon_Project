package com.arcelormittal.dofasco.Hackathon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kawid on 9/28/2017.
 */
@Controller
public class ApplicationController {

    @RequestMapping("/hello")
    public String helloAction()
    {
        return "hello";
    }
}
