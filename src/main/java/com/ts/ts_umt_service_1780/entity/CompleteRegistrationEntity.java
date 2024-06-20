package com.ts.ts_umt_service_1780.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class CompleteRegistrationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userId;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_FULL_NAME")
	private String userFullName;
	
	@Column(name="USER_COUNTRY")
	private String userCountry;
	
	@Column(name="USER_CITY")
	private String userCity;
	
	@Column(name="USER_ADDRESS")
	private String userAddress;
	
	@Column(name="USER_PHONE_NUMBER")
	private Long userPhoneNumber;
	
	@Column(name="USER_SECONDARY_PHONE_NUMBER")
	private Long userSecondaryPhoneNumber;
	
	@Column(name="USER_DOB")
	private String userDob;
	
	@Column(name="USER_ZIP_CODE")
	private Long userZipCode;
	
	@Column(name="USER_COMPANY_NAME")
	private String userCompanyName;
	
	@Column(name="USER_EMPLOYEES_COUNT")
	private Long userEmployeesCount;
	
	@Column(name="USER_COMPANY_COUNTRY")
	private String userCompanyCountry;
	
	@Column(name="USER_COMPANY_CITY")
	private String userCompanyCity;
	
	@Column(name="USER_COMPANY_ADDRESS")
	private String userCompanyAddress;
	
	@Column(name="USER_COMPANY_ZIP")
	private Long userCompanyZip;

	public CompleteRegistrationEntity() {
		super();
	}

	public CompleteRegistrationEntity(Long userId, String userEmail, String userFullName, String userCountry,
			String userCity, String userAddress, Long userPhoneNumber, Long userSecondaryPhoneNumber, String userDob,
			Long userZipCode, String userCompanyName, Long userEmployeesCount, String userCompanyCountry,
			String userCompanyCity, String userCompanyAddress, Long userCompanyZip) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userFullName = userFullName;
		this.userCountry = userCountry;
		this.userCity = userCity;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
		this.userSecondaryPhoneNumber = userSecondaryPhoneNumber;
		this.userDob = userDob;
		this.userZipCode = userZipCode;
		this.userCompanyName = userCompanyName;
		this.userEmployeesCount = userEmployeesCount;
		this.userCompanyCountry = userCompanyCountry;
		this.userCompanyCity = userCompanyCity;
		this.userCompanyAddress = userCompanyAddress;
		this.userCompanyZip = userCompanyZip;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Long getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(Long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public Long getUserSecondaryPhoneNumber() {
		return userSecondaryPhoneNumber;
	}

	public void setUserSecondaryPhoneNumber(Long userSecondaryPhoneNumber) {
		this.userSecondaryPhoneNumber = userSecondaryPhoneNumber;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public Long getUserZipCode() {
		return userZipCode;
	}

	public void setUserZipCode(Long userZipCode) {
		this.userZipCode = userZipCode;
	}

	public String getUserCompanyName() {
		return userCompanyName;
	}

	public void setUserCompanyName(String userCompanyName) {
		this.userCompanyName = userCompanyName;
	}

	public Long getUserEmployeesCount() {
		return userEmployeesCount;
	}

	public void setUserEmployeesCount(Long userEmployeesCount) {
		this.userEmployeesCount = userEmployeesCount;
	}

	public String getUserCompanyCountry() {
		return userCompanyCountry;
	}

	public void setUserCompanyCountry(String userCompanyCountry) {
		this.userCompanyCountry = userCompanyCountry;
	}

	public String getUserCompanyCity() {
		return userCompanyCity;
	}

	public void setUserCompanyCity(String userCompanyCity) {
		this.userCompanyCity = userCompanyCity;
	}

	public String getUserCompanyAddress() {
		return userCompanyAddress;
	}

	public void setUserCompanyAddress(String userCompanyAddress) {
		this.userCompanyAddress = userCompanyAddress;
	}

	public Long getUserCompanyZip() {
		return userCompanyZip;
	}

	public void setUserCompanyZip(Long userCompanyZip) {
		this.userCompanyZip = userCompanyZip;
	}

	@Override
	public String toString() {
		return "CompleteRegistrationEntity [userId=" + userId + ", userEmail=" + userEmail + ", userFullName="
				+ userFullName + ", userCountry=" + userCountry + ", userCity=" + userCity + ", userAddress="
				+ userAddress + ", userPhoneNumber=" + userPhoneNumber + ", userSecondaryPhoneNumber="
				+ userSecondaryPhoneNumber + ", userDob=" + userDob + ", userZipCode=" + userZipCode
				+ ", userCompanyName=" + userCompanyName + ", userEmployeesCount=" + userEmployeesCount
				+ ", userCompanyCountry=" + userCompanyCountry + ", userCompanyCity=" + userCompanyCity
				+ ", userCompanyAddress=" + userCompanyAddress + ", userCompanyZip=" + userCompanyZip + "]";
	}
	
}
