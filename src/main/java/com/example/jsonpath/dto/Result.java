
package com.example.jsonpath.dto;


import javax.annotation.Generated;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CLIENT",
        "Business_Partner",
        "Vehicle_ID",
        "Policy_No",
        "Dummy"
})
@Generated("jsonschema2pojo")
@Data

@NoArgsConstructor

public class Result {

    @JsonProperty("CLIENT")
    private String client;
    @JsonProperty("Business_Partner")
    private String businessPartner;
    @JsonProperty("Vehicle_ID")
    private String vehicleID;
    @JsonProperty("Policy_No")
    private String policyNo;
    @JsonProperty("Dummy")
    private Integer dummy;

    public Result(String client, String businessPartner, String vehicleID, String policyNo, Integer dummy) {
        this.client = client;
        this.businessPartner = businessPartner;
        this.vehicleID = vehicleID;
        this.policyNo = policyNo;
        this.dummy = dummy;
    }




}
