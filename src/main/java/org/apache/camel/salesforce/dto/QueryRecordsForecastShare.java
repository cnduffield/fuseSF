/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ForecastShare
 */
public class QueryRecordsForecastShare extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ForecastShare> records;

    public List<ForecastShare> getRecords() {
        return records;
    }

    public void setRecords(List<ForecastShare> records) {
        this.records = records;
    }
}
