package com.ts.ts_umt_service_1780.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;

@Entity
@Table(name="USER_DETAILS")
public class CompleteRegistrationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(name="USER_EMAIL", nullable = false, unique = true)
    @Email
    @NotNull
    private String userEmail;

    @Column(name="USER_FULL_NAME", nullable = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String userFullName;

    @Column(name="USER_COUNTRY", nullable = false)
    @NotNull
    private String userCountry;

    @Column(name="USER_CITY", nullable = false)
    @NotNull
    private String userCity;

    @Column(name="USER_ADDRESS", nullable = false)
    @NotNull
    private String userAddress;

    @Column(name="USER_PHONE_NUMBER", nullable = false)
    @NotNull
    @Size(min = 10, max = 15)
    private String userPhoneNumber;

    @Column(name="USER_SECONDARY_PHONE_NUMBER")
    @Size(min = 10, max = 15)
    private String userSecondaryPhoneNumber;

    @Column(name="USER_DOB", nullable = false)
    @NotNull
    private String userDob;

    @Column(name="USER_ZIP_CODE", nullable = false)
    @NotNull
    @Size(min = 5, max = 10)
    private String userZipCode;

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
    private String userCompanyZip;

    public CompleteRegistrationEntity() {
    }

    public CompleteRegistrationEntity(Long userId, String userEmail, String userFullName, String userCountry,
                                      String userCity, String userAddress, String userPhoneNumber, String userSecondaryPhoneNumber,
                                      String userDob, String userZipCode, String userCompanyName, Long userEmployeesCount,
                                      String userCompanyCountry, String userCompanyCity, String userCompanyAddress,
                                      String userCompanyZip) {
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

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserSecondaryPhoneNumber() {
		return userSecondaryPhoneNumber;
	}

	public void setUserSecondaryPhoneNumber(String userSecondaryPhoneNumber) {
		this.userSecondaryPhoneNumber = userSecondaryPhoneNumber;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public String getUserZipCode() {
		return userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
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

	public String getUserCompanyZip() {
		return userCompanyZip;
	}

	public void setUserCompanyZip(String userCompanyZip) {
		this.userCompanyZip = userCompanyZip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
