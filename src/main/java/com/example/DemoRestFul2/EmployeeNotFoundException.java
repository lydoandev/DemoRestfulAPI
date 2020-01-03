package com.example.DemoRestFul2;

public class EmployeeNotFoundException extends RuntimeException{
	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
