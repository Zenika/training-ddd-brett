package com.brett.location.domains.reservation.domain.repository;

import com.brett.location.domains.reservation.domain.model.Reservation;

import java.util.UUID;

public interface ReservationRepository {

    public Reservation rechercherParId(UUID idReservation);

}
