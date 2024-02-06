package com.kodespace.kodejagah.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserInput {
    @JsonProperty ("userId")
    private Integer userId;

}
