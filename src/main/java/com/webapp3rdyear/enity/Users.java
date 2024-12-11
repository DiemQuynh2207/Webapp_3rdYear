package com.webapp3rdyear.enity;

import java.util.Date;

public class Users {
	
	private int userId; 
    private String fullname;
    private String address;
    private boolean gender; 
    private String phone; 
    private String Dob;
    private String cid;
    private String avatar;
    private int userType; 
    private Integer kpi; 
    private String area; 
    private String email;
    
    public Users() {
		super();
	}

	public Users(int userId, String fullname, String address, boolean gender, String phone, String Dob, String cid,
			String avatar, int userType, Integer kpi, String area, String email) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.Dob = Dob;
		this.cid = cid;
		this.avatar = avatar;
		this.userType = userType;
		this.kpi = kpi;
		this.area = area;
		this.email = email;
	}
	
	// Customer
	public Users(int userId, String fullname, String address,String email, String phone, String Dob, String cid,
			String avatar,  boolean gender) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.Dob = Dob;
		this.cid = cid;
		this.avatar = avatar;
		this.gender = gender;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
	
	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		this.Dob = dob;
	}

	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public Integer getKpi() {
		return kpi;
	}

	public void setKpi(Integer kpi) {
		this.kpi = kpi;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullname=" + fullname + ", address=" + address + ", gender=" + gender
				+ ", phone=" + phone + ", dob=" + Dob + ", cid=" + cid + ", avatar=" + avatar + ", userType=" + userType
				+ ", kpi=" + kpi + ", area=" + area + ", email=" + email + "]";
	}

    
}

	

	
