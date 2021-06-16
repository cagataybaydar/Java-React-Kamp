package javacamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //Sen bir veri tabanı nesnesisin demektir.
@Table(name="job_titles") // Veri tabanında hangi tabloya karşılık geldiğini söyleriz.
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})

public class JobTitles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String jobTitle;
	
	@OneToMany(mappedBy = "jobTitle")
	private List<JobAdvertisement> jobAdvertisements;
	
	public JobTitles(String jobTitle,List<JobAdvertisement> jobAdvertisements) {
		super();
		this.jobTitle = jobTitle;
		this.jobAdvertisements = jobAdvertisements;
	}
}
