package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getById")
	public DataResult<JobAdvertisement> getById(@RequestParam int id){
		return this.jobAdvertService.getById(id);
	}
	
	@GetMapping("/getAllActiveJobAdvertList")
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertList(){
		return this.jobAdvertService.getAllActiveJobAdvertList();
	}
	
	public Result changeActivityStatus(@RequestParam int id) {
		return this.jobAdvertService.changeActivityStatus(id);
	}
	
	@GetMapping("/getAllActiveJobAdvertByEmployer")
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertByEmployer(@RequestParam int id){
		return this.jobAdvertService.getAllActiveJobAdvertByEmployer(id);
	}
	
	@GetMapping("/getAllByOrderByPublishedAt")
	public DataResult<List<JobAdvertisement>> getAllByOrderByPublishedAt(){
		return this.jobAdvertService.getAllByOrderByPublishedAt();
	}
}
