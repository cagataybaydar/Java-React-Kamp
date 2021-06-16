package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="cv_programming_skills")
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor

public class ProgrammingSkillCv extends Base {
	
	@Column(name="skill_name")
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidates candidates;
}
