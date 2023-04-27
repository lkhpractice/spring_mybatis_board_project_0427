package com.lkhpractice.mbtsboard.dao;

public interface IDao {
	
	public void joinMemberDao(String mid, String mpw, String mname, String memail); // 회원 가입
	public int checkIdDao(String mid); // 회원가입 여부 체크(아이디 중복 여부 체크)
	
}
