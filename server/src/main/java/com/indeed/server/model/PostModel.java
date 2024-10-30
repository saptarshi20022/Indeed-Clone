package com.indeed.server.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "post")
@Data
//we write document for mongodb, value is not stored in tables but in key:value pair
//we don't make databases here instead we make collections
public class PostModel {//decides how to save data in DB

    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String technology[];

    @NotNull
    private String salary;


    @CreatedDate //annotation to automatically generate the timestamp
    private Date createdAt;
}
