package javacamp.hrms.api.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobAdvertService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertController {
	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAllByIsActive")
	public DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive){
		return this.jobAdvertService.getAllByIsActive(isActive);
	}
	
	@GetMapping("/getByIsActiveAndEmployer_Id")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_Id
	(boolean isActive, int employerId){
		return this.jobAdvertService.getByIsActiveAndEmployer_Id(isActive, employerId);
	}
	
	@GetMapping("/getByIsActiveAndDeadLine")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDeadLine
	(boolean isActive, Date deadLine){
		return this.jobAdvertService.getByIsActiveAndDeadLine(isActive, deadLine);
	}
}
