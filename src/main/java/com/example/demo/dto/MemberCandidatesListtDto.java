package com.example.demo.dto;

public class MemberCandidatesListtDto {
//	隊員氏名
	private String member_name;
//	イベント企画力
	private int event_planninng;
//	思考力
	private int cogitation;
//	調整力
	private int coordination;
//	プログラム製造力
	private int programming_abiliy;
//	基盤理解
	private int infrastructure_knowledge;


	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_namee) {
		this.member_name = member_namee;
	}

	public int getEvent_planninng() {
		return event_planninng;
	}

	public void setEvent_planninng(int event_plannninng) {
		this.event_planninng = event_plannninng;
	}

	public int getCogitation() {
		return cogitation;
	}

	public void setCogitation(int cognitation) {
		this.cogitation = cognitation;
	}

	public int getCoordination() {
		return coordination;
	}

	public void setCoordination(int coordination) {
		this.coordination = coordination;
	}

	public int getProgramming_abiliy() {
		return programming_abiliy;
	}

	public void setProgramming_abiliy(int programming_abiliy) {
		this.programming_abiliy = programming_abiliy;
	}

	public int getInfrastructure_knowledge() {
		return infrastructure_knowledge;
	}

	public void setInfrastructure_knowledge(int infrastructure_knowledge) {
		this.infrastructure_knowledge = infrastructure_knowledge;
	}


}