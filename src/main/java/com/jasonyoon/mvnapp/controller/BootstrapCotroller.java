package com.jasonyoon.mvnapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jason on 9/1/15.
 */

@Controller
public class BootstrapCotroller {

    @RequestMapping(value = "/bootstrap", method = RequestMethod.GET)
    public ModelAndView bootstrap() {
        ModelAndView mav = new ModelAndView("bootstrap");

        return mav;
    }
}
