package com.example.jsonpath.service;


import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

import java.io.FileReader;

@Component
public class ReadDataFromJsonFile {

    public Object getVehicleID() throws Exception {


        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("src/main/resources/Json/TaskJson.json");

        Object obj = parser.parse(reader);


        return obj;

    }
}
