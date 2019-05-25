package com.testyantra.projectlombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // Default constructor gone but will have parameterized constructor in the same
					// order as variables are declared
public class EmployeeBean2 {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

}
