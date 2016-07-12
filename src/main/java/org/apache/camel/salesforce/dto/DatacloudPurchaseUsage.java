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
 * Salesforce DTO for SObject DatacloudPurchaseUsage
 */
@XStreamAlias("DatacloudPurchaseUsage")
public class DatacloudPurchaseUsage extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // UserType
    @XStreamConverter(PicklistEnumConverter.class)
    private UserTypeEnum UserType;

    @JsonProperty("UserType")
    public UserTypeEnum getUserType() {
        return this.UserType;
    }

    @JsonProperty("UserType")
    public void setUserType(UserTypeEnum UserType) {
        this.UserType = UserType;
    }

    // PurchaseType
    @XStreamConverter(PicklistEnumConverter.class)
    private PurchaseTypeEnum PurchaseType;

    @JsonProperty("PurchaseType")
    public PurchaseTypeEnum getPurchaseType() {
        return this.PurchaseType;
    }

    @JsonProperty("PurchaseType")
    public void setPurchaseType(PurchaseTypeEnum PurchaseType) {
        this.PurchaseType = PurchaseType;
    }

    // DatacloudEntityType
    @XStreamConverter(PicklistEnumConverter.class)
    private DatacloudEntityTypeEnum DatacloudEntityType;

    @JsonProperty("DatacloudEntityType")
    public DatacloudEntityTypeEnum getDatacloudEntityType() {
        return this.DatacloudEntityType;
    }

    @JsonProperty("DatacloudEntityType")
    public void setDatacloudEntityType(DatacloudEntityTypeEnum DatacloudEntityType) {
        this.DatacloudEntityType = DatacloudEntityType;
    }

    // Usage
    private Double Usage;

    @JsonProperty("Usage")
    public Double getUsage() {
        return this.Usage;
    }

    @JsonProperty("Usage")
    public void setUsage(Double Usage) {
        this.Usage = Usage;
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
