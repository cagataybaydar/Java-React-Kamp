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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Cities{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private int id;
	
	@OneToMany(mappedBy = "cities")
	private List<JobAdvertisement> jobAdvertisements;
	
	@Column(name="city_name")
	private String name;

	public Cities(String name,List<JobAdvertisement> jobAdvertisements) {
		super();
		this.name = name;
		this.jobAdvertisements = jobAdvertisements;
	}
}
