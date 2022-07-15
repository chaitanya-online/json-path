package com.example.jsonpath.controller;

import com.example.jsonpath.service.JsonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonDataController {

    @Autowired
    private JsonDataService jsonDataService;

    @GetMapping("/vehicle_ID")
    public List<String> getVehicleIds() throws Exception {
        String expression = "$.d..Vehicle_ID";
        return (List<String>) jsonDataService.getFormattedResponse(expression, List.class);
    }

    @GetMapping("/vehicle/")
    public List<String> getResults(@RequestParam String varString) throws Exception {
        String resultExpression = "$.d.." + varString;

        return (List<String>) jsonDataService.getFormattedResponse(resultExpression, List.class);

    }
}
