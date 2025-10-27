package com.SpringBootProject.em_managment_project;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsController
@AllArgsConstructor
public class Employees {
    private Long id;
    private String name;
    private String phone;
    private String email;
}
