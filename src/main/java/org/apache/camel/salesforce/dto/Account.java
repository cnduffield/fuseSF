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
 * Salesforce DTO for SObject Account
 */
@XStreamAlias("Account")
public class Account extends AbstractSObjectBase {

    // MasterRecordId
    private String MasterRecordId;

    @JsonProperty("MasterRecordId")
    public String getMasterRecordId() {
        return this.MasterRecordId;
    }

    @JsonProperty("MasterRecordId")
    public void setMasterRecordId(String MasterRecordId) {
        this.MasterRecordId = MasterRecordId;
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

    // BillingStreet
    private String BillingStreet;

    @JsonProperty("BillingStreet")
    public String getBillingStreet() {
        return this.BillingStreet;
    }

    @JsonProperty("BillingStreet")
    public void setBillingStreet(String BillingStreet) {
        this.BillingStreet = BillingStreet;
    }

    // BillingCity
    private String BillingCity;

    @JsonProperty("BillingCity")
    public String getBillingCity() {
        return this.BillingCity;
    }

    @JsonProperty("BillingCity")
    public void setBillingCity(String BillingCity) {
        this.BillingCity = BillingCity;
    }

    // BillingState
    private String BillingState;

    @JsonProperty("BillingState")
    public String getBillingState() {
        return this.BillingState;
    }

    @JsonProperty("BillingState")
    public void setBillingState(String BillingState) {
        this.BillingState = BillingState;
    }

    // BillingPostalCode
    private String BillingPostalCode;

    @JsonProperty("BillingPostalCode")
    public String getBillingPostalCode() {
        return this.BillingPostalCode;
    }

    @JsonProperty("BillingPostalCode")
    public void setBillingPostalCode(String BillingPostalCode) {
        this.BillingPostalCode = BillingPostalCode;
    }

    // BillingCountry
    private String BillingCountry;

    @JsonProperty("BillingCountry")
    public String getBillingCountry() {
        return this.BillingCountry;
    }

    @JsonProperty("BillingCountry")
    public void setBillingCountry(String BillingCountry) {
        this.BillingCountry = BillingCountry;
    }

    // ShippingStreet
    private String ShippingStreet;

    @JsonProperty("ShippingStreet")
    public String getShippingStreet() {
        return this.ShippingStreet;
    }

    @JsonProperty("ShippingStreet")
    public void setShippingStreet(String ShippingStreet) {
        this.ShippingStreet = ShippingStreet;
    }

    // ShippingCity
    private String ShippingCity;

    @JsonProperty("ShippingCity")
    public String getShippingCity() {
        return this.ShippingCity;
    }

    @JsonProperty("ShippingCity")
    public void setShippingCity(String ShippingCity) {
        this.ShippingCity = ShippingCity;
    }

    // ShippingState
    private String ShippingState;

    @JsonProperty("ShippingState")
    public String getShippingState() {
        return this.ShippingState;
    }

    @JsonProperty("ShippingState")
    public void setShippingState(String ShippingState) {
        this.ShippingState = ShippingState;
    }

    // ShippingPostalCode
    private String ShippingPostalCode;

    @JsonProperty("ShippingPostalCode")
    public String getShippingPostalCode() {
        return this.ShippingPostalCode;
    }

    @JsonProperty("ShippingPostalCode")
    public void setShippingPostalCode(String ShippingPostalCode) {
        this.ShippingPostalCode = ShippingPostalCode;
    }

    // ShippingCountry
    private String ShippingCountry;

    @JsonProperty("ShippingCountry")
    public String getShippingCountry() {
        return this.ShippingCountry;
    }

    @JsonProperty("ShippingCountry")
    public void setShippingCountry(String ShippingCountry) {
        this.ShippingCountry = ShippingCountry;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Fax
    private String Fax;

    @JsonProperty("Fax")
    public String getFax() {
        return this.Fax;
    }

    @JsonProperty("Fax")
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    // AccountNumber
    private String AccountNumber;

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return this.AccountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    // Website
    private String Website;

    @JsonProperty("Website")
    public String getWebsite() {
        return this.Website;
    }

    @JsonProperty("Website")
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    // Sic
    private String Sic;

    @JsonProperty("Sic")
    public String getSic() {
        return this.Sic;
    }

    @JsonProperty("Sic")
    public void setSic(String Sic) {
        this.Sic = Sic;
    }

    // Industry
    @XStreamConverter(PicklistEnumConverter.class)
    private IndustryEnum Industry;

    @JsonProperty("Industry")
    public IndustryEnum getIndustry() {
        return this.Industry;
    }

    @JsonProperty("Industry")
    public void setIndustry(IndustryEnum Industry) {
        this.Industry = Industry;
    }

    // AnnualRevenue
    private Double AnnualRevenue;

    @JsonProperty("AnnualRevenue")
    public Double getAnnualRevenue() {
        return this.AnnualRevenue;
    }

    @JsonProperty("AnnualRevenue")
    public void setAnnualRevenue(Double AnnualRevenue) {
        this.AnnualRevenue = AnnualRevenue;
    }

    // NumberOfEmployees
    private Integer NumberOfEmployees;

    @JsonProperty("NumberOfEmployees")
    public Integer getNumberOfEmployees() {
        return this.NumberOfEmployees;
    }

    @JsonProperty("NumberOfEmployees")
    public void setNumberOfEmployees(Integer NumberOfEmployees) {
        this.NumberOfEmployees = NumberOfEmployees;
    }

    // Ownership
    @XStreamConverter(PicklistEnumConverter.class)
    private OwnershipEnum Ownership;

    @JsonProperty("Ownership")
    public OwnershipEnum getOwnership() {
        return this.Ownership;
    }

    @JsonProperty("Ownership")
    public void setOwnership(OwnershipEnum Ownership) {
        this.Ownership = Ownership;
    }

    // TickerSymbol
    private String TickerSymbol;

    @JsonProperty("TickerSymbol")
    public String getTickerSymbol() {
        return this.TickerSymbol;
    }

    @JsonProperty("TickerSymbol")
    public void setTickerSymbol(String TickerSymbol) {
        this.TickerSymbol = TickerSymbol;
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

    // Rating
    @XStreamConverter(PicklistEnumConverter.class)
    private RatingEnum Rating;

    @JsonProperty("Rating")
    public RatingEnum getRating() {
        return this.Rating;
    }

    @JsonProperty("Rating")
    public void setRating(RatingEnum Rating) {
        this.Rating = Rating;
    }

    // Site
    private String Site;

    @JsonProperty("Site")
    public String getSite() {
        return this.Site;
    }

    @JsonProperty("Site")
    public void setSite(String Site) {
        this.Site = Site;
    }

    // Jigsaw
    private String Jigsaw;

    @JsonProperty("Jigsaw")
    public String getJigsaw() {
        return this.Jigsaw;
    }

    @JsonProperty("Jigsaw")
    public void setJigsaw(String Jigsaw) {
        this.Jigsaw = Jigsaw;
    }

    // JigsawCompanyId
    private String JigsawCompanyId;

    @JsonProperty("JigsawCompanyId")
    public String getJigsawCompanyId() {
        return this.JigsawCompanyId;
    }

    @JsonProperty("JigsawCompanyId")
    public void setJigsawCompanyId(String JigsawCompanyId) {
        this.JigsawCompanyId = JigsawCompanyId;
    }

    // CleanStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private CleanStatusEnum CleanStatus;

    @JsonProperty("CleanStatus")
    public CleanStatusEnum getCleanStatus() {
        return this.CleanStatus;
    }

    @JsonProperty("CleanStatus")
    public void setCleanStatus(CleanStatusEnum CleanStatus) {
        this.CleanStatus = CleanStatus;
    }

    // AccountSource
    @XStreamConverter(PicklistEnumConverter.class)
    private AccountSourceEnum AccountSource;

    @JsonProperty("AccountSource")
    public AccountSourceEnum getAccountSource() {
        return this.AccountSource;
    }

    @JsonProperty("AccountSource")
    public void setAccountSource(AccountSourceEnum AccountSource) {
        this.AccountSource = AccountSource;
    }

    // DunsNumber
    private String DunsNumber;

    @JsonProperty("DunsNumber")
    public String getDunsNumber() {
        return this.DunsNumber;
    }

    @JsonProperty("DunsNumber")
    public void setDunsNumber(String DunsNumber) {
        this.DunsNumber = DunsNumber;
    }

    // Tradestyle
    private String Tradestyle;

    @JsonProperty("Tradestyle")
    public String getTradestyle() {
        return this.Tradestyle;
    }

    @JsonProperty("Tradestyle")
    public void setTradestyle(String Tradestyle) {
        this.Tradestyle = Tradestyle;
    }

    // NaicsCode
    private String NaicsCode;

    @JsonProperty("NaicsCode")
    public String getNaicsCode() {
        return this.NaicsCode;
    }

    @JsonProperty("NaicsCode")
    public void setNaicsCode(String NaicsCode) {
        this.NaicsCode = NaicsCode;
    }

    // NaicsDesc
    private String NaicsDesc;

    @JsonProperty("NaicsDesc")
    public String getNaicsDesc() {
        return this.NaicsDesc;
    }

    @JsonProperty("NaicsDesc")
    public void setNaicsDesc(String NaicsDesc) {
        this.NaicsDesc = NaicsDesc;
    }

    // YearStarted
    private String YearStarted;

    @JsonProperty("YearStarted")
    public String getYearStarted() {
        return this.YearStarted;
    }

    @JsonProperty("YearStarted")
    public void setYearStarted(String YearStarted) {
        this.YearStarted = YearStarted;
    }

    // SicDesc
    private String SicDesc;

    @JsonProperty("SicDesc")
    public String getSicDesc() {
        return this.SicDesc;
    }

    @JsonProperty("SicDesc")
    public void setSicDesc(String SicDesc) {
        this.SicDesc = SicDesc;
    }

    // DandbCompanyId
    private String DandbCompanyId;

    @JsonProperty("DandbCompanyId")
    public String getDandbCompanyId() {
        return this.DandbCompanyId;
    }

    @JsonProperty("DandbCompanyId")
    public void setDandbCompanyId(String DandbCompanyId) {
        this.DandbCompanyId = DandbCompanyId;
    }

    // CustomerPriority__c
    @XStreamConverter(PicklistEnumConverter.class)
    private CustomerPriorityEnum CustomerPriority__c;

    @JsonProperty("CustomerPriority__c")
    public CustomerPriorityEnum getCustomerPriority__c() {
        return this.CustomerPriority__c;
    }

    @JsonProperty("CustomerPriority__c")
    public void setCustomerPriority__c(CustomerPriorityEnum CustomerPriority__c) {
        this.CustomerPriority__c = CustomerPriority__c;
    }

    // SLA__c
    @XStreamConverter(PicklistEnumConverter.class)
    private SLAEnum SLA__c;

    @JsonProperty("SLA__c")
    public SLAEnum getSLA__c() {
        return this.SLA__c;
    }

    @JsonProperty("SLA__c")
    public void setSLA__c(SLAEnum SLA__c) {
        this.SLA__c = SLA__c;
    }

    // Active__c
    @XStreamConverter(PicklistEnumConverter.class)
    private ActiveEnum Active__c;

    @JsonProperty("Active__c")
    public ActiveEnum getActive__c() {
        return this.Active__c;
    }

    @JsonProperty("Active__c")
    public void setActive__c(ActiveEnum Active__c) {
        this.Active__c = Active__c;
    }

    // NumberofLocations__c
    private Double NumberofLocations__c;

    @JsonProperty("NumberofLocations__c")
    public Double getNumberofLocations__c() {
        return this.NumberofLocations__c;
    }

    @JsonProperty("NumberofLocations__c")
    public void setNumberofLocations__c(Double NumberofLocations__c) {
        this.NumberofLocations__c = NumberofLocations__c;
    }

    // UpsellOpportunity__c
    @XStreamConverter(PicklistEnumConverter.class)
    private UpsellOpportunityEnum UpsellOpportunity__c;

    @JsonProperty("UpsellOpportunity__c")
    public UpsellOpportunityEnum getUpsellOpportunity__c() {
        return this.UpsellOpportunity__c;
    }

    @JsonProperty("UpsellOpportunity__c")
    public void setUpsellOpportunity__c(UpsellOpportunityEnum UpsellOpportunity__c) {
        this.UpsellOpportunity__c = UpsellOpportunity__c;
    }

    // SLASerialNumber__c
    private String SLASerialNumber__c;

    @JsonProperty("SLASerialNumber__c")
    public String getSLASerialNumber__c() {
        return this.SLASerialNumber__c;
    }

    @JsonProperty("SLASerialNumber__c")
    public void setSLASerialNumber__c(String SLASerialNumber__c) {
        this.SLASerialNumber__c = SLASerialNumber__c;
    }

    // SLAExpirationDate__c
    private org.joda.time.DateTime SLAExpirationDate__c;

    @JsonProperty("SLAExpirationDate__c")
    public org.joda.time.DateTime getSLAExpirationDate__c() {
        return this.SLAExpirationDate__c;
    }

    @JsonProperty("SLAExpirationDate__c")
    public void setSLAExpirationDate__c(org.joda.time.DateTime SLAExpirationDate__c) {
        this.SLAExpirationDate__c = SLAExpirationDate__c;
    }

    // JBoss_Fuse_Integration_External_ID__c
    private Double JBoss_Fuse_Integration_External_ID__c;

    @JsonProperty("JBoss_Fuse_Integration_External_ID__c")
    public Double getJBoss_Fuse_Integration_External_ID__c() {
        return this.JBoss_Fuse_Integration_External_ID__c;
    }

    @JsonProperty("JBoss_Fuse_Integration_External_ID__c")
    public void setJBoss_Fuse_Integration_External_ID__c(Double JBoss_Fuse_Integration_External_ID__c) {
        this.JBoss_Fuse_Integration_External_ID__c = JBoss_Fuse_Integration_External_ID__c;
    }

}