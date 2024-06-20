package com.ts.ts_umt_service_1780.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.ts_umt_service_1780.dto.OtpVerificationResponseDto;
import com.ts.ts_umt_service_1780.entity.CompleteRegistrationEntity;
import com.ts.ts_umt_service_1780.entity.OtpEntity;
import com.ts.ts_umt_service_1780.service.CompleteRegistrationService;

@RestController
@RequestMapping("/complete-registration")
@CrossOrigin("*")
public class CompleteRegistrationController {
	
	@Autowired
	private CompleteRegistrationService completeRegistrationService;
	
	@PostMapping("/register")
    public CompleteRegistrationEntity registerUser(@RequestBody CompleteRegistrationEntity completeRegistrationEntity) throws Exception {
        return this.completeRegistrationService.createUserProfile(completeRegistrationEntity);
    }
	
	@GetMapping("/check-status/{userEmail}")
	public String checkRegistrationStatus(@PathVariable("userEmail") String userEmail) throws Exception {
	    return this.completeRegistrationService.checkRegistrationStatus(userEmail);
	}
	
}
