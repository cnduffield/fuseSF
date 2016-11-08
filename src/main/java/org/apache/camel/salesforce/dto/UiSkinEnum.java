/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Oct 31 15:34:44 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UiSkin
 */
public enum UiSkinEnum {

    // PortalDefault
    PORTALDEFAULT("PortalDefault"),
    // Theme1
    THEME1("Theme1"),
    // Theme2
    THEME2("Theme2"),
    // Theme3
    THEME3("Theme3"),
    // Webstore
    WEBSTORE("Webstore");

    final String value;

    private UiSkinEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UiSkinEnum fromValue(String value) {
        for (UiSkinEnum e : UiSkinEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
