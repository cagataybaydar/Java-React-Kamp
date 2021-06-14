package javacamp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="verification_codes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCodes{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private Date verifiedDate;

	public VerificationCodes(int id, String code, boolean isVerified) {
		super();
		this.id = id;
		this.code = code;
		this.isVerified = isVerified;
	}
	

}
