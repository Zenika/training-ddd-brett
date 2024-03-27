package com.brett.location.domains.parc.application;

import com.brett.location.domains.parc.domain.ParcService;
import com.brett.location.domains.parc.domain.model.entity.Velo;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/velo")
public class ParcRessource {

    private final ParcService parcService;

    public ParcRessource(ParcService parcService) {
        this.parcService = parcService;
    }

    @PostMapping("/")
    public UUID ajouterVelo(@RequestBody Velo velo) {
       return parcService.ajouterVelo(velo);
    }

}
