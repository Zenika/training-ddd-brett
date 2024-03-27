package com.brett.location.domains.partenaires.application;

import com.brett.location.domains.reservation.domain.event.ReservationValide;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ReservationEventListener {

    @EventListener
    public void nouvelleReservationRecu(ReservationValide reservation) {

    }

}
