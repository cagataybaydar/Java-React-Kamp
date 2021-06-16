package javacamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_schools")
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class SchoolCv extends Base{
	
	@Column(name="name")
	private String schoolName;
	
	@Column(name="departmant")
	private String departmant;
	
	@Column(name="start_at")
	private LocalDate startAt;
	
	@Column(name="end_at",nullable = true)
	private LocalDate endAt;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidates candidates;
}
