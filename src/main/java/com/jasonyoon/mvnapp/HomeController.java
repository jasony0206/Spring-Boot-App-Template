package com.jasonyoon.mvnapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jason on 8/24/15.
 */

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView welcome() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
