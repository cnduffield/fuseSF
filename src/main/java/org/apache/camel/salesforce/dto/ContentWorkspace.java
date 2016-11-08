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
 * Salesforce DTO for SObject ContentWorkspace
 */
@XStreamAlias("ContentWorkspace")
public class ContentWorkspace extends AbstractSObjectBase {

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

    // TagModel
    @XStreamConverter(PicklistEnumConverter.class)
    private TagModelEnum TagModel;

    @JsonProperty("TagModel")
    public TagModelEnum getTagModel() {
        return this.TagModel;
    }

    @JsonProperty("TagModel")
    public void setTagModel(TagModelEnum TagModel) {
        this.TagModel = TagModel;
    }

    // DefaultRecordTypeId
    private String DefaultRecordTypeId;

    @JsonProperty("DefaultRecordTypeId")
    public String getDefaultRecordTypeId() {
        return this.DefaultRecordTypeId;
    }

    @JsonProperty("DefaultRecordTypeId")
    public void setDefaultRecordTypeId(String DefaultRecordTypeId) {
        this.DefaultRecordTypeId = DefaultRecordTypeId;
    }

    // IsRestrictContentTypes
    private Boolean IsRestrictContentTypes;

    @JsonProperty("IsRestrictContentTypes")
    public Boolean getIsRestrictContentTypes() {
        return this.IsRestrictContentTypes;
    }

    @JsonProperty("IsRestrictContentTypes")
    public void setIsRestrictContentTypes(Boolean IsRestrictContentTypes) {
        this.IsRestrictContentTypes = IsRestrictContentTypes;
    }

    // IsRestrictLinkedContentTypes
    private Boolean IsRestrictLinkedContentTypes;

    @JsonProperty("IsRestrictLinkedContentTypes")
    public Boolean getIsRestrictLinkedContentTypes() {
        return this.IsRestrictLinkedContentTypes;
    }

    @JsonProperty("IsRestrictLinkedContentTypes")
    public void setIsRestrictLinkedContentTypes(Boolean IsRestrictLinkedContentTypes) {
        this.IsRestrictLinkedContentTypes = IsRestrictLinkedContentTypes;
    }

}
