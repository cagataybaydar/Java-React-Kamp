package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Cities;

public interface CityDao extends JpaRepository<Cities, Integer>{

}
