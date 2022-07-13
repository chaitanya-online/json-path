package com.example.jsonpath.invoker;

import com.example.jsonpath.dto.D;
import com.example.jsonpath.dto.JsonData;
import com.example.jsonpath.dto.Result;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component
public class JsonInvoker {

    @Autowired
    JsonData jsonData;

    public JsonData getData() {
        List<D> data = new ArrayList<>();
        D d = new D();

        Result r = new Result("100", "1028320610", "22169410", "00000402000010824", 1);


        d.setResults(r);

        D d1 = new D();
        Result r1 = new Result("100", "1028320610", "22169410", "00000402000010935", 1);
        d1.setResults(r1);

        data.add(d);
        data.add(d1);
        jsonData.setD(data);

        return jsonData;
    }
}

