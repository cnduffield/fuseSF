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
 * Salesforce DTO for SObject ExternalDataUserAuth
 */
@XStreamAlias("ExternalDataUserAuth")
public class ExternalDataUserAuth extends AbstractSObjectBase {

    // ExternalDataSourceId
    private String ExternalDataSourceId;

    @JsonProperty("ExternalDataSourceId")
    public String getExternalDataSourceId() {
        return this.ExternalDataSourceId;
    }

    @JsonProperty("ExternalDataSourceId")
    public void setExternalDataSourceId(String ExternalDataSourceId) {
        this.ExternalDataSourceId = ExternalDataSourceId;
    }

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // Protocol
    @XStreamConverter(PicklistEnumConverter.class)
    private ProtocolEnum Protocol;

    @JsonProperty("Protocol")
    public ProtocolEnum getProtocol() {
        return this.Protocol;
    }

    @JsonProperty("Protocol")
    public void setProtocol(ProtocolEnum Protocol) {
        this.Protocol = Protocol;
    }

    // Username
    private String Username;

    @JsonProperty("Username")
    public String getUsername() {
        return this.Username;
    }

    @JsonProperty("Username")
    public void setUsername(String Username) {
        this.Username = Username;
    }

    // Password
    private String Password;

    @JsonProperty("Password")
    public String getPassword() {
        return this.Password;
    }

    @JsonProperty("Password")
    public void setPassword(String Password) {
        this.Password = Password;
    }

}