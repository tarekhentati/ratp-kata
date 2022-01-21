package com.ratp.sanitaire.test.wrapper;

import java.util.List;

public class WcWrapper {
    //des coordonnées GPS,
    //si les toilettes sont accessibles au public,
    //si les toilettes sont gratuites,
    //le nom de la station équipée des toilettes


    private List<Double> coordGeo = null;
    private boolean accessibleAuPublic;
    private boolean tarifGratuitPayant;
    private String station;

    public WcWrapper() {
    }

    public WcWrapper(List<Double> coordGeo, boolean accessibleAuPublic, boolean tarifGratuitPayant, String station) {
        this.coordGeo = coordGeo;
        this.accessibleAuPublic = accessibleAuPublic;
        this.tarifGratuitPayant = tarifGratuitPayant;
        this.station = station;
    }

    public List<Double> getCoordGeo() {
        return coordGeo;
    }

    public void setCoordGeo(List<Double> coordGeo) {
        this.coordGeo = coordGeo;
    }

    public boolean isAccessibleAuPublic() {
        return accessibleAuPublic;
    }

    public void setAccessibleAuPublic(boolean accessibleAuPublic) {
        this.accessibleAuPublic = accessibleAuPublic;
    }

    public boolean isTarifGratuitPayant() {
        return tarifGratuitPayant;
    }

    public void setTarifGratuitPayant(boolean tarifGratuitPayant) {
        this.tarifGratuitPayant = tarifGratuitPayant;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}
