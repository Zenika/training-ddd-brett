package com.brett.location.domains.reservation.domain.model;

import java.util.UUID;
public class Reservation {

    public UUID getId() {
        return id;
    }

    public UUID getEmpreinteBancaireId() {
        return empreinteBancaireId;
    }

    public Period getPeriod() {
        return period;
    }

    public UUID getPickupId() {
        return pickupId;
    }

    public UUID getVeloId() {
        return veloId;
    }

    public UUID getClientId() {
        return clientId;
    }

    public Etat getEtat() {
        return etat;
    }

    private final UUID id;
    private final UUID empreinteBancaireId;

    private final Period period;

    private final UUID pickupId;

    private final UUID veloId;
    private final UUID clientId;

    private final Etat etat;

    public Reservation(UUID id, UUID empreinteBancaireId, Period period, UUID pickupId, UUID veloId, UUID clientId, Etat etat) {
        validate(id, empreinteBancaireId, period, pickupId);

        this.id = id;
        this.empreinteBancaireId = empreinteBancaireId;
        this.period = period;
        this.pickupId = pickupId;
        this.veloId = veloId;
        this.clientId = clientId;
        this.etat = etat;
    }

    private void validate(UUID id, UUID empreinteBancaireId, Period period, UUID pickupId) {
    }

}
