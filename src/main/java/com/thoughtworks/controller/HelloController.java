package com.thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dchen on 7/24/14.
 */
@Controller
public class HelloController {



    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String returnQueryResult() {
        // Hello hello = new Hello();
        return "about";
    }



}
