/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StepStatus
 */
public enum StepStatusEnum {

    // Approved
    APPROVED("Approved"),
    // Rejected
    REJECTED("Rejected"),
    // Removed
    REMOVED("Removed"),
    // Fault
    FAULT("Fault"),
    // Pending
    PENDING("Pending"),
    // Held
    HELD("Held"),
    // Reassigned
    REASSIGNED("Reassigned"),
    // Started
    STARTED("Started"),
    // NoResponse
    NORESPONSE("NoResponse");

    final String value;

    private StepStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StepStatusEnum fromValue(String value) {
        for (StepStatusEnum e : StepStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}