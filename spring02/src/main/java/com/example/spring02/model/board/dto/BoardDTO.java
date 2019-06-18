package com.example.spring02.model.board.dto;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class BoardDTO {
	private int bno;
	private String title;
	private String content;
	private String userid;
	private Date regdate;
	private int viewcnt;	//조회수
	private String name;		//작성자 이름(조인)
	private int cnt;		//댓글 갯수
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", userid=" + userid + 
				", regdate=" + regdate + ", viewcnt=" + viewcnt + ", name=" + name + ", cnt=" + cnt + "]";
	}

}
