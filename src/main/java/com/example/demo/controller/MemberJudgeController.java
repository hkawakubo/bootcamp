package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JudgedCandidatesResultListDto;
import com.example.demo.dto.MemberCandidatesListtDto;
import com.example.demo.service.MemberJudgeService;

@RestController
public class MemberJudgeController {

  @Autowired
  MemberJudgeService memberJudgeService;
  @RequestMapping(value = "/bootcamp", method = RequestMethod.POST)
  public JudgedCandidatesResultListDto bootcamp(@RequestBody MemberCandidatesListtDto dto) {
  //結果のクラスをnewします
    JudgedCandidatesResultListDto response = new  JudgedCandidatesResultListDto();

    if (this.checkInput(dto)) {
      // 適正を判定してレスポンスを作成します.
      response = memberJudgeService.judge(dto);
    } else {
      //checkinputメソッドで不正があった場合はnullで返します
      return null;
    }
    return response;

  }

  // 入力されたDTOの不正をチェックします.
  private boolean checkInput(MemberCandidatesListtDto dto) {
    //各項目の文字数を取得
    int eventplanning = dto.getEventPlanninng();
    int cogitation = dto.getCogitation();
    int coordination = dto.getCoordination();
    int programmming_ability = dto.getProgrammingAbiliy();
    int infrastructure_knowledge = dto.getInfrastructureKnowledge();
    if(
      //各項目の文字数を判定
        ((eventplanning >= 6) || (eventplanning < 0))
        || ((cogitation >= 6) || (cogitation < 0))
        || ((coordination >= 6) || (coordination < 0))
        || ((programmming_ability >= 6) || (programmming_ability < 0))
        || ((infrastructure_knowledge >= 6) || (infrastructure_knowledge < 0))
    ) {
      return false;
    }
    return true;
  }

}

