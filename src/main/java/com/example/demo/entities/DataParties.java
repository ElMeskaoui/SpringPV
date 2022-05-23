package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DataParties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String soi;
    private String morale;
    private String genre;
    private String prenom;
    private String NumCarte;
    private String NomDePere;
    private String FilsDe;
    private String NomDeMere;
    private String FilleDe;
    private String DataPartieCol;
    private String Profession;
    private String LieuDeTravail;
    private String NumFinan;
    private Date DateNaiss;
    private String DataPersonnecol;
    @ManyToOne
    @JoinColumn(name = "PersonneMoraleID")
    private PersonneMorales personneMorales;
    @ManyToOne
    @JoinColumn(name = "PaysID")
    private Pays pays;
    @ManyToOne
    @JoinColumn(name = "TypeCarteIdentsID")
    private TypeCarteIdents typeCarteIdents;
    @ManyToOne
    @JoinColumn(name = "SituationFamillID")
    private SituationFamill situationFamill;
    @ManyToOne
    @JoinColumn(name = "VilleDeNaissID")
    private VilleDeNaiss villeDeNaiss;
    @ManyToOne
    @JoinColumn(name = "ProvinceID")
    private Province province;
    @ManyToOne
    @JoinColumn(name = "NationaliteID")
    private Nationalite nationalite;

    @OneToMany(targetEntity = PvsHasDataParties.class, mappedBy = "dataParties")
    private Collection<PvsHasDataParties> pvsHasDataParties;
}
