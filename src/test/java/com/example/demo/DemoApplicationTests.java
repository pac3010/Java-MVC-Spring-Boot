package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class DemoApplicationTests {
	//Concept AAA
	//Arrange, Act, Assert

	@Autowired
	// private DepartmentService departmentService;
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	// @Test
	// void post(){
	// 	//insert
	// 	//Arrange
	// 	Department department = new Department();
	// 	department.setName("Bussiness Insurance");
		
	// 	//Act
	// 	Boolean result = departmentService.save(department);

	// 	//Assert
	// 	assertEquals(true, result);
	// }

	// @Test
	// void delete(){
	// 	//delete
	// 	//Arrange
	// 	Integer id = 12;

	// 	//Act
	// 	Boolean result = departmentService.delete(id);

	// 	//Assert
	// 	assertEquals(true, result);
	// }

	@Test
	void newEm(){
		Employee deptHead = new Employee();
		deptHead.setId(32);
		Department department = departmentService.get(9);

		Employee employee = new Employee();
		
		employee.setId(35);
		employee.setName("Pinky Flash");
		employee.setEmail("pinky.flash@gmail.com");
		employee.setDepartment(department);

		employee.setDeptHeadId(deptHead);
		//Act
		Boolean result = employeeService.save(employee);

		//Assert
		assertEquals(true, result);

	}

}
