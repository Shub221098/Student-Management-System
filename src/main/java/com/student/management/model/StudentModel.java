package com.student.management.model;
public class StudentModel {
	private String rollno;
	private String firstname;
    private String middlename;
    private String lastname;
    private String fathername;
    private String mothername;
    private String gender;
    private String aadhar;
    private String dob;
    private String phoneno;
    private String password;

	public StudentModel(String rollno, String firstname, String middlename, String lastname, String fathername,
			String mothername, String gender, String aadhar, String dob) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.gender = gender;
		this.aadhar = aadhar;
		this.dob = dob;
	}
	public StudentModel(String rollno, String firstname, String middlename, String lastname, String fathername,
			String mothername, String gender, String aadhar, String dob, String password) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.gender = gender;
		this.aadhar = aadhar;
		this.dob = dob;
		this.password = password;
	}
	public String getRollno() {
        return rollno;
    }
    public void setRollno(String Rollno) {
        this.rollno = Rollno;
    }
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstName) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    
    public void setLastName(String lastName) {
        this.lastname = lastname;
    }
    public String getMiddleName() {
        return middlename;
    }
    public void setMiddleName(String middlename) {
        this.middlename = middlename;
    }
    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }
    public String getMotherName() {
        return mothername;
    }
    public void setMotherName(String mothername) {
        this.mothername = mothername;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAadhar() {
        return aadhar;
    }
    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
    public String getDOB() {
        return dob;
    }
    public void setDOB(String dob) {
        this.dob = dob;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
