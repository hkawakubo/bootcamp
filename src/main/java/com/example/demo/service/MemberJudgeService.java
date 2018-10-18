package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.JudgedCandidatesResultListDto;
import com.example.demo.dto.MemberCandidatesListtDto;

@Service
public interface MemberJudgeService {

  public JudgedCandidatesResultListDto judge(MemberCandidatesListtDto dto);

}
