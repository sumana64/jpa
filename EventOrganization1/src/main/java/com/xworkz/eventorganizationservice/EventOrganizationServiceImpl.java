package com.xworkz.eventorganizationservice;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.eventOrganizationDto.EventOrganizationDto;
import com.xworkz.eventorganizationrepository.EventOrganizationRepository;
import com.xworkz.eventorganizationrepository.EventOrganizationRepositoryImpl;

public class EventOrganizationServiceImpl implements EventOrganizationService {
	
	EventOrganizationRepository repo = new EventOrganizationRepositoryImpl();

	@Override
	public boolean onSave(EventOrganizationDto dto) throws SQLException {
		boolean save = false;
		if(dto!=null) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
        Set<ConstraintViolation<EventOrganizationDto>> voilation = validator.validate(dto);
        if(voilation.isEmpty()) {
		System.out.println("dto is not null");
			repo.onSave(dto);
			save = true;
        }else {
        	System.out.println("voilation present inside the dto:" + voilation);
        	        return false;
        }
		}else {
			System.out.println("dto is null");
		}
		return save;
	}

	//@Override
	/*public boolean readAll() throws SQLException {
		boolean read = false;
		repo.readAll();
		read = true;
		return read;
	}

	@Override
	public boolean read(String email, long phoneNo) throws SQLException {
		boolean read = false;
		if(email!=null && phoneNo!=0) {
			repo.read(email, phoneNo);
			read =true;
		}
		return read;
	}

	@Override
	public boolean update(String email, long phoneNo) throws SQLException {
		boolean update = false;
		if(email!=null && phoneNo!=0) {
			repo.update(email, phoneNo);
			update = true;
		}
		return update;
	}

	@Override
	public boolean search1(String email) throws SQLException {
		boolean search1 = false;
		if(email!=null) {
			repo.search1(email);
			search1 =true;
		}
		
		return search1;
	}

	@Override
	public boolean search2(long phoneNo) throws SQLException {
		boolean search2 = false;
		if(phoneNo!=0) {
			repo.search2(phoneNo);
			search2 =true;
		}
		
		return search2;
	}
	@Override
	public boolean search3(String name) throws SQLException {
		boolean search3 = false;
		if(name!=null) {
			repo.search3(name);
			search3 =true;
		}
		
		return search3;
	}

	@Override
	public boolean delete(String email) throws SQLException {
		boolean delete = false;
		if(email!=null) {
			repo.delete(email);
			delete = true;
		}
		return delete;

	}*/


}
