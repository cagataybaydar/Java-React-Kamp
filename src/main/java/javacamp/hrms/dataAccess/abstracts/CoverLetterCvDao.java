package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.CoverLetterCv;

public interface CoverLetterCvDao extends JpaRepository<CoverLetterCv, Integer>{
	CoverLetterCv getById(int id);
}
