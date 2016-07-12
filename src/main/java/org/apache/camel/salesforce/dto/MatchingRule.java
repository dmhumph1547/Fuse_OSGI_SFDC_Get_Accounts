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
 * Salesforce DTO for SObject MatchingRule
 */
@XStreamAlias("MatchingRule")
public class MatchingRule extends AbstractSObjectBase {

    // SobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
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

    // MatchEngine
    @XStreamConverter(PicklistEnumConverter.class)
    private MatchEngineEnum MatchEngine;

    @JsonProperty("MatchEngine")
    public MatchEngineEnum getMatchEngine() {
        return this.MatchEngine;
    }

    @JsonProperty("MatchEngine")
    public void setMatchEngine(MatchEngineEnum MatchEngine) {
        this.MatchEngine = MatchEngine;
    }

    // BooleanFilter
    private String BooleanFilter;

    @JsonProperty("BooleanFilter")
    public String getBooleanFilter() {
        return this.BooleanFilter;
    }

    @JsonProperty("BooleanFilter")
    public void setBooleanFilter(String BooleanFilter) {
        this.BooleanFilter = BooleanFilter;
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

    // RuleStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private RuleStatusEnum RuleStatus;

    @JsonProperty("RuleStatus")
    public RuleStatusEnum getRuleStatus() {
        return this.RuleStatus;
    }

    @JsonProperty("RuleStatus")
    public void setRuleStatus(RuleStatusEnum RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

}
