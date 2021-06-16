package javacamp.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="canditates")
@PrimaryKeyJoinColumn(name="user_id")
public class Candidates extends Users{
	
	//@Id
	//@Column(name="id")
	//private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="is_verified",columnDefinition = "boolean default false")
	private boolean isVerified = false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<SchoolCv> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ProgrammingSkillCv> programingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<LinkCv> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ForeignLanguageCv> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ExperienceCv> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CoverLetterCv> coverLetters;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidates",optional = false,fetch = FetchType.LAZY)
	private ImageCv image;
}
