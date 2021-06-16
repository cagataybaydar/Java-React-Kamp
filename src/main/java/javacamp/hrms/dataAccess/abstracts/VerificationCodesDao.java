package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.VerificationCodes;

public interface VerificationCodesDao extends JpaRepository<VerificationCodes, Integer>{
	VerificationCodes getById(int id);
}
