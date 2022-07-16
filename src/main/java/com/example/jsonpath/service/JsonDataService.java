package com.example.jsonpath.service;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface JsonDataService {
    Object getFormattedResponse(String jsonExpression, Class<?> classType) throws IOException, ParseException;
}
