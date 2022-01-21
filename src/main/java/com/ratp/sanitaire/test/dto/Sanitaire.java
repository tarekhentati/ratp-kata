
package com.ratp.sanitaire.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Sanitaire {

    @JsonProperty("nhits")
    private Integer nhits;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("records")
    private List<Record> records = null;
    @JsonProperty("facet_groups")
    private List<FacetGroup> facetGroups = null;

    public Integer getNhits() {
        return nhits;
    }

    public void setNhits(Integer nhits) {
        this.nhits = nhits;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public List<FacetGroup> getFacetGroups() {
        return facetGroups;
    }

    public void setFacetGroups(List<FacetGroup> facetGroups) {
        this.facetGroups = facetGroups;
    }

}
