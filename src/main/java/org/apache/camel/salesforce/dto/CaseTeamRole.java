/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject CaseTeamRole
 */
@XStreamAlias("CaseTeamRole")
public class CaseTeamRole extends AbstractSObjectBase {

    // AccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AccessLevelEnum AccessLevel;

    @JsonProperty("AccessLevel")
    public AccessLevelEnum getAccessLevel() {
        return this.AccessLevel;
    }

    @JsonProperty("AccessLevel")
    public void setAccessLevel(AccessLevelEnum AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    // PreferencesVisibleInCSP
    private Boolean PreferencesVisibleInCSP;

    @JsonProperty("PreferencesVisibleInCSP")
    public Boolean getPreferencesVisibleInCSP() {
        return this.PreferencesVisibleInCSP;
    }

    @JsonProperty("PreferencesVisibleInCSP")
    public void setPreferencesVisibleInCSP(Boolean PreferencesVisibleInCSP) {
        this.PreferencesVisibleInCSP = PreferencesVisibleInCSP;
    }

}