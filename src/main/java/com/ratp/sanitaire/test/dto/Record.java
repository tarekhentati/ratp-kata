
package com.ratp.sanitaire.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Record {

    @JsonProperty("datasetid")
    private String datasetid;
    @JsonProperty("recordid")
    private String recordid;
    @JsonProperty("fields")
    private Fields fields;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("record_timestamp")
    private String recordTimestamp;

    public String getDatasetid() {
        return datasetid;
    }

    public void setDatasetid(String datasetid) {
        this.datasetid = datasetid;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getRecordTimestamp() {
        return recordTimestamp;
    }

    public void setRecordTimestamp(String recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }

}
