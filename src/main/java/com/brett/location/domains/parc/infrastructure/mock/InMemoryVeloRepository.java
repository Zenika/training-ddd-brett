package com.brett.location.domains.parc.infrastructure.mock;

import com.brett.location.domains.parc.domain.model.entity.Velo;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;
import com.brett.location.domains.parc.domain.repository.VeloRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InMemoryVeloRepository implements VeloRepository {

    private Map<UUID, Velo> database = new HashMap<>();

    @Override
    public Velo rechercherParId(UUID id) {
        return database.get(id);
    }

    @Override
    public List<Velo> rechercherParCaracteristiqueEtEtat(Caracteristique caracteristique, Etat etat) {
        return database.values().stream()
                .filter(velo -> etat.equals(velo.getEtat()))
                .filter(velo -> caracteristique.nom().equals(velo.getCaracteristique().nom()))
                .toList();
    }

    @Override
    public UUID sauvegarder(Velo velo) {
        database.put(velo.getId(), velo);

        return velo.getId();
    }
}
