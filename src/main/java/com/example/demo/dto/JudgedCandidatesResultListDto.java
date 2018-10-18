package com.example.demo.dto;

public class JudgedCandidatesResultListDto {
  //メンバーの名前を返します
  private String memberName;
  //入隊資格があるか判定します
  private boolean enlistedPropriety;

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public boolean getEnlisted_propriety() {
    return enlistedPropriety;
  }

  public void setEnlisted_propriety(boolean enlistedPropriety) {
    this.enlistedPropriety = enlistedPropriety;
  }



}
