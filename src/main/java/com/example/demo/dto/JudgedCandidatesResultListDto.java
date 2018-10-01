package com.example.demo.dto;

public class JudgedCandidatesResultListDto {
//	メンバーの名前を返します
	private String member_name;
//入隊資格があるか判定します
	private boolean enlisted_propriety;

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public boolean getEnlisted_propriety() {
		return enlisted_propriety;
	}

	public void setEnlisted_propriety(boolean enlisted_propriety) {
		this.enlisted_propriety = enlisted_propriety;
	}



}
