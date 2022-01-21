package com.ratp.sanitaire.test.service;

import com.ratp.sanitaire.test.dto.Sanitaire;
import feign.Param;
import feign.RequestLine;

public interface RatpSanitaireRemoteService {
    // https://data.ratp.fr/api/records/1.0/search/?dataset=sanitaires-reseau-ratp
    // &q=
    // &facet=ligne
    // &facet=station
    // &facet=tarif_gratuit_payant
    // &facet=acces_bouton_poussoir
    // &facet=en_zone_controlee
    // &facet=hors_zone_controlee_station
    // &facet=hors_zone_controlee_voie_publique
    // &refine.ligne=1
    @RequestLine("GET /api/records/1.0/search/?" +
            "dataset=sanitaires-reseau-ratp" +
            "&q=" +
            "&facet=ligne" +
            "&facet=station" +
            "&facet=tarif_gratuit_payant" +
            "&facet=acces_bouton_poussoir" +
            "&facet=en_zone_controlee" +
            "&facet=hors_zone_controlee_station" +
            "&facet=hors_zone_controlee_voie_publique" +
            "&refine.ligne={line}")
    Sanitaire getSanitaire(
            @Param("line") String line
    );

}
