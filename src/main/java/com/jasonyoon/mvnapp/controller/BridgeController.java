package com.jasonyoon.mvnapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 8/31/15.
 */

@RestController
public class BridgeController {

    private static final Logger LOG = LoggerFactory.getLogger(QueryController.class);

    @RequestMapping(value = "/bridge", method = RequestMethod.GET)
    public String interactWithController() {
        LOG.info("Entering /bridge to show inter-controller interaction");

        QueryController controller = new QueryController();

        // Calls another endpoint
        String output = controller.queryController("Derek", "male", 20);

        return output;
    }
}
