package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
	Users findUserByEMail(String email);
	Users getById(int id);
}
