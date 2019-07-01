package com.example.spring02.model.dto;

import java.util.Date;

public class BoardDTO {
	private int seq;
	private String title;
	private String content;
	private String userid;
	private Date join_date;
	
	public BoardDTO() {
	}

	public BoardDTO(int seq, String title, String content, String userid, Date join_date) {
		super();
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.userid = userid;
		this.join_date = join_date;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", title=" + title + ", content=" + content + ", userid=" + userid
				+ ", join_date=" + join_date + "]";
	} 
}


