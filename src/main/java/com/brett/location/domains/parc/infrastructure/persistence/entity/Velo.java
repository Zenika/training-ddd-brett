package com.brett.location.domains.parc.infrastructure.persistence.entity;

import com.brett.location.domains.parc.domain.model.valueobject.CategoriePrix;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;
import com.brett.location.domains.parc.domain.model.valueobject.Type;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Velo {

    @Id
    private UUID id;

    @Column
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @Column
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column
    private UUID pickupIdDepart;

    @Column
    @Enumerated(EnumType.STRING)
    private CategoriePrix categoriePrix;
    @Column
    private String marque;
    @Column
    private String nom;

    @Column
    private int annee;

}
