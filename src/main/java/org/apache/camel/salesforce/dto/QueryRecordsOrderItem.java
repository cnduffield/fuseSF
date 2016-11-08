/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Oct 31 15:34:44 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type OrderItem
 */
public class QueryRecordsOrderItem extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<OrderItem> records;

    public List<OrderItem> getRecords() {
        return records;
    }

    public void setRecords(List<OrderItem> records) {
        this.records = records;
    }
}
