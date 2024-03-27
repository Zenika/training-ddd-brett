package com.brett.location.domains.parc.domain;

import com.brett.location.domains.parc.domain.model.entity.Velo;
import com.brett.location.domains.parc.domain.model.error.InvalidVeloException;
import com.brett.location.domains.parc.domain.model.valueobject.Caracteristique;
import com.brett.location.domains.parc.domain.model.valueobject.CategoriePrix;
import com.brett.location.domains.parc.domain.model.valueobject.Etat;
import com.brett.location.domains.parc.infrastructure.mock.InMemoryVeloRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.brett.location.domains.parc.domain.model.valueobject.Type.VTT;

class ParcServiceTest {
    @Test
    public void ajouterVeloValide() throws Exception {
        var caracteristique =new Caracteristique("", "", VTT, 2023);
        var velo = new Velo(
                UUID.randomUUID(),
                caracteristique,
                UUID.randomUUID(),
                Etat.DISPONIBLE,
                CategoriePrix.MOYEN
        );

        var parcService = new ParcService(new InMemoryVeloRepository());
        var id = parcService.ajouterVelo(velo);
        Assertions.assertEquals(id, velo.getId());
    }

    @Test
    public void ajouterVeloInValide() {
        var caracteristique =new Caracteristique("", "", VTT, 2023);
        Assertions.assertThrows(InvalidVeloException.class, () ->new Velo(
                UUID.randomUUID(),
               null,
                null,
                null,
                null
        ));
    }

    @Test
    public void doitChangerEtatVelo() throws InvalidVeloException {
        var caracteristique =new Caracteristique("", "", VTT, 2023);
        var velo = new Velo(
                UUID.randomUUID(),
                caracteristique,
                UUID.randomUUID(),
                Etat.DISPONIBLE,
                CategoriePrix.MOYEN
        );
        var veloRepository = new InMemoryVeloRepository();
        var parcService = new ParcService(veloRepository);
        var idVelo = parcService.ajouterVelo(velo);

        parcService.changerEtat(idVelo, Etat.PERDU);

        velo = veloRepository.rechercherParId(idVelo);

        Assertions.assertEquals(velo.getEtat(), Etat.PERDU);
    }

    @Test
    public void doitRetournerVeloDisponible() throws InvalidVeloException {
        var caracteristique =new Caracteristique("", "", VTT, 2023);
        var velo = new Velo(
                UUID.randomUUID(),
                caracteristique,
                UUID.randomUUID(),
                Etat.DISPONIBLE,
                CategoriePrix.MOYEN
        );
        var veloRepository = new InMemoryVeloRepository();
        var parcService = new ParcService(veloRepository);
        var idVelo = parcService.ajouterVelo(velo);

        var velos = parcService.rechercherVelosDisponibles(caracteristique);
        Assertions.assertEquals(1, velos.size());
    }

    @Test
    public void doitRetournerUneListeVideSiVeloNonDisponible() throws InvalidVeloException {
        var caracteristique =new Caracteristique("", "", VTT, 2023);

        var veloRepository = new InMemoryVeloRepository();
        var parcService = new ParcService(veloRepository);


        var velos = parcService.rechercherVelosDisponibles(caracteristique);
        Assertions.assertEquals(0, velos.size());
    }



}