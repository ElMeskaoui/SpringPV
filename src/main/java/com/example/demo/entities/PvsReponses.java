package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PvsReponses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date numEnvoi;
    private Date datePvs;
    private Date heureRealisation;
    private int contreInnconue;
    @ManyToOne
    @JoinColumn(name = "typePoliceJudicID")
    private TypePoliceJudics typepolicejudics;

}
