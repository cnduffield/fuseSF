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
 * Salesforce DTO for SObject Campaign
 */
@XStreamAlias("Campaign")
public class Campaign extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
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

    // StartDate
    private org.joda.time.DateTime StartDate;

    @JsonProperty("StartDate")
    public org.joda.time.DateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(org.joda.time.DateTime StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private org.joda.time.DateTime EndDate;

    @JsonProperty("EndDate")
    public org.joda.time.DateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(org.joda.time.DateTime EndDate) {
        this.EndDate = EndDate;
    }

    // ExpectedRevenue
    private Double ExpectedRevenue;

    @JsonProperty("ExpectedRevenue")
    public Double getExpectedRevenue() {
        return this.ExpectedRevenue;
    }

    @JsonProperty("ExpectedRevenue")
    public void setExpectedRevenue(Double ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    // BudgetedCost
    private Double BudgetedCost;

    @JsonProperty("BudgetedCost")
    public Double getBudgetedCost() {
        return this.BudgetedCost;
    }

    @JsonProperty("BudgetedCost")
    public void setBudgetedCost(Double BudgetedCost) {
        this.BudgetedCost = BudgetedCost;
    }

    // ActualCost
    private Double ActualCost;

    @JsonProperty("ActualCost")
    public Double getActualCost() {
        return this.ActualCost;
    }

    @JsonProperty("ActualCost")
    public void setActualCost(Double ActualCost) {
        this.ActualCost = ActualCost;
    }

    // ExpectedResponse
    private Double ExpectedResponse;

    @JsonProperty("ExpectedResponse")
    public Double getExpectedResponse() {
        return this.ExpectedResponse;
    }

    @JsonProperty("ExpectedResponse")
    public void setExpectedResponse(Double ExpectedResponse) {
        this.ExpectedResponse = ExpectedResponse;
    }

    // NumberSent
    private Double NumberSent;

    @JsonProperty("NumberSent")
    public Double getNumberSent() {
        return this.NumberSent;
    }

    @JsonProperty("NumberSent")
    public void setNumberSent(Double NumberSent) {
        this.NumberSent = NumberSent;
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

    // NumberOfLeads
    private Integer NumberOfLeads;

    @JsonProperty("NumberOfLeads")
    public Integer getNumberOfLeads() {
        return this.NumberOfLeads;
    }

    @JsonProperty("NumberOfLeads")
    public void setNumberOfLeads(Integer NumberOfLeads) {
        this.NumberOfLeads = NumberOfLeads;
    }

    // NumberOfConvertedLeads
    private Integer NumberOfConvertedLeads;

    @JsonProperty("NumberOfConvertedLeads")
    public Integer getNumberOfConvertedLeads() {
        return this.NumberOfConvertedLeads;
    }

    @JsonProperty("NumberOfConvertedLeads")
    public void setNumberOfConvertedLeads(Integer NumberOfConvertedLeads) {
        this.NumberOfConvertedLeads = NumberOfConvertedLeads;
    }

    // NumberOfContacts
    private Integer NumberOfContacts;

    @JsonProperty("NumberOfContacts")
    public Integer getNumberOfContacts() {
        return this.NumberOfContacts;
    }

    @JsonProperty("NumberOfContacts")
    public void setNumberOfContacts(Integer NumberOfContacts) {
        this.NumberOfContacts = NumberOfContacts;
    }

    // NumberOfResponses
    private Integer NumberOfResponses;

    @JsonProperty("NumberOfResponses")
    public Integer getNumberOfResponses() {
        return this.NumberOfResponses;
    }

    @JsonProperty("NumberOfResponses")
    public void setNumberOfResponses(Integer NumberOfResponses) {
        this.NumberOfResponses = NumberOfResponses;
    }

    // NumberOfOpportunities
    private Integer NumberOfOpportunities;

    @JsonProperty("NumberOfOpportunities")
    public Integer getNumberOfOpportunities() {
        return this.NumberOfOpportunities;
    }

    @JsonProperty("NumberOfOpportunities")
    public void setNumberOfOpportunities(Integer NumberOfOpportunities) {
        this.NumberOfOpportunities = NumberOfOpportunities;
    }

    // NumberOfWonOpportunities
    private Integer NumberOfWonOpportunities;

    @JsonProperty("NumberOfWonOpportunities")
    public Integer getNumberOfWonOpportunities() {
        return this.NumberOfWonOpportunities;
    }

    @JsonProperty("NumberOfWonOpportunities")
    public void setNumberOfWonOpportunities(Integer NumberOfWonOpportunities) {
        this.NumberOfWonOpportunities = NumberOfWonOpportunities;
    }

    // AmountAllOpportunities
    private Double AmountAllOpportunities;

    @JsonProperty("AmountAllOpportunities")
    public Double getAmountAllOpportunities() {
        return this.AmountAllOpportunities;
    }

    @JsonProperty("AmountAllOpportunities")
    public void setAmountAllOpportunities(Double AmountAllOpportunities) {
        this.AmountAllOpportunities = AmountAllOpportunities;
    }

    // AmountWonOpportunities
    private Double AmountWonOpportunities;

    @JsonProperty("AmountWonOpportunities")
    public Double getAmountWonOpportunities() {
        return this.AmountWonOpportunities;
    }

    @JsonProperty("AmountWonOpportunities")
    public void setAmountWonOpportunities(Double AmountWonOpportunities) {
        this.AmountWonOpportunities = AmountWonOpportunities;
    }

    // CampaignMemberRecordTypeId
    private String CampaignMemberRecordTypeId;

    @JsonProperty("CampaignMemberRecordTypeId")
    public String getCampaignMemberRecordTypeId() {
        return this.CampaignMemberRecordTypeId;
    }

    @JsonProperty("CampaignMemberRecordTypeId")
    public void setCampaignMemberRecordTypeId(String CampaignMemberRecordTypeId) {
        this.CampaignMemberRecordTypeId = CampaignMemberRecordTypeId;
    }

}
