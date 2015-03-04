/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum StatusEnum {

    // Pending
    PENDING("Pending"),
    // Accepted
    ACCEPTED("Accepted"),
    // Declined
    DECLINED("Declined");

    final String value;

    private StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum e : StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}