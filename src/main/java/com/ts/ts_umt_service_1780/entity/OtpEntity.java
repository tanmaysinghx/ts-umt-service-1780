package com.ts.ts_umt_service_1780.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OTP_LIST")
public class OtpEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long otpId;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_OTP")
	private String userOtp;
	
	@Column(name="CREATE_TIME_STAMP") 
	private Long createTimeStamp;
	
	@Column(name="EXPIRE_TIME_STAMP")
	private Long expireTimeStamp;

	public OtpEntity() {
		super();
	}

	public OtpEntity(Long otpId, String userEmail, String userOtp, Long createTimeStamp, Long expireTimeStamp) {
		super();
		this.otpId = otpId;
		this.userEmail = userEmail;
		this.userOtp = userOtp;
		this.createTimeStamp = createTimeStamp;
		this.expireTimeStamp = expireTimeStamp;
	}

	public Long getOtpId() {
		return otpId;
	}

	public void setOtpId(Long otpId) {
		this.otpId = otpId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserOtp() {
		return userOtp;
	}

	public void setUserOtp(String userOtp) {
		this.userOtp = userOtp;
	}

	public Long getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public Long getExpireTimeStamp() {
		return expireTimeStamp;
	}

	public void setExpireTimeStamp(Long expireTimeStamp) {
		this.expireTimeStamp = expireTimeStamp;
	}
	
	
}
