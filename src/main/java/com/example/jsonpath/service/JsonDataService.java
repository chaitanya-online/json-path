package com.example.jsonpath.service;


import com.example.jsonpath.dto.JsonData;
import com.example.jsonpath.invoker.JsonInvoker;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonDataService {
    @Autowired
    private JsonInvoker jsonInvoker;

    ObjectMapper mapper = new ObjectMapper();


    public Object getFormattedResponse(String jsonExpression, Class<?> classType) throws JsonProcessingException {

        JsonData response = jsonInvoker.getData();
        String jsonResponse = mapper.writeValueAsString(response);
        return JsonPath.parse(jsonResponse).read(jsonExpression, classType);

    }
}
