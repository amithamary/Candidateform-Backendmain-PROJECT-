package com.UST.InterviewScheduler.candidateform.repository;

import com.UST.InterviewScheduler.candidateform.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate,Integer> {
}
