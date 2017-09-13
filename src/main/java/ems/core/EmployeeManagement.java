/**
 * 
 */
package ems.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sachin.srivastava
 * @github : https://github.com/sks1130/ems.git
 *
 */
@RestController
@EnableAutoConfiguration
public class EmployeeManagement {
	
	@RequestMapping("/")
    String welcome() {
        return "Welcome to the Employee Management System!!!";
    }
	
	public static void main(String[] args) {
		 SpringApplication.run(EmployeeManagement.class, args);

	}

}
