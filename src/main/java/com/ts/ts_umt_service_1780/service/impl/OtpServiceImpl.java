package com.ts.ts_umt_service_1780.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ts.ts_umt_service_1780.dto.OtpVerificationResponseDto;
import com.ts.ts_umt_service_1780.entity.OtpEntity;
import com.ts.ts_umt_service_1780.repo.OtpRepo;
import com.ts.ts_umt_service_1780.service.EmailService;
import com.ts.ts_umt_service_1780.service.OtpService;

import java.security.SecureRandom;
import java.sql.Date;
import java.util.Random;

@Service
public class OtpServiceImpl implements OtpService {

	@Autowired
	private OtpRepo otpRepo;
	
	@Autowired
    private EmailService emailService;

	private static final int OTP_LENGTH = 6;
	private static final long OTP_VALIDITY_DURATION = 5 * 60 * 1000; // 5 minutes in milliseconds
	private final Random random = new SecureRandom();

	public OtpEntity createOtp(OtpEntity otpEntity) throws Exception {
		OtpEntity local = this.otpRepo.findByUserEmail(otpEntity.getUserEmail());
		if (local != null) {
			// Delete the old record
			otpRepo.delete(local);
		}
		String otp = generateOtp(OTP_LENGTH);
		otpEntity.setUserOtp(otp);
		otpEntity.setExpireTimeStamp(System.currentTimeMillis() + OTP_VALIDITY_DURATION);
		otpEntity.setCreateTimeStamp(System.currentTimeMillis());
		otpRepo.save(otpEntity); // Save the OTP to the repository
		// Send the OTP via email
        emailService.sendOtpEmail(otpEntity.getUserEmail(), otp);
		return otpEntity;
	}

	private String generateOtp(int length) {
		StringBuilder otp = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			otp.append(random.nextInt(10)); // Generate a random digit (0-9)
		}
		return otp.toString();
	}

	public OtpVerificationResponseDto verifyOtp(String otp, String userEmail) throws Exception {
		OtpEntity local = this.otpRepo.findByUserEmail(userEmail);
		if (local == null) {
			return new OtpVerificationResponseDto(false, "Invalid OTP");
		}
		long currentTime = System.currentTimeMillis();
		if (currentTime > local.getExpireTimeStamp()) {
			return new OtpVerificationResponseDto(false, "OTP has expired");
		}
		if (local.getUserOtp().equals(otp)) {
			otpRepo.delete(local);
			return new OtpVerificationResponseDto(true, "OTP verified successfully", local);
		} else {
			return new OtpVerificationResponseDto(false, "OTP does not match");
		}
	}
}
