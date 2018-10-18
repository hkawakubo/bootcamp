package com.example.demo.service.impl;
import org.springframework.stereotype.Service;

import com.example.demo.dto.JudgedCandidatesResultListDto;
import com.example.demo.dto.MemberCandidatesListtDto;
import com.example.demo.service.MemberJudgeService;


@Service
public class MemberJudgeServiceImpl implements MemberJudgeService {
  @Override
public JudgedCandidatesResultListDto judge(MemberCandidatesListtDto dto) {

	  //コントローラーに返却するクラスを初期化します.
	  JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
	try {
    //イベント企画力が1以下または調整力が1以下の場合falseで返す
    if ((dto.getEventPlanninng() <= 1) || (dto.getCoordination() <= 1)) {
      result.setMemberName(dto.getMemberName());
      result.setEnlisted_propriety(false);
    } else if ((dto.getEventPlanninng()//合計が１０点以下の場合もfalseで返す
        + dto.getCogitation()
        + dto.getCoordination()
        + dto.getProgrammingAbiliy()
        + dto.getInfrastructureKnowledge() <= 10)) {
      result.setMemberName(dto.getMemberName());
      result.setEnlisted_propriety(false);
    } else {
      //それ以外の場合trueで返す;
      result.setMemberName(dto.getMemberName());
      result.setEnlisted_propriety(true);
    }
	} catch(Exception e) {
		e.printStackTrace();
		e.getStackTrace();
	}
	return result;

  }
}
