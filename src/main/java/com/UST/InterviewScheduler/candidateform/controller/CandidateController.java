package com.UST.InterviewScheduler.candidateform.controller;

import com.UST.InterviewScheduler.candidateform.entity.Candidate;
import com.UST.InterviewScheduler.candidateform.entity.CandidateResume;
import com.UST.InterviewScheduler.candidateform.service.CandidateService;
import com.UST.InterviewScheduler.candidateform.service.PhotoService;
import com.UST.InterviewScheduler.candidateform.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private CandidateService service;
    @Autowired
    private PhotoService photoService;
    @Autowired
    private ResumeService resumeService;


    @PostMapping("/add")
    public Candidate addDetails(@RequestBody Candidate candidate) {
        return service.addCandidateDetails(candidate);
    }
    @PostMapping("/picture")
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
        String uploadImage = photoService.uploadImage(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
    }
    @PostMapping("/resume")
    public ResponseEntity<?> uploadResume(@RequestParam("pdf") MultipartFile file) throws IOException {
        String uploadImage = resumeService.uploadPdf(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
    }




}



