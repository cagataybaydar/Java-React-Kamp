package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ProgrammingSkillCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ProgrammingSkillCv;

@RestController
@RequestMapping("/api/programmingskill")
public class ProgrammingSkillController {
	
	private ProgrammingSkillCvService programmingSkillCvService;

	@Autowired
	public ProgrammingSkillController(ProgrammingSkillCvService programmingSkillCvService) {
		super();
		this.programmingSkillCvService = programmingSkillCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkillCv programmingSkillCv){
		return this.programmingSkillCvService.add(programmingSkillCv);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ProgrammingSkillCv programmingSkillCv){
		return this.programmingSkillCvService.update(programmingSkillCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.programmingSkillCvService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ProgrammingSkillCv> getById(@RequestParam("id") int id){
		return this.programmingSkillCvService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ProgrammingSkillCv>> getAll(){
		return this.programmingSkillCvService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ProgrammingSkillCv>> getAllByCandidateId(@RequestParam int id){
		return this.programmingSkillCvService.getAllByCandidateId(id);
	}
}
