package com.UST.InterviewScheduler.candidateform.repository;

import com.UST.InterviewScheduler.candidateform.entity.CandidateResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo  extends JpaRepository<CandidateResume,Long> {

}
