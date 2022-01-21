
package com.ratp.sanitaire.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Fields {
    @JsonProperty("accessible_au_public")
    private String accessibleAuPublic;
    @JsonProperty("acces_bouton_poussoir")
    private String accesBoutonPoussoir;
    @JsonProperty("tarif_gratuit_payant")
    private String tarifGratuitPayant;
    @JsonProperty("gestionnaire")
    private String gestionnaire;
    @JsonProperty("accessibilite_pmr")
    private String accessibilitePmr;
    @JsonProperty("ligne")
    private String ligne;
    @JsonProperty("localisation")
    private String localisation;
    @JsonProperty("station")
    private String station;
    @JsonProperty("hors_zone_controlee_station")
    private String horsZoneControleeStation;
    @JsonProperty("coord_geo")
    private List<Double> coordGeo;
    @JsonProperty("en_zone_controlee")
    private String enZoneControlee;


    public String getAccessibleAuPublic() {
        return accessibleAuPublic;
    }


    public void setAccessibleAuPublic(String accessibleAuPublic) {
        this.accessibleAuPublic = accessibleAuPublic;
    }


    public String getAccesBoutonPoussoir() {
        return accesBoutonPoussoir;
    }


    public void setAccesBoutonPoussoir(String accesBoutonPoussoir) {
        this.accesBoutonPoussoir = accesBoutonPoussoir;
    }


    public String getTarifGratuitPayant() {
        return tarifGratuitPayant;
    }


    public void setTarifGratuitPayant(String tarifGratuitPayant) {
        this.tarifGratuitPayant = tarifGratuitPayant;
    }


    public String getGestionnaire() {
        return gestionnaire;
    }


    public void setGestionnaire(String gestionnaire) {
        this.gestionnaire = gestionnaire;
    }


    public String getAccessibilitePmr() {
        return accessibilitePmr;
    }


    public void setAccessibilitePmr(String accessibilitePmr) {
        this.accessibilitePmr = accessibilitePmr;
    }


    public String getLigne() {
        return ligne;
    }


    public void setLigne(String ligne) {
        this.ligne = ligne;
    }


    public String getLocalisation() {
        return localisation;
    }


    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }


    public String getStation() {
        return station;
    }


    public void setStation(String station) {
        this.station = station;
    }


    public String getHorsZoneControleeStation() {
        return horsZoneControleeStation;
    }


    public void setHorsZoneControleeStation(String horsZoneControleeStation) {
        this.horsZoneControleeStation = horsZoneControleeStation;
    }


    public List<Double> getCoordGeo() {
        return coordGeo;
    }


    public void setCoordGeo(List<Double> coordGeo) {
        this.coordGeo = coordGeo;
    }


    public String getEnZoneControlee() {
        return enZoneControlee;
    }

    public void setEnZoneControlee(String enZoneControlee) {
        this.enZoneControlee = enZoneControlee;
    }

}
