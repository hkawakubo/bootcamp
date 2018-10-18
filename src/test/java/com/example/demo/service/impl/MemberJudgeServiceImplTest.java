package com.example.demo.service.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.JudgedCandidatesResultListDto;
import com.example.demo.dto.MemberCandidatesListtDto;
import com.example.demo.service.MemberJudgeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberJudgeServiceImplTest {

  @Autowired
  MemberJudgeService memberJudgeService;


  @Test
  public void test0001() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //イベント企画力が1以下の場合falseで返す
    dto.setCogitation(5);
    dto.setMemberName("test memneber");
    dto.setCoordination(5);
    dto.setEventPlanninng(0);
    dto.setInfrastructureKnowledge(5);
    dto.setProgrammingAbiliy(5);

    JudgedCandidatesResultListDto result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(),is(false));

  }

  @Test
  public void test0002() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //調整力が1以下の場合falseで返す
    dto.setCogitation(5);
    dto.setCoordination(0);
    dto.setEventPlanninng(5);
    dto.setInfrastructureKnowledge(5);
    dto.setProgrammingAbiliy(5);
    dto.setMemberName("test memneber");
    JudgedCandidatesResultListDto result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(), is(false));
  }

  @Test
  public void test0003() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //合計が１０点以下の場合falseで返す(イベント企画力、調整力2以上）
    dto.setCogitation(1);
    dto.setCoordination(2);
    dto.setEventPlanninng(2);
    dto.setInfrastructureKnowledge(1);
    dto.setProgrammingAbiliy(1);
    dto.setMemberName("test memneber");
    JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
    result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(), is(false));
  }
  @Test
  public void test0004() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //合計が１０点以上の場合trueで返す(イベント企画力、調整力2以上）
    dto.setCogitation(3);
    dto.setCoordination(2);
    dto.setEventPlanninng(2);
    dto.setInfrastructureKnowledge(3);
    dto.setProgrammingAbiliy(3);
    dto.setMemberName("test memneber");
    JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
    result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(), is(true));
  }
  @Test
  public void test0005() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //合計が１０点以下の場合falseで返す(イベント企画力1以下、調整力2以上）
    dto.setCogitation(3);
    dto.setCoordination(3);
    dto.setEventPlanninng(0);
    dto.setInfrastructureKnowledge(3);
    dto.setProgrammingAbiliy(3);
    dto.setMemberName("test memneber");
    JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
    result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(), is(false));
  }
  @Test
  public void test0006() {
    MemberCandidatesListtDto dto = new MemberCandidatesListtDto();
    //合計が１０点以下の場合falseで返す(イベント企画力2以上、調整力1以下）
    dto.setCogitation(3);
    dto.setCoordination(1);
    dto.setEventPlanninng(3);
    dto.setInfrastructureKnowledge(3);
    dto.setProgrammingAbiliy(3);
    dto.setMemberName("test memneber");
    JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
    result = memberJudgeService.judge(dto);

    assertThat(result.getEnlisted_propriety(), is(false));
  }
}
