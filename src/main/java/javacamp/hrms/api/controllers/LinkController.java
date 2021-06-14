package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.LinkCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.LinkCv;

@RestController
@RequestMapping("/api/link")
public class LinkController {
	
	private LinkCvService linkCvService;
	
	@Autowired
	public LinkController(LinkCvService linkCvService) {
		super();
		this.linkCvService = linkCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LinkCv linkCV){
		return this.linkCvService.add(linkCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody LinkCv linkCV){
		return this.linkCvService.update(linkCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.linkCvService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<LinkCv> getById(@RequestParam("id") int id){
		return this.linkCvService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<LinkCv>> getAll(){
		return this.linkCvService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<LinkCv>> getAllByCandidateId(@RequestParam int id){
		return this.linkCvService.getAllByCandidateId(id);
	}
	
}
