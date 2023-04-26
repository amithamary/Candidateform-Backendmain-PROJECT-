package com.UST.InterviewScheduler.candidateform.service;

import com.UST.InterviewScheduler.candidateform.entity.CandidateResume;
import com.UST.InterviewScheduler.candidateform.repository.ResumeRepo;
import com.UST.InterviewScheduler.candidateform.utils.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
@Service
public class ResumeService {

    @Autowired
    private ResumeRepo resumeRepo;
    public String uploadPdf(MultipartFile file) throws IOException {
       CandidateResume imageData = resumeRepo.save(
               CandidateResume.builder()
                        .name(file.getOriginalFilename())
                        .type(file.getContentType())
                        .resumeData(ImageUtils.compressImage(file.getBytes())).build()
        );

        if(imageData != null) {
            return "File Uploaded Successfully: " + file.getOriginalFilename();
        }

        return null;
    }
    }









