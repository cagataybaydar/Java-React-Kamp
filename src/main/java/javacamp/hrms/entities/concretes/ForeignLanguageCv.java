package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="cv_foreign_langugaes")
@NoArgsConstructor
@AllArgsConstructor
public class ForeignLanguageCv extends Base {
	
	@Column(name="language")
	private String language;
	
	@Min(value = 1)
	@Max(value = 5)
	@Column(name="level")
	private int level;
	
	@ManyToOne
	@JoinColumn(name="candidates_id")
	private Candidates candidates;
}
