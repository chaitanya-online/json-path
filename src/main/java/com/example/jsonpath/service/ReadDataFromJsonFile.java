package com.example.jsonpath.service;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.io.FileReader;
import java.io.IOException;

@Component
public class ReadDataFromJsonFile {

    @Value("${file.location}")
    private String file;
    public Object getVehicleID() throws IOException, ParseException {


        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(file);

        Object obj = parser.parse(reader);


        return obj;

    }
}
