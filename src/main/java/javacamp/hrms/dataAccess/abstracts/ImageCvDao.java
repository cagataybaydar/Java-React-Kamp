package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ImageCv;

public interface ImageCvDao extends JpaRepository<ImageCv, Integer>{
	ImageCv getById(int id);
	ImageCv getByCandidates_Id(int id);
}
