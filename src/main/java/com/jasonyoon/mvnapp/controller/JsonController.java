package com.jasonyoon.mvnapp.controller;

import com.jasonyoon.mvnapp.util.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jason on 8/25/15.
 */

@Controller
public class JsonController {

    private static final Logger LOG = LoggerFactory.getLogger(JsonController.class);

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public ModelMap jsonController() {
        LOG.info("Entering /json endpoint to see an example of returning a JSON object");

        Person person = new Person();
        person.setName("Jason");
        person.setGender("male");
        person.setAge(21);

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("person", person);

        return modelMap;
    }
}
