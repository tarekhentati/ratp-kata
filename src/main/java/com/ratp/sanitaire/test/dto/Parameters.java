
package com.ratp.sanitaire.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Parameters {

    @JsonProperty("dataset")
    private String dataset;
    @JsonProperty("rows")
    private Integer rows;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("facet")
    private List<String> facet = null;
    @JsonProperty("format")
    private String format;
    @JsonProperty("timezone")
    private String timezone;

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public List<String> getFacet() {
        return facet;
    }

    public void setFacet(List<String> facet) {
        this.facet = facet;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}
