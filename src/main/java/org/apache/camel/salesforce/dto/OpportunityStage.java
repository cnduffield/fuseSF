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
 * Salesforce DTO for SObject OpportunityStage
 */
@XStreamAlias("OpportunityStage")
public class OpportunityStage extends AbstractSObjectBase {

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // IsClosed
    private Boolean IsClosed;

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return this.IsClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    // IsWon
    private Boolean IsWon;

    @JsonProperty("IsWon")
    public Boolean getIsWon() {
        return this.IsWon;
    }

    @JsonProperty("IsWon")
    public void setIsWon(Boolean IsWon) {
        this.IsWon = IsWon;
    }

    // ForecastCategory
    @XStreamConverter(PicklistEnumConverter.class)
    private ForecastCategoryEnum ForecastCategory;

    @JsonProperty("ForecastCategory")
    public ForecastCategoryEnum getForecastCategory() {
        return this.ForecastCategory;
    }

    @JsonProperty("ForecastCategory")
    public void setForecastCategory(ForecastCategoryEnum ForecastCategory) {
        this.ForecastCategory = ForecastCategory;
    }

    // ForecastCategoryName
    @XStreamConverter(PicklistEnumConverter.class)
    private ForecastCategoryNameEnum ForecastCategoryName;

    @JsonProperty("ForecastCategoryName")
    public ForecastCategoryNameEnum getForecastCategoryName() {
        return this.ForecastCategoryName;
    }

    @JsonProperty("ForecastCategoryName")
    public void setForecastCategoryName(ForecastCategoryNameEnum ForecastCategoryName) {
        this.ForecastCategoryName = ForecastCategoryName;
    }

    // DefaultProbability
    private Double DefaultProbability;

    @JsonProperty("DefaultProbability")
    public Double getDefaultProbability() {
        return this.DefaultProbability;
    }

    @JsonProperty("DefaultProbability")
    public void setDefaultProbability(Double DefaultProbability) {
        this.DefaultProbability = DefaultProbability;
    }

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

}
