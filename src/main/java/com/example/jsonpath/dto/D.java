
package com.example.jsonpath.dto;


import javax.annotation.Generated;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results"
})
@Generated("jsonschema2pojo")
@ToString
@Data

public class D {

    @JsonProperty("results")
    private Result results = null;

    public D() {
        this.results = results;
    }
}
