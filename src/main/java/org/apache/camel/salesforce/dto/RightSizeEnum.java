/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RightSize
 */
public enum RightSizeEnum {

    // Narrow
    NARROW("Narrow"),
    // Medium
    MEDIUM("Medium"),
    // Wide
    WIDE("Wide");

    final String value;

    private RightSizeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RightSizeEnum fromValue(String value) {
        for (RightSizeEnum e : RightSizeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}