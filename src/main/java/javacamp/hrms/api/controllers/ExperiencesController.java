package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ExperienceCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ExperienceCv;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	
	private ExperienceCvService experienceCvService;
	
	@Autowired
	public ExperiencesController(ExperienceCvService experienceCvService) {
		super();
		this.experienceCvService = experienceCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ExperienceCv experienceCv){
		return this.experienceCvService.add(experienceCv);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ExperienceCv experienceCv){
		return this.experienceCvService.update(experienceCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.experienceCvService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ExperienceCv> getById(@RequestParam int id){
		return this.experienceCvService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ExperienceCv>> getAll(){
		return this.experienceCvService.getAll();
	}
	
	@GetMapping("/getAllByCandidateIdOrderByEndAtDesc")
	public DataResult<List<ExperienceCv>> getAllByCandidateIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.experienceCvService.getAllByCandidateIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ExperienceCv>> getAllByCandidateId(@RequestParam int id){
		return this.experienceCvService.getAllByCandidateId(id);
	}
	
}
