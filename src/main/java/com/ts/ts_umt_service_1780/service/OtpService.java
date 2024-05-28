package com.ts.ts_umt_service_1780.service;

import com.ts.ts_umt_service_1780.entity.OtpEntity;

public interface OtpService {
    //create otp for user
    public OtpEntity createOtp(OtpEntity otpEntity) throws Exception;
}
