package org.deloitte.sms.studentregistration.beans;

import java.util.Date;

public class Student_Info {
	
	private String student_Id;
	private String student_Name;
	private Date date_Of_Birth;
	private char gurdian_Type;
	private String gurdian_Name;
	private String address;
	private String country_Id;
	private String contact_No;     // int will not take 10 digits how to map
	private String mail_Id;
	private char gender;
	private String standard;
	private char standard_Category;
	private char transport;
	private double net_Fees;
	
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public char getGurdian_Type() {
		return gurdian_Type;
	}
	public void setGurdian_Type(char gurdian_Type) {
		this.gurdian_Type = gurdian_Type;
	}
	public String getGurdian_Name() {
		return gurdian_Name;
	}
	public void setGurdian_Name(String gurdian_Name) {
		this.gurdian_Name = gurdian_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}
	public String getContact_No() {
		return contact_No;
	}
	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}
	public String getMail_Id() {
		return mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		this.mail_Id = mail_Id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getStandard_Category() {
		return standard_Category;
	}
	public void setStandard_Category(char standard_Category) {
		this.standard_Category = standard_Category;
	}
	public char getTransport() {
		return transport;
	}
	public void setTransport(char transport) {
		this.transport = transport;
	}
	public double getNet_Fees() {
		return net_Fees;
	}
	public void setNet_Fees(double net_Fees) {
		this.net_Fees = net_Fees;
	}
	
	
}
