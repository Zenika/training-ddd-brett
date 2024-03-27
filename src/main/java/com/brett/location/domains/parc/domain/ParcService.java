package com.brett.location.domains.parc.domain;

import com.brett.location.domains.parc.domain.model.entity.Velo;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;
import com.brett.location.domains.parc.domain.repository.VeloRepository;

import java.util.List;
import java.util.UUID;

public class ParcService {

    private final VeloRepository veloRepository;

    public ParcService(VeloRepository veloRepository) {
        this.veloRepository = veloRepository;
    }

    public UUID ajouterVelo(Velo velo) {
        return veloRepository.sauvegarder(velo);
    }


    public void changerEtat(UUID idVelo, Etat nouvelEtat) {
        if (idVelo == null) {
            throw new IllegalArgumentException("IdVelo ne doit pas être null");
        }
        if (nouvelEtat == null) {
            throw new IllegalArgumentException("nouvelEtat ne doit pas être null");
        }
        var velo = veloRepository.rechercherParId(idVelo);
        velo.setEtat(nouvelEtat);
        veloRepository.sauvegarder(velo);
    }

    public void retirerVelo(UUID idVelo) {
        if (idVelo == null) {
            throw new IllegalArgumentException("idVelo ne doit pas être null");
        }
        changerEtat(idVelo, Etat.RETIRER);
    }

    public List<Velo> rechercherVelosDisponibles(Caracteristique caracteristique) {
        return veloRepository.rechercherParCaracteristiqueEtEtat(caracteristique, Etat.DISPONIBLE);
    }

    public List<Velo> rechercherAlternativesDisponibles(Caracteristique caracteristique) {
        // par état disponible
        throw new RuntimeException("");
        // valider l'algo de calcul d'alternative
    }

}
