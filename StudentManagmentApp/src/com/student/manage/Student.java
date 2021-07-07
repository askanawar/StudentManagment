package com.student.manage;
// Class to collect & Store data temp...
public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentPhone;
	private String studentCollage;
	private String studentRoll;
	private String studentGender;
	private int studentTenPercent;
	private int studentTwelvePercent;
	private int studentGraduationPercent;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCollage() {
		return studentCollage;
	}
	public void setStudentCollage(String studentCollage) {
		this.studentCollage = studentCollage;
	}
	public String getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public int getStudentTenPercent() {
		return studentTenPercent;
	}
	public void setStudentTenPercent(int studentTenPercent) {
		this.studentTenPercent = studentTenPercent;
	}
	public int getStudentTwelvePercent() {
		return studentTwelvePercent;
	}
	public void setStudentTwelvePercent(int studentTwelvePercent) {
		this.studentTwelvePercent = studentTwelvePercent;
	}
	public int getStudentGraduationPercent() {
		return studentGraduationPercent;
	}
	public void setStudentGraduationPercent(int studentGraduationPercent) {
		this.studentGraduationPercent = studentGraduationPercent;
	}
	public Student(int studentId, String studentName, String studentEmail, String studentPhone, String studentCollage,
			String studentRoll, String studentGender, int studentTenPercent, int studentTwelvePercent,
			int studentGraduationPercent) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.studentCollage = studentCollage;
		this.studentRoll = studentRoll;
		this.studentGender = studentGender;
		this.studentTenPercent = studentTenPercent;
		this.studentTwelvePercent = studentTwelvePercent;
		this.studentGraduationPercent = studentGraduationPercent;
	}
	public Student(String studentName, String studentEmail, String studentPhone, String studentCollage,
			String studentRoll, String studentGender, int studentTenPercent, int studentTwelvePercent,
			int studentGraduationPercent) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.studentCollage = studentCollage;
		this.studentRoll = studentRoll;
		this.studentGender = studentGender;
		this.studentTenPercent = studentTenPercent;
		this.studentTwelvePercent = studentTwelvePercent;
		this.studentGraduationPercent = studentGraduationPercent;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentPhone=" + studentPhone + ", studentCollage=" + studentCollage + ", studentRoll="
				+ studentRoll + ", studentGender=" + studentGender + ", studentTenPercent=" + studentTenPercent
				+ ", studentTwelvePercent=" + studentTwelvePercent + ", studentGraduationPercent="
				+ studentGraduationPercent + "]";
	}
	
	
	
	
}
