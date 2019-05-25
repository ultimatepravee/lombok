package com.testyantra.projectlombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor 
@NoArgsConstructor 
public class EmployeeBean4 {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

}
