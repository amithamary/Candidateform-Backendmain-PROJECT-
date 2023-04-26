package com.UST.InterviewScheduler.candidateform.service;

import com.UST.InterviewScheduler.candidateform.entity.CandidatePhoto;
import com.UST.InterviewScheduler.candidateform.repository.PhotoRepo;
import com.UST.InterviewScheduler.candidateform.utils.ImageUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepo photoRepo;

    public String uploadImage(MultipartFile file) throws IOException {
        CandidatePhoto imageData = photoRepo.save(
                CandidatePhoto.builder()
                        .name(file.getOriginalFilename())
                        .type(file.getContentType())
                        .imageData(ImageUtils.compressImage(file.getBytes())).build()
        );

        if (imageData != null) {
            return "File Uploaded Successfully: " + file.getOriginalFilename();
        }

        return null;

    }
}
