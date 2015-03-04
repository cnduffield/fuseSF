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
 * Salesforce DTO for SObject CaseContactRole
 */
@XStreamAlias("CaseContactRole")
public class CaseContactRole extends AbstractSObjectBase {

    // CasesId
    private String CasesId;

    @JsonProperty("CasesId")
    public String getCasesId() {
        return this.CasesId;
    }

    @JsonProperty("CasesId")
    public void setCasesId(String CasesId) {
        this.CasesId = CasesId;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // Role
    @XStreamConverter(PicklistEnumConverter.class)
    private RoleEnum Role;

    @JsonProperty("Role")
    public RoleEnum getRole() {
        return this.Role;
    }

    @JsonProperty("Role")
    public void setRole(RoleEnum Role) {
        this.Role = Role;
    }

}