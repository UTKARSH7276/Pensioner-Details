package com.pdm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {

	private String name;
	private String DOB;
	private String PAN;
	private Integer salaryEarned;
	private Integer allownces;
	private String pensionType;
	private String bankName;
	private Integer accNo;
	private String bankType;
	@Id
	private Long aadhar;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public Integer getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(Integer salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public Integer getAllownces() {
		return allownces;
	}
	public void setAllownces(Integer allownces) {
		this.allownces = allownces;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public Details(String name, String dOB, String pAN, Integer salaryEarned, Integer allownces, String pensionType,
			String bankName, Integer accNo, String bankType, Long aadhar) {
		super();
		this.name = name;
		DOB = dOB;
		PAN = pAN;
		this.salaryEarned = salaryEarned;
		this.allownces = allownces;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accNo = accNo;
		this.bankType = bankType;
		this.aadhar = aadhar;
	}
	public Details() {
		super();
	}
	
	
}