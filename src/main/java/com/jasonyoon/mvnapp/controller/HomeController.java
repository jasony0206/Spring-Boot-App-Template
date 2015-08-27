package com.jasonyoon.mvnapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jason on 8/24/15.
 */

@RestController
public class HomeController {

    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        LOG.info("Entering / endpoint to welcome");

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("exampleText", "this is an object that is mapped to view via Thymeleaf");

        return mav;
    }
}
