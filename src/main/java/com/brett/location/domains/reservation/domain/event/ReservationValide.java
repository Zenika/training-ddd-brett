package com.brett.location.domains.reservation.domain.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record ReservationValide(UUID idPickupDepart, UUID idVelo, LocalDateTime dateDebut) {
}
