package com.UST.InterviewScheduler.candidateform.repository;


import com.UST.InterviewScheduler.candidateform.entity.CandidatePhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepo extends JpaRepository<CandidatePhoto,Long> {
}
