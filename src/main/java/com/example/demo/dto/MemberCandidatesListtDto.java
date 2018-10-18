package com.example.demo.dto;

public class MemberCandidatesListtDto {
//	隊員氏名
	private String memberName;
//	イベント企画力
	private int eventPlanninng;
//	思考力
	private int cogitation;
//	調整力
	private int coordination;
//	プログラム製造力
	private int programmingAbiliy;
//	基盤理解
	private int infrastructureKnowledge;




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



	public int getInfrastructureKnowledge() {
		return infrastructureKnowledge;
	}

	public void setInfrastructureKnowledge(int infrastructureKnowledge) {
		this.infrastructureKnowledge = infrastructureKnowledge;
	}

	public int getProgrammingAbiliy() {
		return programmingAbiliy;
	}

	public void setProgrammingAbiliy(int programmingAbiliy) {
		this.programmingAbiliy = programmingAbiliy;
	}

	public int getEventPlanninng() {
		return eventPlanninng;
	}

	public void setEventPlanninng(int eventPlanninng) {
		this.eventPlanninng = eventPlanninng;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


}