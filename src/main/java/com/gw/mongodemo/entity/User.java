package com.gw.mongodemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="t_user")
public class User {
    @Id
    private String id;
    private Integer userId;
    private String name;
    private Integer age;
    private String sex;
}
