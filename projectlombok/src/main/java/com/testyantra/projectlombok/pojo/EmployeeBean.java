package com.testyantra.projectlombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data //Refer Outline to know more about methods which get injected
public class EmployeeBean {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
}
