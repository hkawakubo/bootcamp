package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.dto.JudgedCandidatesResultListDto;
import com.example.demo.dto.MemberCandidatesListtDto;
import com.example.demo.service.MemberJudgeService;

@Service
public class MemberJudgeServiceImpl implements MemberJudgeService{

	@Override
	public JudgedCandidatesResultListDto judge(MemberCandidatesListtDto dto) {
		// コントローラーに返却するクラスを初期化します.
		JudgedCandidatesResultListDto result = new JudgedCandidatesResultListDto();
//		イベント企画力が０、調整力が０、合計が１０点以下の場合falseで返す
			if((dto.getEvent_planninng()<=1) ||
				(dto.getCoordination()<=1)||
				(dto.getEvent_planninng()+ dto.getCogitation()+dto.getCoordination()+
				dto.getProgramming_abiliy()+ dto.getInfrastructure_knowledge()<=10)) {
				result.setMember_name(dto.getMember_name());
				result.setEnlisted_propriety(false);
			  }
		 	else {
//		 		それ以外の場合trueで返す;
				result.setMember_name(dto.getMember_name());
				result.setEnlisted_propriety(true);
			 }
			return result;

	}
}
