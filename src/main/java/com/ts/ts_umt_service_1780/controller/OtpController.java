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
import com.ts.ts_umt_service_1780.entity.OtpEntity;
import com.ts.ts_umt_service_1780.service.OtpService;

@RestController
@RequestMapping("/otp")
@CrossOrigin("*")
public class OtpController {
	
	@Autowired
	private OtpService otpService;
	
	@PostMapping("/generate-otp")
    public OtpEntity createOtp(@RequestBody OtpEntity otpEntity) throws Exception {
        return this.otpService.createOtp(otpEntity);
    }
	
	@GetMapping("/verify-otp/{userEmail}/{otp}")
	public OtpVerificationResponseDto verifyOtp(@PathVariable("userEmail") String userEmail, @PathVariable("otp") String otp) throws Exception {
		System.out.printf("Tanmay", userEmail, otp);
	    return this.otpService.verifyOtp(otp, userEmail);
	}

}

