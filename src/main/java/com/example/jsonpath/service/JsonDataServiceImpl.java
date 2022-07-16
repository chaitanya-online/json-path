package com.example.jsonpath.service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonDataServiceImpl implements JsonDataService
{

@Autowired
    ReadDataFromJsonFile readDataFromJsonFile;
    ObjectMapper mapper = new ObjectMapper();


    public Object getFormattedResponse(String jsonExpression, Class<?> classType) throws IOException, ParseException {

        Object response = readDataFromJsonFile.getVehicleID();
        String jsonResponse = mapper.writeValueAsString(response);
        return  JsonPath.parse(jsonResponse).read(jsonExpression, classType);


    }
}
