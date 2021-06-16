package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.SchoolCv;

public interface SchoolCvDao extends JpaRepository<SchoolCv, Integer> {
	SchoolCv getById(int id);
	List<SchoolCv> getAllByCandidates_IdOrderByEndAtDesc(int id);
	List<SchoolCv> getAllByCandidates_Id(int id);
}
