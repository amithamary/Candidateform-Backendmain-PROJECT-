package com.UST.InterviewScheduler.candidateform.service;

import com.UST.InterviewScheduler.candidateform.entity.Candidate;
import com.UST.InterviewScheduler.candidateform.repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    @Autowired
    public CandidateRepo repo;
    public Candidate addCandidateDetails(Candidate candidate) {
         return repo.save(candidate);
    }
}
