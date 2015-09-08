package com.jasonyoon.mvnapp.controller;

import com.jasonyoon.mvnapp.client.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 9/8/15.
 */

@RestController
public class ApiCallController {

    private Client client;

    @RequestMapping(value = "/apicall")
    @ResponseBody
    public String apiCallController() {

        System.out.println("entering apicall...");

        client = new Client();
        return client.clientCall();
    }

}
