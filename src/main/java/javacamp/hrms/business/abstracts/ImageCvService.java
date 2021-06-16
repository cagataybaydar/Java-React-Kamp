package javacamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ImageCv;

public interface ImageCvService {
	Result add(ImageCv imageCv, MultipartFile imageFile);
	Result update(ImageCv imageCv);
	Result delete(int id);
	DataResult<ImageCv> getById(int id);
	DataResult<List<ImageCv>> getAll();
	DataResult<ImageCv> getByCandidateId(int id);
}
