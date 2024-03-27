package com.brett.location.domains.parc.infrastructure.persistence;

import com.brett.location.domains.parc.infrastructure.persistence.entity.Velo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VeloSpringDataRepository extends CrudRepository<Velo, UUID> {
}
