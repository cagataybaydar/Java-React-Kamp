package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ForeignLanguageCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ForeignLanguageCv;

@RestController
@RequestMapping("/api/foreignLanguage")
public class ForeignLangaugeController {
	
	private ForeignLanguageCvService foreignLanguageCvService;
	
	@Autowired
	public ForeignLangaugeController(ForeignLanguageCvService foreignLanguageCvService) {
		super();
		this.foreignLanguageCvService = foreignLanguageCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguageCv foreignLanguageForCV){
		return this.foreignLanguageCvService.add(foreignLanguageForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ForeignLanguageCv foreignLanguageCv){
		return this.foreignLanguageCvService.update(foreignLanguageCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.foreignLanguageCvService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ForeignLanguageCv> getById(@RequestParam("id") int id){
		return this.foreignLanguageCvService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ForeignLanguageCv>> getAll(){
		return this.foreignLanguageCvService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ForeignLanguageCv>> getAllByCandidateId(@RequestParam int id){
		return this.foreignLanguageCvService.getAllByCandidateId(id);
	}
}
