package com.example.jsonpath;



import com.example.jsonpath.service.ReadDataFromJsonFile;
import net.minidev.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.FileReader;


@SpringBootApplication
public class JsonPathApplication {

    public static void main(String[] args) throws  Exception{


        SpringApplication.run(JsonPathApplication.class, args);


    }
}
