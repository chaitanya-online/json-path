package com.example.jsonpath.service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonDataService {

@Autowired
    ReadDataFromJsonFile readDataFromJsonFile;
    ObjectMapper mapper = new ObjectMapper();


    public Object getFormattedResponse(String jsonExpression, Class<?> classType) throws Exception {

        Object response = readDataFromJsonFile.getVehicleID();
        String jsonResponse = mapper.writeValueAsString(response);
        return  JsonPath.parse(jsonResponse).read(jsonExpression, classType);


    }
}
