package com.jasonyoon.mvnapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 8/25/15.
 */

@RestController
public class QueryController {

    private static final Logger LOG = LoggerFactory.getLogger(QueryController.class);

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String queryController(@RequestParam(defaultValue = "unknown name") String name,
                                  @RequestParam(defaultValue = "unknown gender") String gender,
                                  @RequestParam(defaultValue = "0") int age) {

        LOG.info("Entering /query endpoint to see an example of query parameter interaction");

        String input = String.format("Your name is %s, you are %s, and you are %s years old.", name, gender, age);

        return input;
    }
}
