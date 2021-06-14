package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer> {
	JobTitles findByJobTitle(String title);
	JobTitles getById(int id);
}
