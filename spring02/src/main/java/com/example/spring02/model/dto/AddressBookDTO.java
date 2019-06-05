package com.example.spring02.model.dto;

import java.util.Date;

public class AddressBookDTO {
	private String userid;
	private String passwd;
	private String name;
	private String birthday;
	private String callnum;
	private Date join_date;
	
	public AddressBookDTO() {
		super();
	}

	public AddressBookDTO(String userid, String passwd, String name, String birthday, String callnum, Date join_date) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.callnum = callnum;
		this.join_date = join_date;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCallnum() {
		return callnum;
	}

	public void setCallnum(String callnum) {
		this.callnum = callnum;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", birthday=" + birthday
				+ ", callnum=" + callnum + ", join_date=" + join_date + "]";
	}
}
