package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name="cv_programming_skills")

public class ProgrammingSkillCv extends Base {
	
	@Column(name="skill_name")
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Candidates candidates;
}
