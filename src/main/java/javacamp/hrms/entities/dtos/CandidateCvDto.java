package javacamp.hrms.entities.dtos;

import java.util.List;

import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.ExperienceCv;
import javacamp.hrms.entities.concretes.ForeignLanguageCv;
import javacamp.hrms.entities.concretes.ImageCv;
import javacamp.hrms.entities.concretes.LinkCv;
import javacamp.hrms.entities.concretes.ProgrammingSkillCv;
import javacamp.hrms.entities.concretes.SchoolCv;

public class CandidateCvDto {
	public Candidates candidates;
	public List<SchoolCv> schools;
	public List<ProgrammingSkillCv> programmingSkills;
	public List<LinkCv> links;
	public List<ForeignLanguageCv> languages;
	public List<ExperienceCv> experiences;
	public ImageCv image;
}
