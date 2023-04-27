package com.lkhpractice.mbtsboard.dto;

import java.sql.Timestamp;

public class FreeBoardDto {
	
	private int fnum; 			// 게시글 번호(기본기)
	private String fid; 		// 게시자 id
	private String fname; 		// 게시자 이름
	private String ftitle; 		// 게시글 제목
	private String fcontent; 	// 게시글 내용
	private int fhit;			// 게시글 조회수
	private Timestamp fdate; 	// 게시글 등록일시
	
	public FreeBoardDto() {
		super();
	}

	public FreeBoardDto(int fnum, String fid, String fname, String ftitle, String fcontent, int fhit, Timestamp fdate) {
		super();
		this.fnum = fnum;
		this.fid = fid;
		this.fname = fname;
		this.ftitle = ftitle;
		this.fcontent = fcontent;
		this.fhit = fhit;
		this.fdate = fdate;
	}

	public int getFnum() {
		return fnum;
	}

	public void setFnum(int fnum) {
		this.fnum = fnum;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtitle() {
		return ftitle;
	}

	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}

	public String getFcontent() {
		return fcontent;
	}

	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}

	public int getFhit() {
		return fhit;
	}

	public void setFhit(int fhit) {
		this.fhit = fhit;
	}

	public Timestamp getFdate() {
		return fdate;
	}

	public void setFdate(Timestamp fdate) {
		this.fdate = fdate;
	}
	
}
