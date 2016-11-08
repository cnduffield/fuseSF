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
 * Salesforce DTO for SObject ApexTestResult
 */
@XStreamAlias("ApexTestResult")
public class ApexTestResult extends AbstractSObjectBase {

    // TestTimestamp
    private org.joda.time.DateTime TestTimestamp;

    @JsonProperty("TestTimestamp")
    public org.joda.time.DateTime getTestTimestamp() {
        return this.TestTimestamp;
    }

    @JsonProperty("TestTimestamp")
    public void setTestTimestamp(org.joda.time.DateTime TestTimestamp) {
        this.TestTimestamp = TestTimestamp;
    }

    // Outcome
    @XStreamConverter(PicklistEnumConverter.class)
    private OutcomeEnum Outcome;

    @JsonProperty("Outcome")
    public OutcomeEnum getOutcome() {
        return this.Outcome;
    }

    @JsonProperty("Outcome")
    public void setOutcome(OutcomeEnum Outcome) {
        this.Outcome = Outcome;
    }

    // ApexClassId
    private String ApexClassId;

    @JsonProperty("ApexClassId")
    public String getApexClassId() {
        return this.ApexClassId;
    }

    @JsonProperty("ApexClassId")
    public void setApexClassId(String ApexClassId) {
        this.ApexClassId = ApexClassId;
    }

    // MethodName
    private String MethodName;

    @JsonProperty("MethodName")
    public String getMethodName() {
        return this.MethodName;
    }

    @JsonProperty("MethodName")
    public void setMethodName(String MethodName) {
        this.MethodName = MethodName;
    }

    // Message
    private String Message;

    @JsonProperty("Message")
    public String getMessage() {
        return this.Message;
    }

    @JsonProperty("Message")
    public void setMessage(String Message) {
        this.Message = Message;
    }

    // StackTrace
    private String StackTrace;

    @JsonProperty("StackTrace")
    public String getStackTrace() {
        return this.StackTrace;
    }

    @JsonProperty("StackTrace")
    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    // AsyncApexJobId
    private String AsyncApexJobId;

    @JsonProperty("AsyncApexJobId")
    public String getAsyncApexJobId() {
        return this.AsyncApexJobId;
    }

    @JsonProperty("AsyncApexJobId")
    public void setAsyncApexJobId(String AsyncApexJobId) {
        this.AsyncApexJobId = AsyncApexJobId;
    }

    // QueueItemId
    private String QueueItemId;

    @JsonProperty("QueueItemId")
    public String getQueueItemId() {
        return this.QueueItemId;
    }

    @JsonProperty("QueueItemId")
    public void setQueueItemId(String QueueItemId) {
        this.QueueItemId = QueueItemId;
    }

    // ApexLogId
    private String ApexLogId;

    @JsonProperty("ApexLogId")
    public String getApexLogId() {
        return this.ApexLogId;
    }

    @JsonProperty("ApexLogId")
    public void setApexLogId(String ApexLogId) {
        this.ApexLogId = ApexLogId;
    }

}
