/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Oct 31 15:34:44 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Topic
 */
@XStreamAlias("Topic")
public class Topic extends AbstractSObjectBase {

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // TalkingAbout
    private Integer TalkingAbout;

    @JsonProperty("TalkingAbout")
    public Integer getTalkingAbout() {
        return this.TalkingAbout;
    }

    @JsonProperty("TalkingAbout")
    public void setTalkingAbout(Integer TalkingAbout) {
        this.TalkingAbout = TalkingAbout;
    }

}
