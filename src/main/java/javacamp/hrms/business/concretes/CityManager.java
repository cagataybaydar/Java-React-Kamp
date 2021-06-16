package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CityService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.dataAccess.abstracts.CityDao;
import javacamp.hrms.entities.concretes.Cities;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<Cities>> getAll() {
		this.cityDao.findAll();
		return new SuccessDataResult<List<Cities>>("Data listelendi");
	}

}
