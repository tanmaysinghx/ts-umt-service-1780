package com.ts.ts_umt_service_1780.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.ts_umt_service_1780.entity.CompleteRegistrationEntity;
import com.ts.ts_umt_service_1780.repo.CompleteRegistrationRepo;
import com.ts.ts_umt_service_1780.service.CompleteRegistrationService;

@Service
public class CompleteRegistrationServiceImpl implements CompleteRegistrationService {

	@Autowired
	private CompleteRegistrationRepo completeRegistrationRepo;

	@Override
	public CompleteRegistrationEntity createUserProfile(CompleteRegistrationEntity completeRegistrationEntity)
			throws Exception {
		CompleteRegistrationEntity local = this.completeRegistrationRepo
				.findByUserEmail(completeRegistrationEntity.getUserEmail());

		if (local == null) {
			completeRegistrationRepo.save(completeRegistrationEntity);
		}
		return completeRegistrationEntity;
	}

	@Override
	public String checkRegistrationStatus(String email) throws Exception {
	    CompleteRegistrationEntity local = this.completeRegistrationRepo.findByUserEmail(email);
	    if (local != null) {
	        return "true";
	    } else {
	        return "false";
	    }
	}
}
