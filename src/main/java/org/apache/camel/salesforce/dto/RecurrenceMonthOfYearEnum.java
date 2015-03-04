/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceMonthOfYear
 */
public enum RecurrenceMonthOfYearEnum {

    // January
    JANUARY("January"),
    // February
    FEBRUARY("February"),
    // March
    MARCH("March"),
    // April
    APRIL("April"),
    // May
    MAY("May"),
    // June
    JUNE("June"),
    // July
    JULY("July"),
    // August
    AUGUST("August"),
    // September
    SEPTEMBER("September"),
    // October
    OCTOBER("October"),
    // November
    NOVEMBER("November"),
    // December
    DECEMBER("December");

    final String value;

    private RecurrenceMonthOfYearEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RecurrenceMonthOfYearEnum fromValue(String value) {
        for (RecurrenceMonthOfYearEnum e : RecurrenceMonthOfYearEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}