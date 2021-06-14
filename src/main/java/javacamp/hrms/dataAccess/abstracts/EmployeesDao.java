package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer> {

}
