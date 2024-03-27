package com.brett.location.domains.parc.domain.repository;

import com.brett.location.domains.parc.domain.model.entity.Velo;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;

import java.util.List;
import java.util.UUID;

public interface VeloRepository {

    Velo rechercherParId(UUID id);

    List<Velo> rechercherParCaracteristiqueEtEtat(Caracteristique caracteristique, Etat etat);

    UUID sauvegarder(Velo velo);

}
