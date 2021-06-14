package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.business.abstracts.ImageCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.ImageCv;

@RestController
@RequestMapping("/api/image")
public class ImageController {
	
	private ImageCvService imageCvService;
	private CandidatesService candidatesService;
	
	@Autowired
	public ImageController(ImageCvService imageCvService, CandidatesService candidatesService) {
		super();
		this.imageCvService = imageCvService;
		this.candidatesService = candidatesService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam
			(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
		Candidates candidates = this.candidatesService.getById(id).getData();
		ImageCv imageCv = new ImageCv();
		return this.imageCvService.add(imageCv, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ImageCv imageCv){
		return this.imageCvService.update(imageCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.imageCvService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ImageCv> getById(@RequestParam("id") int id){
		return this.imageCvService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ImageCv>> getAll(){
		return this.imageCvService.getAll();
	}
	
	
	@GetMapping("/getByCandidateId")
	public DataResult<ImageCv> getByCandidateId(@RequestParam int id){
		return this.imageCvService.getByCandidateId(id);
	}
}
