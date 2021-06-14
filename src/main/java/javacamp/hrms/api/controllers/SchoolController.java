package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.SchoolCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.SchoolCv;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	
	private SchoolCvService schoolCvService;
	
	@Autowired
	public SchoolController(SchoolCvService schoolCvService) {
		super();
		this.schoolCvService = schoolCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolCv schoolCv){
		return this.schoolCvService.add(schoolCv);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody SchoolCv schoolCv){
		return this.schoolCvService.update(schoolCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.schoolCvService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<SchoolCv> getById(@RequestParam int id){
		return this.schoolCvService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<SchoolCv>> getAll(){
		return this.schoolCvService.getAll();
	}
	
	@GetMapping("/getAllByCandidateIdOrderByEndAtDesc")
	public DataResult<List<SchoolCv>> getAllByCandidateIdOrderByEndAtDesc(@RequestParam int id){
		return this.schoolCvService.getAllByCandidateIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<SchoolCv>> getAllByCandidateId(@RequestParam int id){
		return this.schoolCvService.getAllByCandidateId(id);
	}
}
