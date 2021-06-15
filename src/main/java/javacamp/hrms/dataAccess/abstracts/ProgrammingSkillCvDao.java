package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ProgrammingSkillCv;

public interface ProgrammingSkillCvDao extends JpaRepository<ProgrammingSkillCv, Integer> {
	ProgrammingSkillCv getById(int id);
	List<ProgrammingSkillCv> getAllByCandidates_Id(int id);
}
