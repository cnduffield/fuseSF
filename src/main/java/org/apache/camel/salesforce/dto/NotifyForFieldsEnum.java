/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotifyForFields
 */
public enum NotifyForFieldsEnum {

    // Select
    SELECT("Select"),
    // Where
    WHERE("Where"),
    // Referenced
    REFERENCED("Referenced"),
    // All
    ALL("All");

    final String value;

    private NotifyForFieldsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotifyForFieldsEnum fromValue(String value) {
        for (NotifyForFieldsEnum e : NotifyForFieldsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}