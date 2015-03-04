/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject DomainSite
 */
@XStreamAlias("DomainSite")
public class DomainSite extends AbstractSObjectBase {

    // DomainId
    private String DomainId;

    @JsonProperty("DomainId")
    public String getDomainId() {
        return this.DomainId;
    }

    @JsonProperty("DomainId")
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    // SiteId
    private String SiteId;

    @JsonProperty("SiteId")
    public String getSiteId() {
        return this.SiteId;
    }

    @JsonProperty("SiteId")
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    // PathPrefix
    private String PathPrefix;

    @JsonProperty("PathPrefix")
    public String getPathPrefix() {
        return this.PathPrefix;
    }

    @JsonProperty("PathPrefix")
    public void setPathPrefix(String PathPrefix) {
        this.PathPrefix = PathPrefix;
    }

}