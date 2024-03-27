package com.brett.location.domains.parc.infrastructure.persistence;

import com.brett.location.domains.parc.domain.model.entity.Velo;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;
import com.brett.location.domains.parc.domain.repository.VeloRepository;

import java.util.List;
import java.util.UUID;

public class JpaVeloRepository implements VeloRepository {
    @Override
    public Velo rechercherParId(UUID id) {
        return null;
    }

    @Override
    public List<Velo> rechercherParCaracteristiqueEtEtat(Caracteristique caracteristique, Etat etat) {
        return null;
    }

    @Override
    public UUID sauvegarder(Velo velo) {
        return null;
    }
}
