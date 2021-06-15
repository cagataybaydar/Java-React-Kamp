package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ExperienceCv;

public interface ExperienceCvDao extends JpaRepository<ExperienceCv, Integer>{
	ExperienceCv getById(int id);
	List<ExperienceCv> getAllByCandidates_IdOrderByEndAtDesc(int id);
	List<ExperienceCv> getAllByCandidates_Id(int id);
}
