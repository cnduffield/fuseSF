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
 * Salesforce DTO for SObject Task
 */
@XStreamAlias("Task")
public class Task extends AbstractSObjectBase {

    // WhoId
    private String WhoId;

    @JsonProperty("WhoId")
    public String getWhoId() {
        return this.WhoId;
    }

    @JsonProperty("WhoId")
    public void setWhoId(String WhoId) {
        this.WhoId = WhoId;
    }

    // WhatId
    private String WhatId;

    @JsonProperty("WhatId")
    public String getWhatId() {
        return this.WhatId;
    }

    @JsonProperty("WhatId")
    public void setWhatId(String WhatId) {
        this.WhatId = WhatId;
    }

    // Subject
    @XStreamConverter(PicklistEnumConverter.class)
    private SubjectEnum Subject;

    @JsonProperty("Subject")
    public SubjectEnum getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(SubjectEnum Subject) {
        this.Subject = Subject;
    }

    // ActivityDate
    private org.joda.time.DateTime ActivityDate;

    @JsonProperty("ActivityDate")
    public org.joda.time.DateTime getActivityDate() {
        return this.ActivityDate;
    }

    @JsonProperty("ActivityDate")
    public void setActivityDate(org.joda.time.DateTime ActivityDate) {
        this.ActivityDate = ActivityDate;
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

    // Priority
    @XStreamConverter(PicklistEnumConverter.class)
    private PriorityEnum Priority;

    @JsonProperty("Priority")
    public PriorityEnum getPriority() {
        return this.Priority;
    }

    @JsonProperty("Priority")
    public void setPriority(PriorityEnum Priority) {
        this.Priority = Priority;
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

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
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

    // IsArchived
    private Boolean IsArchived;

    @JsonProperty("IsArchived")
    public Boolean getIsArchived() {
        return this.IsArchived;
    }

    @JsonProperty("IsArchived")
    public void setIsArchived(Boolean IsArchived) {
        this.IsArchived = IsArchived;
    }

    // CallDurationInSeconds
    private Integer CallDurationInSeconds;

    @JsonProperty("CallDurationInSeconds")
    public Integer getCallDurationInSeconds() {
        return this.CallDurationInSeconds;
    }

    @JsonProperty("CallDurationInSeconds")
    public void setCallDurationInSeconds(Integer CallDurationInSeconds) {
        this.CallDurationInSeconds = CallDurationInSeconds;
    }

    // CallType
    @XStreamConverter(PicklistEnumConverter.class)
    private CallTypeEnum CallType;

    @JsonProperty("CallType")
    public CallTypeEnum getCallType() {
        return this.CallType;
    }

    @JsonProperty("CallType")
    public void setCallType(CallTypeEnum CallType) {
        this.CallType = CallType;
    }

    // CallDisposition
    private String CallDisposition;

    @JsonProperty("CallDisposition")
    public String getCallDisposition() {
        return this.CallDisposition;
    }

    @JsonProperty("CallDisposition")
    public void setCallDisposition(String CallDisposition) {
        this.CallDisposition = CallDisposition;
    }

    // CallObject
    private String CallObject;

    @JsonProperty("CallObject")
    public String getCallObject() {
        return this.CallObject;
    }

    @JsonProperty("CallObject")
    public void setCallObject(String CallObject) {
        this.CallObject = CallObject;
    }

    // ReminderDateTime
    private org.joda.time.DateTime ReminderDateTime;

    @JsonProperty("ReminderDateTime")
    public org.joda.time.DateTime getReminderDateTime() {
        return this.ReminderDateTime;
    }

    @JsonProperty("ReminderDateTime")
    public void setReminderDateTime(org.joda.time.DateTime ReminderDateTime) {
        this.ReminderDateTime = ReminderDateTime;
    }

    // IsReminderSet
    private Boolean IsReminderSet;

    @JsonProperty("IsReminderSet")
    public Boolean getIsReminderSet() {
        return this.IsReminderSet;
    }

    @JsonProperty("IsReminderSet")
    public void setIsReminderSet(Boolean IsReminderSet) {
        this.IsReminderSet = IsReminderSet;
    }

    // RecurrenceActivityId
    private String RecurrenceActivityId;

    @JsonProperty("RecurrenceActivityId")
    public String getRecurrenceActivityId() {
        return this.RecurrenceActivityId;
    }

    @JsonProperty("RecurrenceActivityId")
    public void setRecurrenceActivityId(String RecurrenceActivityId) {
        this.RecurrenceActivityId = RecurrenceActivityId;
    }

    // IsRecurrence
    private Boolean IsRecurrence;

    @JsonProperty("IsRecurrence")
    public Boolean getIsRecurrence() {
        return this.IsRecurrence;
    }

    @JsonProperty("IsRecurrence")
    public void setIsRecurrence(Boolean IsRecurrence) {
        this.IsRecurrence = IsRecurrence;
    }

    // RecurrenceStartDateOnly
    private org.joda.time.DateTime RecurrenceStartDateOnly;

    @JsonProperty("RecurrenceStartDateOnly")
    public org.joda.time.DateTime getRecurrenceStartDateOnly() {
        return this.RecurrenceStartDateOnly;
    }

    @JsonProperty("RecurrenceStartDateOnly")
    public void setRecurrenceStartDateOnly(org.joda.time.DateTime RecurrenceStartDateOnly) {
        this.RecurrenceStartDateOnly = RecurrenceStartDateOnly;
    }

    // RecurrenceEndDateOnly
    private org.joda.time.DateTime RecurrenceEndDateOnly;

    @JsonProperty("RecurrenceEndDateOnly")
    public org.joda.time.DateTime getRecurrenceEndDateOnly() {
        return this.RecurrenceEndDateOnly;
    }

    @JsonProperty("RecurrenceEndDateOnly")
    public void setRecurrenceEndDateOnly(org.joda.time.DateTime RecurrenceEndDateOnly) {
        this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    }

    // RecurrenceTimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey;

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public RecurrenceTimeZoneSidKeyEnum getRecurrenceTimeZoneSidKey() {
        return this.RecurrenceTimeZoneSidKey;
    }

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public void setRecurrenceTimeZoneSidKey(RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey) {
        this.RecurrenceTimeZoneSidKey = RecurrenceTimeZoneSidKey;
    }

    // RecurrenceType
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceTypeEnum RecurrenceType;

    @JsonProperty("RecurrenceType")
    public RecurrenceTypeEnum getRecurrenceType() {
        return this.RecurrenceType;
    }

    @JsonProperty("RecurrenceType")
    public void setRecurrenceType(RecurrenceTypeEnum RecurrenceType) {
        this.RecurrenceType = RecurrenceType;
    }

    // RecurrenceInterval
    private Integer RecurrenceInterval;

    @JsonProperty("RecurrenceInterval")
    public Integer getRecurrenceInterval() {
        return this.RecurrenceInterval;
    }

    @JsonProperty("RecurrenceInterval")
    public void setRecurrenceInterval(Integer RecurrenceInterval) {
        this.RecurrenceInterval = RecurrenceInterval;
    }

    // RecurrenceDayOfWeekMask
    private Integer RecurrenceDayOfWeekMask;

    @JsonProperty("RecurrenceDayOfWeekMask")
    public Integer getRecurrenceDayOfWeekMask() {
        return this.RecurrenceDayOfWeekMask;
    }

    @JsonProperty("RecurrenceDayOfWeekMask")
    public void setRecurrenceDayOfWeekMask(Integer RecurrenceDayOfWeekMask) {
        this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    }

    // RecurrenceDayOfMonth
    private Integer RecurrenceDayOfMonth;

    @JsonProperty("RecurrenceDayOfMonth")
    public Integer getRecurrenceDayOfMonth() {
        return this.RecurrenceDayOfMonth;
    }

    @JsonProperty("RecurrenceDayOfMonth")
    public void setRecurrenceDayOfMonth(Integer RecurrenceDayOfMonth) {
        this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    }

    // RecurrenceInstance
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceInstanceEnum RecurrenceInstance;

    @JsonProperty("RecurrenceInstance")
    public RecurrenceInstanceEnum getRecurrenceInstance() {
        return this.RecurrenceInstance;
    }

    @JsonProperty("RecurrenceInstance")
    public void setRecurrenceInstance(RecurrenceInstanceEnum RecurrenceInstance) {
        this.RecurrenceInstance = RecurrenceInstance;
    }

    // RecurrenceMonthOfYear
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceMonthOfYearEnum RecurrenceMonthOfYear;

    @JsonProperty("RecurrenceMonthOfYear")
    public RecurrenceMonthOfYearEnum getRecurrenceMonthOfYear() {
        return this.RecurrenceMonthOfYear;
    }

    @JsonProperty("RecurrenceMonthOfYear")
    public void setRecurrenceMonthOfYear(RecurrenceMonthOfYearEnum RecurrenceMonthOfYear) {
        this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    }

}