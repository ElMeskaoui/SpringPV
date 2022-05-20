package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int contreInconnu;
    private String referencePlaints;
    private Date datePlaints;
    private Date dateEnregPlaints;
    private Date dateFaits;
    private String emplaceFaits;
    private String sujetPlaints;
    @ManyToOne
    @JoinColumn(name = "TypePlaintID")
    private TypePlaints typePlaints;
    @ManyToOne
    @JoinColumn(name = "SourcePlaintID")
    private SourcePlaints sourcePlaints;
}
