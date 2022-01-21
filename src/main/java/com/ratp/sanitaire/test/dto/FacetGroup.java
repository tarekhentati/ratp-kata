
package com.ratp.sanitaire.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class FacetGroup {

    @JsonProperty("name")
    private String name;
    @JsonProperty("facets")
    private List<Facet> facets = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

}
