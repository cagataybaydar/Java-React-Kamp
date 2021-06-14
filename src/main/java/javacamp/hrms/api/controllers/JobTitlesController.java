package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobTİtlesService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
	
	private JobTİtlesService jobTİtlesService;
	
	@Autowired
	public JobTitlesController(JobTİtlesService jobTİtlesService) {
		super();
		this.jobTİtlesService = jobTİtlesService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobTitles>> getAll() {

		return this.jobTİtlesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobTitles) {
		return this.jobTİtlesService.add(jobTitles);
	}

}



