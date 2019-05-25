package com.testyantra.projectlombok;

import java.util.logging.Level;

import com.testyantra.projectlombok.pojo.EmployeeBean;
import com.testyantra.projectlombok.pojo.EmployeeBean2;
import com.testyantra.projectlombok.pojo.EmployeeBean3;

import lombok.extern.java.Log;

/**
 * Hello world!
 *
 */
//@Log4j2
@Log
public class App { 
	public static void main(String[] args) {
		String email = "abc@gmail.com";
		
		EmployeeBean bean = new EmployeeBean();
		bean.setId(123);
		bean.setFirstName("Praveen");
		bean.setLastName("Dyamappa");
		bean.setEmail(email);
		log.log(Level.WARNING, bean.toString());
		log.warning(bean.toString());
		
		EmployeeBean2 b2 = new EmployeeBean2(456, "AAA", "BBB", email);
		log.info(b2.toString());
		
		EmployeeBean3 b3 = new EmployeeBean3(456, "AAA", "BBB", email);
		log.info(b3.toString());
		
		EmployeeBean3 b32 = new EmployeeBean3();
		b32.setId(123);
		b32.setFirstName("Praveen");
		b32.setLastName("Dyamappa");
		b32.setEmail(email);
		log.info(b32.toString());
	}//End of Main
}//End of Class
