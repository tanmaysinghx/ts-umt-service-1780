package com.ts.ts_umt_service_1780.service;

import com.ts.ts_umt_service_1780.entity.CompleteRegistrationEntity;

public interface CompleteRegistrationService {
	 //register user details
    public CompleteRegistrationEntity createUserProfile(CompleteRegistrationEntity completeRegistrationEntity) throws Exception;
    
    //check status
    public String checkRegistrationStatus(String email) throws Exception;
}
