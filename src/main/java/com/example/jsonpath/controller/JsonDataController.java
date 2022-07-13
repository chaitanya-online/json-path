package com.example.jsonpath.controller;

import com.example.jsonpath.service.JsonDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonDataController {

    @Autowired
    private JsonDataService jsonDataService;

    @GetMapping("/Vehicle_ID")
    public List<String> getData() throws JsonProcessingException {
        String expression = "$.d..Vehicle_ID";
        return (List<String>) jsonDataService.getFormattedResponse(expression, List.class);
    }
}
