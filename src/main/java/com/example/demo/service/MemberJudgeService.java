package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.MemberCandidatesListtDto;
import com.example.demo.dto.JudgedCandidatesResultListDto;

@Service
public interface MemberJudgeService {

	public JudgedCandidatesResultListDto judge(MemberCandidatesListtDto dto);

}
