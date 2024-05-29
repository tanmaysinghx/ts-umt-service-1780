package com.ts.ts_umt_service_1780.dto;

import com.ts.ts_umt_service_1780.entity.OtpEntity;

public class OtpVerificationResponseDto {

	private boolean success;
	private String message;
	private OtpEntity otpEntity;

	public OtpVerificationResponseDto() {
	}

	public OtpVerificationResponseDto(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public OtpVerificationResponseDto(boolean success, String message, OtpEntity otpEntity) {
		this.success = success;
		this.message = message;
		this.otpEntity = otpEntity;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OtpEntity getOtpEntity() {
		return otpEntity;
	}

	public void setOtpEntity(OtpEntity otpEntity) {
		this.otpEntity = otpEntity;
	}
}
