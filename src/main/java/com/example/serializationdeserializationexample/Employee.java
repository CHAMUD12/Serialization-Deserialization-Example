package com.example.serializationdeserializationexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private String address;
    private String salary;
}
