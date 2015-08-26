package com.jasonyoon.mvnapp.controller;

import com.jasonyoon.mvnapp.util.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 8/25/15.
 */

@RestController
public class JsonController {

    private static final Logger LOG = LoggerFactory.getLogger(JsonController.class);

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public ModelMap jsonController() {
        LOG.info("Entering /json endpoint to see an example of returning a JSON object");

        Person person = new Person("Jason", "male", 21);

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("person", person);

        return modelMap;
    }
}
