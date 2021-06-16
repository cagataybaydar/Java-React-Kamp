package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.LinkCv;

public interface LinkCvDao extends JpaRepository<LinkCv, Integer>{
	LinkCv getById(int id);
	List<LinkCv> getAllByCandidates_Id(int id);
}
