package com.ratp.sanitaire.test.service;

import com.ratp.sanitaire.test.dto.Record;
import com.ratp.sanitaire.test.dto.Sanitaire;
import com.ratp.sanitaire.test.wrapper.WcWrapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatpWcService {

    private final RatpSanitaireRemoteService ratpSanitaireRemoteService;

    public RatpWcService(RatpSanitaireRemoteService ratpSanitaireRemoteService) {
        this.ratpSanitaireRemoteService = ratpSanitaireRemoteService;
    }

    public List<WcWrapper> getWcByLine(String lineId) {
        Sanitaire sanitaire = ratpSanitaireRemoteService.getSanitaire(lineId);

        return sanitaire.getRecords()
                .stream()
                .map(this::recordToWcWrapper)
                .collect(Collectors.toList());

    }

    private WcWrapper recordToWcWrapper(Record record) {
        if (record == null || record.getFields() == null) {
            return null;
        }


        WcWrapper wcWrapper = new WcWrapper();

        wcWrapper.setCoordGeo(record.getFields().getCoordGeo());
        wcWrapper.setAccessibleAuPublic("oui".equalsIgnoreCase(record.getFields().getAccessibleAuPublic()));
        wcWrapper.setTarifGratuitPayant("oui".equalsIgnoreCase(record.getFields().getTarifGratuitPayant()));
        wcWrapper.setStation(record.getFields().getStation());
        return wcWrapper;
    }


}
