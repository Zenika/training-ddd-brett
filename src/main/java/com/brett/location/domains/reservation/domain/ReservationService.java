package com.brett.location.domains.reservation.domain;

import com.brett.location.domains.reservation.domain.model.Reservation;
import com.brett.location.domains.reservation.domain.repository.NotificationRepository;
import com.brett.location.domains.reservation.domain.repository.ReservationRepository;

import java.util.UUID;

public class ReservationService {


    private final NotificationRepository notificationRepository;

    private final ReservationRepository reservationRepository;

    public ReservationService(NotificationRepository notificationRepository, ReservationRepository reservationRepository) {
        this.notificationRepository = notificationRepository;
        this.reservationRepository = reservationRepository;
    }

    public void enregistrerReservation(Reservation reservation) {

    }

    public void annulerReservation(UUID idReservation) {

    }


    public Double calculePrix(Reservation reservation) {
        throw new RuntimeException();
    }

    public void envoyerNotice(UUID idReservation) {
        var reservation = reservationRepository.rechercherParId(idReservation);

        notificationRepository.envoyerNotice(reservation.getClientId());

    }


}
