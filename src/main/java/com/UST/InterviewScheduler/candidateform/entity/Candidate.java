package com.UST.InterviewScheduler.candidateform.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="candidate")
public class Candidate {
    @Id
    @GeneratedValue
    private int candidateId;
    private String candidateName;
    private String panNumber;
    private String aadharNumber;
    private int experience;
    private String skill;
    private String time;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

}
