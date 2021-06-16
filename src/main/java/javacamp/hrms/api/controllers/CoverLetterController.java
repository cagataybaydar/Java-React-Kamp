package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CoverLetterCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.CoverLetterCv;

@RestController
@RequestMapping("/api/coverLetter")
public class CoverLetterController {
	
	private CoverLetterCvService coverLetterCvService;
	
	@Autowired
	public CoverLetterController(CoverLetterCvService coverLetterCvService) {
		super();
		this.coverLetterCvService = coverLetterCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterCv coverLetterCv) {
		return this.coverLetterCvService.add(coverLetterCv);
	}
	
	
	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterCv coverLetterCv){
		return this.coverLetterCvService.update(coverLetterCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.coverLetterCvService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CoverLetterCv> getById(@RequestParam("id") int id){
		return this.coverLetterCvService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetterCv>> getAll(){
		return this.coverLetterCvService.getAll();
	}
	
}
