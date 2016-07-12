/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Case
 */
@XStreamAlias("Case")
public class Case extends AbstractSObjectBase {

    // CaseNumber
    private String CaseNumber;

    @JsonProperty("CaseNumber")
    public String getCaseNumber() {
        return this.CaseNumber;
    }

    @JsonProperty("CaseNumber")
    public void setCaseNumber(String CaseNumber) {
        this.CaseNumber = CaseNumber;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
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

    // AssetId
    private String AssetId;

    @JsonProperty("AssetId")
    public String getAssetId() {
        return this.AssetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
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

    // SuppliedName
    private String SuppliedName;

    @JsonProperty("SuppliedName")
    public String getSuppliedName() {
        return this.SuppliedName;
    }

    @JsonProperty("SuppliedName")
    public void setSuppliedName(String SuppliedName) {
        this.SuppliedName = SuppliedName;
    }

    // SuppliedEmail
    private String SuppliedEmail;

    @JsonProperty("SuppliedEmail")
    public String getSuppliedEmail() {
        return this.SuppliedEmail;
    }

    @JsonProperty("SuppliedEmail")
    public void setSuppliedEmail(String SuppliedEmail) {
        this.SuppliedEmail = SuppliedEmail;
    }

    // SuppliedPhone
    private String SuppliedPhone;

    @JsonProperty("SuppliedPhone")
    public String getSuppliedPhone() {
        return this.SuppliedPhone;
    }

    @JsonProperty("SuppliedPhone")
    public void setSuppliedPhone(String SuppliedPhone) {
        this.SuppliedPhone = SuppliedPhone;
    }

    // SuppliedCompany
    private String SuppliedCompany;

    @JsonProperty("SuppliedCompany")
    public String getSuppliedCompany() {
        return this.SuppliedCompany;
    }

    @JsonProperty("SuppliedCompany")
    public void setSuppliedCompany(String SuppliedCompany) {
        this.SuppliedCompany = SuppliedCompany;
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

    // Reason
    @XStreamConverter(PicklistEnumConverter.class)
    private ReasonEnum Reason;

    @JsonProperty("Reason")
    public ReasonEnum getReason() {
        return this.Reason;
    }

    @JsonProperty("Reason")
    public void setReason(ReasonEnum Reason) {
        this.Reason = Reason;
    }

    // Origin
    @XStreamConverter(PicklistEnumConverter.class)
    private OriginEnum Origin;

    @JsonProperty("Origin")
    public OriginEnum getOrigin() {
        return this.Origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(OriginEnum Origin) {
        this.Origin = Origin;
    }

    // Subject
    private String Subject;

    @JsonProperty("Subject")
    public String getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(String Subject) {
        this.Subject = Subject;
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

    // ClosedDate
    private org.joda.time.DateTime ClosedDate;

    @JsonProperty("ClosedDate")
    public org.joda.time.DateTime getClosedDate() {
        return this.ClosedDate;
    }

    @JsonProperty("ClosedDate")
    public void setClosedDate(org.joda.time.DateTime ClosedDate) {
        this.ClosedDate = ClosedDate;
    }

    // IsEscalated
    private Boolean IsEscalated;

    @JsonProperty("IsEscalated")
    public Boolean getIsEscalated() {
        return this.IsEscalated;
    }

    @JsonProperty("IsEscalated")
    public void setIsEscalated(Boolean IsEscalated) {
        this.IsEscalated = IsEscalated;
    }

    // EngineeringReqNumber__c
    private String EngineeringReqNumber__c;

    @JsonProperty("EngineeringReqNumber__c")
    public String getEngineeringReqNumber__c() {
        return this.EngineeringReqNumber__c;
    }

    @JsonProperty("EngineeringReqNumber__c")
    public void setEngineeringReqNumber__c(String EngineeringReqNumber__c) {
        this.EngineeringReqNumber__c = EngineeringReqNumber__c;
    }

    // SLAViolation__c
    @XStreamConverter(PicklistEnumConverter.class)
    private SLAViolationEnum SLAViolation__c;

    @JsonProperty("SLAViolation__c")
    public SLAViolationEnum getSLAViolation__c() {
        return this.SLAViolation__c;
    }

    @JsonProperty("SLAViolation__c")
    public void setSLAViolation__c(SLAViolationEnum SLAViolation__c) {
        this.SLAViolation__c = SLAViolation__c;
    }

    // Product__c
    @XStreamConverter(PicklistEnumConverter.class)
    private ProductEnum Product__c;

    @JsonProperty("Product__c")
    public ProductEnum getProduct__c() {
        return this.Product__c;
    }

    @JsonProperty("Product__c")
    public void setProduct__c(ProductEnum Product__c) {
        this.Product__c = Product__c;
    }

    // PotentialLiability__c
    @XStreamConverter(PicklistEnumConverter.class)
    private PotentialLiabilityEnum PotentialLiability__c;

    @JsonProperty("PotentialLiability__c")
    public PotentialLiabilityEnum getPotentialLiability__c() {
        return this.PotentialLiability__c;
    }

    @JsonProperty("PotentialLiability__c")
    public void setPotentialLiability__c(PotentialLiabilityEnum PotentialLiability__c) {
        this.PotentialLiability__c = PotentialLiability__c;
    }

}
