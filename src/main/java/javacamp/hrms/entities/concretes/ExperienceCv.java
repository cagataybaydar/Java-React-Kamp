package javacamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_experiences")
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceCv extends Base {
	
	@Column(name="work_place")
	private String workPlace;
	
	@Column(name="position")
	private String position;
	
	@Column(name="start_at")
	private LocalDate startAt;
	
	@Column(name="end_at",nullable = true)
	private LocalDate endAt;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Candidates candidates;
}
