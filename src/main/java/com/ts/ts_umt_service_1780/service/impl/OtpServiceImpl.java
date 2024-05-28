package com.ts.ts_umt_service_1780.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.ts_umt_service_1780.entity.OtpEntity;
import com.ts.ts_umt_service_1780.repo.OtpRepo;
import com.ts.ts_umt_service_1780.service.OtpService;

import java.security.SecureRandom;
import java.sql.Date;
import java.util.Random;

@Service
public class OtpServiceImpl implements OtpService {

	@Autowired
	private OtpRepo otpRepo;

	private static final int OTP_LENGTH = 6;
	private static final long OTP_VALIDITY_DURATION = 5 * 60 * 1000; // 5 minutes in milliseconds
	private final Random random = new SecureRandom();

	public OtpEntity createOtp(OtpEntity otpEntity) throws Exception {
	    System.out.println("Tanmay 1");
        String otp = generateOtp(OTP_LENGTH);
        otpEntity.setUserOtp(otp);
        otpEntity.setExpireTimeStamp(System.currentTimeMillis() + OTP_VALIDITY_DURATION);
        otpEntity.setCreateTimeStamp(System.currentTimeMillis());
        otpRepo.save(otpEntity);  // Save the OTP to the repository
        System.out.printf("Tanmay 2", otpEntity);
        return otpEntity;
    }

	private String generateOtp(int length) {
		StringBuilder otp = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			otp.append(random.nextInt(10)); // Generate a random digit (0-9)
		}
		return otp.toString();
	}

}
