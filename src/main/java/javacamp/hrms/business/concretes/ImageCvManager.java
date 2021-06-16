package javacamp.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.business.abstracts.ImageCvService;
import javacamp.hrms.core.utilities.imageUpload.ImageUploadService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.ImageCvDao;
import javacamp.hrms.entities.concretes.ImageCv;

@Service
public class ImageCvManager implements ImageCvService {
	private ImageCvDao imageCvDao;
	private ImageUploadService imageUploadService;

	public ImageCvManager(ImageCvDao imageCvDao,ImageUploadService imageUploadService) {
		super();
		this.imageCvDao = imageCvDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public Result add(ImageCv imageCv, MultipartFile imageFile) {
		Map<String, String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		imageCv.setUrl(uploadImage.get("url"));
		this.imageCvDao.save(imageCv);
		return new SuccessResult("Resim eklendi");
	}

	@Override
	public Result update(ImageCv imageCv) {
		this.imageCvDao.save(imageCv);
		return new SuccessResult("Resim güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.imageCvDao.deleteById(id);
		return new SuccessResult("Resim silindi");
	}

	@Override
	public DataResult<ImageCv> getById(int id) {
		this.imageCvDao.getById(id);
		return new SuccessDataResult<ImageCv>("Data listelendi");
	}

	@Override
	public DataResult<List<ImageCv>> getAll() {
		this.imageCvDao.findAll();
		return new SuccessDataResult<List<ImageCv>>("Data listelendi");
	}

	@Override
	public DataResult<ImageCv> getByCandidateId(int id) {
		this.imageCvDao.getByCandidates_Id(id);
		return new SuccessDataResult<ImageCv>("Data listelendi");
	}
	
	
}
