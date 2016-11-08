/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Oct 31 15:34:44 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject ApexClass
 */
@XStreamAlias("ApexClass")
public class ApexClass extends AbstractSObjectBase {

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // IsValid
    private Boolean IsValid;

    @JsonProperty("IsValid")
    public Boolean getIsValid() {
        return this.IsValid;
    }

    @JsonProperty("IsValid")
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    // BodyCrc
    private Double BodyCrc;

    @JsonProperty("BodyCrc")
    public Double getBodyCrc() {
        return this.BodyCrc;
    }

    @JsonProperty("BodyCrc")
    public void setBodyCrc(Double BodyCrc) {
        this.BodyCrc = BodyCrc;
    }

    // Body
    private String Body;

    @JsonProperty("Body")
    public String getBody() {
        return this.Body;
    }

    @JsonProperty("Body")
    public void setBody(String Body) {
        this.Body = Body;
    }

    // LengthWithoutComments
    private Integer LengthWithoutComments;

    @JsonProperty("LengthWithoutComments")
    public Integer getLengthWithoutComments() {
        return this.LengthWithoutComments;
    }

    @JsonProperty("LengthWithoutComments")
    public void setLengthWithoutComments(Integer LengthWithoutComments) {
        this.LengthWithoutComments = LengthWithoutComments;
    }

}
