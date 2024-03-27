package com.brett.location.domains.parc.domain.model.entity;

import com.brett.location.domains.parc.domain.model.error.InvalidVeloException;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.CategoriePrix;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;

import java.util.ArrayList;
import java.util.UUID;

public class Velo {

    private final UUID id;

    private final Caracteristique caracteristique;

    private final UUID pickupIdDepart;

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    private Etat etat;

    private final CategoriePrix categoriePrix;


    public Velo(UUID id, Caracteristique caracteristique, UUID pickupIdDepart, Etat etat, CategoriePrix categoriePrix) throws InvalidVeloException {
        validate(id, caracteristique, pickupIdDepart, etat, categoriePrix);

        this.id = id;
        this.caracteristique = caracteristique;
        this.pickupIdDepart = pickupIdDepart;
        this.etat = etat;
        this.categoriePrix = categoriePrix;
    }

    private void validate(UUID id, Caracteristique caracteristique, UUID pickupIdDepart, Etat etat, CategoriePrix categoriePrix)
            throws InvalidVeloException {
        var errorMessages = new ArrayList<String>();
        if (id == null) {
            errorMessages.add("Id obligatoire");
        }
        if (caracteristique == null) {
            errorMessages.add("Caracteristique obligatoire");
        }

        if(!errorMessages.isEmpty()) {
            throw new InvalidVeloException("Velo invalide", errorMessages);
        }
    }

    public UUID getId() {
        return id;
    }

    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    public UUID getPickupIdDepart() {
        return pickupIdDepart;
    }

    public Etat getEtat() {
        return etat;
    }

    public CategoriePrix getCategoriePrix() {
        return categoriePrix;
    }
}
