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
 * Salesforce DTO for SObject Opportunity
 */
@XStreamAlias("Opportunity")
public class Opportunity extends AbstractSObjectBase {

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

    // IsPrivate
    private Boolean IsPrivate;

    @JsonProperty("IsPrivate")
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    @JsonProperty("IsPrivate")
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
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

    // StageName
    @XStreamConverter(PicklistEnumConverter.class)
    private StageNameEnum StageName;

    @JsonProperty("StageName")
    public StageNameEnum getStageName() {
        return this.StageName;
    }

    @JsonProperty("StageName")
    public void setStageName(StageNameEnum StageName) {
        this.StageName = StageName;
    }

    // Amount
    private Double Amount;

    @JsonProperty("Amount")
    public Double getAmount() {
        return this.Amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    // Probability
    private Double Probability;

    @JsonProperty("Probability")
    public Double getProbability() {
        return this.Probability;
    }

    @JsonProperty("Probability")
    public void setProbability(Double Probability) {
        this.Probability = Probability;
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

    // TotalOpportunityQuantity
    private Double TotalOpportunityQuantity;

    @JsonProperty("TotalOpportunityQuantity")
    public Double getTotalOpportunityQuantity() {
        return this.TotalOpportunityQuantity;
    }

    @JsonProperty("TotalOpportunityQuantity")
    public void setTotalOpportunityQuantity(Double TotalOpportunityQuantity) {
        this.TotalOpportunityQuantity = TotalOpportunityQuantity;
    }

    // CloseDate
    private org.joda.time.DateTime CloseDate;

    @JsonProperty("CloseDate")
    public org.joda.time.DateTime getCloseDate() {
        return this.CloseDate;
    }

    @JsonProperty("CloseDate")
    public void setCloseDate(org.joda.time.DateTime CloseDate) {
        this.CloseDate = CloseDate;
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

    // NextStep
    private String NextStep;

    @JsonProperty("NextStep")
    public String getNextStep() {
        return this.NextStep;
    }

    @JsonProperty("NextStep")
    public void setNextStep(String NextStep) {
        this.NextStep = NextStep;
    }

    // LeadSource
    @XStreamConverter(PicklistEnumConverter.class)
    private LeadSourceEnum LeadSource;

    @JsonProperty("LeadSource")
    public LeadSourceEnum getLeadSource() {
        return this.LeadSource;
    }

    @JsonProperty("LeadSource")
    public void setLeadSource(LeadSourceEnum LeadSource) {
        this.LeadSource = LeadSource;
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

    // CampaignId
    private String CampaignId;

    @JsonProperty("CampaignId")
    public String getCampaignId() {
        return this.CampaignId;
    }

    @JsonProperty("CampaignId")
    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    // HasOpportunityLineItem
    private Boolean HasOpportunityLineItem;

    @JsonProperty("HasOpportunityLineItem")
    public Boolean getHasOpportunityLineItem() {
        return this.HasOpportunityLineItem;
    }

    @JsonProperty("HasOpportunityLineItem")
    public void setHasOpportunityLineItem(Boolean HasOpportunityLineItem) {
        this.HasOpportunityLineItem = HasOpportunityLineItem;
    }

    // Pricebook2Id
    private String Pricebook2Id;

    @JsonProperty("Pricebook2Id")
    public String getPricebook2Id() {
        return this.Pricebook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    // FiscalQuarter
    private Integer FiscalQuarter;

    @JsonProperty("FiscalQuarter")
    public Integer getFiscalQuarter() {
        return this.FiscalQuarter;
    }

    @JsonProperty("FiscalQuarter")
    public void setFiscalQuarter(Integer FiscalQuarter) {
        this.FiscalQuarter = FiscalQuarter;
    }

    // FiscalYear
    private Integer FiscalYear;

    @JsonProperty("FiscalYear")
    public Integer getFiscalYear() {
        return this.FiscalYear;
    }

    @JsonProperty("FiscalYear")
    public void setFiscalYear(Integer FiscalYear) {
        this.FiscalYear = FiscalYear;
    }

    // Fiscal
    private String Fiscal;

    @JsonProperty("Fiscal")
    public String getFiscal() {
        return this.Fiscal;
    }

    @JsonProperty("Fiscal")
    public void setFiscal(String Fiscal) {
        this.Fiscal = Fiscal;
    }

    // DeliveryInstallationStatus__c
    @XStreamConverter(PicklistEnumConverter.class)
    private DeliveryInstallationStatusEnum DeliveryInstallationStatus__c;

    @JsonProperty("DeliveryInstallationStatus__c")
    public DeliveryInstallationStatusEnum getDeliveryInstallationStatus__c() {
        return this.DeliveryInstallationStatus__c;
    }

    @JsonProperty("DeliveryInstallationStatus__c")
    public void setDeliveryInstallationStatus__c(DeliveryInstallationStatusEnum DeliveryInstallationStatus__c) {
        this.DeliveryInstallationStatus__c = DeliveryInstallationStatus__c;
    }

    // TrackingNumber__c
    private String TrackingNumber__c;

    @JsonProperty("TrackingNumber__c")
    public String getTrackingNumber__c() {
        return this.TrackingNumber__c;
    }

    @JsonProperty("TrackingNumber__c")
    public void setTrackingNumber__c(String TrackingNumber__c) {
        this.TrackingNumber__c = TrackingNumber__c;
    }

    // OrderNumber__c
    private String OrderNumber__c;

    @JsonProperty("OrderNumber__c")
    public String getOrderNumber__c() {
        return this.OrderNumber__c;
    }

    @JsonProperty("OrderNumber__c")
    public void setOrderNumber__c(String OrderNumber__c) {
        this.OrderNumber__c = OrderNumber__c;
    }

    // CurrentGenerators__c
    private String CurrentGenerators__c;

    @JsonProperty("CurrentGenerators__c")
    public String getCurrentGenerators__c() {
        return this.CurrentGenerators__c;
    }

    @JsonProperty("CurrentGenerators__c")
    public void setCurrentGenerators__c(String CurrentGenerators__c) {
        this.CurrentGenerators__c = CurrentGenerators__c;
    }

    // MainCompetitors__c
    private String MainCompetitors__c;

    @JsonProperty("MainCompetitors__c")
    public String getMainCompetitors__c() {
        return this.MainCompetitors__c;
    }

    @JsonProperty("MainCompetitors__c")
    public void setMainCompetitors__c(String MainCompetitors__c) {
        this.MainCompetitors__c = MainCompetitors__c;
    }

}
