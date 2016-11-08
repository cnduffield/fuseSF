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
 * Salesforce DTO for SObject WebLink
 */
@XStreamAlias("WebLink")
public class WebLink extends AbstractSObjectBase {

    // PageOrSobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private PageOrSobjectTypeEnum PageOrSobjectType;

    @JsonProperty("PageOrSobjectType")
    public PageOrSobjectTypeEnum getPageOrSobjectType() {
        return this.PageOrSobjectType;
    }

    @JsonProperty("PageOrSobjectType")
    public void setPageOrSobjectType(PageOrSobjectTypeEnum PageOrSobjectType) {
        this.PageOrSobjectType = PageOrSobjectType;
    }

    // IsProtected
    private Boolean IsProtected;

    @JsonProperty("IsProtected")
    public Boolean getIsProtected() {
        return this.IsProtected;
    }

    @JsonProperty("IsProtected")
    public void setIsProtected(Boolean IsProtected) {
        this.IsProtected = IsProtected;
    }

    // Url
    private String Url;

    @JsonProperty("Url")
    public String getUrl() {
        return this.Url;
    }

    @JsonProperty("Url")
    public void setUrl(String Url) {
        this.Url = Url;
    }

    // EncodingKey
    @XStreamConverter(PicklistEnumConverter.class)
    private EncodingKeyEnum EncodingKey;

    @JsonProperty("EncodingKey")
    public EncodingKeyEnum getEncodingKey() {
        return this.EncodingKey;
    }

    @JsonProperty("EncodingKey")
    public void setEncodingKey(EncodingKeyEnum EncodingKey) {
        this.EncodingKey = EncodingKey;
    }

    // LinkType
    @XStreamConverter(PicklistEnumConverter.class)
    private LinkTypeEnum LinkType;

    @JsonProperty("LinkType")
    public LinkTypeEnum getLinkType() {
        return this.LinkType;
    }

    @JsonProperty("LinkType")
    public void setLinkType(LinkTypeEnum LinkType) {
        this.LinkType = LinkType;
    }

    // OpenType
    @XStreamConverter(PicklistEnumConverter.class)
    private OpenTypeEnum OpenType;

    @JsonProperty("OpenType")
    public OpenTypeEnum getOpenType() {
        return this.OpenType;
    }

    @JsonProperty("OpenType")
    public void setOpenType(OpenTypeEnum OpenType) {
        this.OpenType = OpenType;
    }

    // Height
    private Integer Height;

    @JsonProperty("Height")
    public Integer getHeight() {
        return this.Height;
    }

    @JsonProperty("Height")
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    // Width
    private Integer Width;

    @JsonProperty("Width")
    public Integer getWidth() {
        return this.Width;
    }

    @JsonProperty("Width")
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    // ShowsLocation
    private Boolean ShowsLocation;

    @JsonProperty("ShowsLocation")
    public Boolean getShowsLocation() {
        return this.ShowsLocation;
    }

    @JsonProperty("ShowsLocation")
    public void setShowsLocation(Boolean ShowsLocation) {
        this.ShowsLocation = ShowsLocation;
    }

    // HasScrollbars
    private Boolean HasScrollbars;

    @JsonProperty("HasScrollbars")
    public Boolean getHasScrollbars() {
        return this.HasScrollbars;
    }

    @JsonProperty("HasScrollbars")
    public void setHasScrollbars(Boolean HasScrollbars) {
        this.HasScrollbars = HasScrollbars;
    }

    // HasToolbar
    private Boolean HasToolbar;

    @JsonProperty("HasToolbar")
    public Boolean getHasToolbar() {
        return this.HasToolbar;
    }

    @JsonProperty("HasToolbar")
    public void setHasToolbar(Boolean HasToolbar) {
        this.HasToolbar = HasToolbar;
    }

    // HasMenubar
    private Boolean HasMenubar;

    @JsonProperty("HasMenubar")
    public Boolean getHasMenubar() {
        return this.HasMenubar;
    }

    @JsonProperty("HasMenubar")
    public void setHasMenubar(Boolean HasMenubar) {
        this.HasMenubar = HasMenubar;
    }

    // ShowsStatus
    private Boolean ShowsStatus;

    @JsonProperty("ShowsStatus")
    public Boolean getShowsStatus() {
        return this.ShowsStatus;
    }

    @JsonProperty("ShowsStatus")
    public void setShowsStatus(Boolean ShowsStatus) {
        this.ShowsStatus = ShowsStatus;
    }

    // IsResizable
    private Boolean IsResizable;

    @JsonProperty("IsResizable")
    public Boolean getIsResizable() {
        return this.IsResizable;
    }

    @JsonProperty("IsResizable")
    public void setIsResizable(Boolean IsResizable) {
        this.IsResizable = IsResizable;
    }

    // Position
    @XStreamConverter(PicklistEnumConverter.class)
    private PositionEnum Position;

    @JsonProperty("Position")
    public PositionEnum getPosition() {
        return this.Position;
    }

    @JsonProperty("Position")
    public void setPosition(PositionEnum Position) {
        this.Position = Position;
    }

    // ScontrolId
    private String ScontrolId;

    @JsonProperty("ScontrolId")
    public String getScontrolId() {
        return this.ScontrolId;
    }

    @JsonProperty("ScontrolId")
    public void setScontrolId(String ScontrolId) {
        this.ScontrolId = ScontrolId;
    }

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

    // DisplayType
    @XStreamConverter(PicklistEnumConverter.class)
    private DisplayTypeEnum DisplayType;

    @JsonProperty("DisplayType")
    public DisplayTypeEnum getDisplayType() {
        return this.DisplayType;
    }

    @JsonProperty("DisplayType")
    public void setDisplayType(DisplayTypeEnum DisplayType) {
        this.DisplayType = DisplayType;
    }

    // RequireRowSelection
    private Boolean RequireRowSelection;

    @JsonProperty("RequireRowSelection")
    public Boolean getRequireRowSelection() {
        return this.RequireRowSelection;
    }

    @JsonProperty("RequireRowSelection")
    public void setRequireRowSelection(Boolean RequireRowSelection) {
        this.RequireRowSelection = RequireRowSelection;
    }

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

}
