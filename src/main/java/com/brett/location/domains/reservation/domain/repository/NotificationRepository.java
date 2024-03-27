package com.brett.location.domains.reservation.domain.repository;

import java.util.UUID;

public interface NotificationRepository {

    void envoyerNotice(UUID idClient);

}
