package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ForeignLanguageCv;

public interface ForeignLanguageCvDao extends JpaRepository<ForeignLanguageCv, Integer>{
	ForeignLanguageCv getById(int id);
	List<ForeignLanguageCv> getAllByCandidates_Id(int id);
}
