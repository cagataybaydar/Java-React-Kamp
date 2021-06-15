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

@Data
@Entity
@Table(name="cv_links")
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class LinkCv extends Base{
	
	@Column(name="name")
	private String name;
	
	@Column(name="url")
	private String url;
	
	@ManyToOne
	@JoinColumn(name="candidates_id")
	private Candidates candidates;
}
