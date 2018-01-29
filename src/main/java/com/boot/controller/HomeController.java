package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karol on 2018-01-16.
 */

@RestController
public class HomeController {
/*
    @RequestMapping("/")
    public String home(){
        return "HAHAHAH MAM HELLO WORLDA XD";
    }
*/

    @RequestMapping(value = "/assessment", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


}
