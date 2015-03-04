/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Report
 */
public class QueryRecordsReport extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Report> records;

    public List<Report> getRecords() {
        return records;
    }

    public void setRecords(List<Report> records) {
        this.records = records;
    }
}
