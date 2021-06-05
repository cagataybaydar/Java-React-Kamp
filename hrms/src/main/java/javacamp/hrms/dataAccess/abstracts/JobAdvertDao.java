package javacamp.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javacamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertDao extends JpaRepository<JobAdvertisement, Integer> {
	
	JobAdvertisement getByJobAdvertId(int jobAdvertId);
	
	List<JobAdvertisement> getAllByIsActive(boolean isActive);
	
	List<JobAdvertisement> getByIsActiveAndEmployer_Id(boolean isActive, int employerId);
	
	@Query("From JobAdvertisement where isActive=:isActive and deadLine=:deadLine")
	List<JobAdvertisement> getByIsActiveAndDeadLine(boolean isActive, Date deadLine);
	
}
