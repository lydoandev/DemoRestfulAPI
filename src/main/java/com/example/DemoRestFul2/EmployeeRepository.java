package com.example.DemoRestFul2;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoRestFul2.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
