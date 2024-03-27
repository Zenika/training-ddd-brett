package com.brett.location.domains.reservation.application;

import com.brett.location.domains.reservation.domain.ReservationService;
import com.brett.location.domains.reservation.domain.event.ReservationValide;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReservationApplicationService {

    private final ReservationService reservationService;

    private final ApplicationEventPublisher eventPublisher;

    public ReservationApplicationService(ReservationService reservationService, ApplicationEventPublisher eventPublisher) {
        this.reservationService = reservationService;
        this.eventPublisher = eventPublisher;
    }

    @Scheduled(cron = "0 0 * * * ")
    public void sendNotification() {
        // Rechercher les reservations de demain
        // Envoyer les notifications pour chacune
    }

    public void creerReservation() {
        // Appeler le service du domaine lié à la reservation
        eventPublisher.publishEvent(new ReservationValide(null, null, null));
    }
}
