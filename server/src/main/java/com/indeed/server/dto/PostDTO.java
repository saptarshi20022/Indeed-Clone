package com.indeed.server.dto;

import lombok.Data;

@Data
public class PostDTO {//data transfer object (DTO)

    private String profile;

    private String type;

    private String description;

    private String experience;

    private String technology[];

    private String salary;


}
