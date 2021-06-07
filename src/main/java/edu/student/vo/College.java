package edu.student.vo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class College {
	private Integer collegeId;
	private String collegeName;
	private String collegeEmail;
	private String collegeAddress;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeEmail() {
		return collegeEmail;
	}
	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	/*
	 * public College(Integer collegeId, String collegeName, String collegeEmail,
	 * String collegeAddress, LocalDateTime createdDate, LocalDateTime updatedDate)
	 * { this.collegeId = collegeId; this.collegeName = collegeName;
	 * this.collegeEmail = collegeEmail; this.collegeAddress = collegeAddress;
	 * this.createdDate = createdDate; this.updatedDate = updatedDate; }
	 */
	
}
