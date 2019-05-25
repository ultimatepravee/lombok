package com.testyantra.projectlombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor //Both constructors are available
public class EmployeeBean3 {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

}
