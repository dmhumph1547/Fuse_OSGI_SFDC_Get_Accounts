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
 * Salesforce DTO for SObject AccountCleanInfo
 */
@XStreamAlias("AccountCleanInfo")
public class AccountCleanInfo extends AbstractSObjectBase {

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

    // LastMatchedDate
    private org.joda.time.DateTime LastMatchedDate;

    @JsonProperty("LastMatchedDate")
    public org.joda.time.DateTime getLastMatchedDate() {
        return this.LastMatchedDate;
    }

    @JsonProperty("LastMatchedDate")
    public void setLastMatchedDate(org.joda.time.DateTime LastMatchedDate) {
        this.LastMatchedDate = LastMatchedDate;
    }

    // LastStatusChangedDate
    private org.joda.time.DateTime LastStatusChangedDate;

    @JsonProperty("LastStatusChangedDate")
    public org.joda.time.DateTime getLastStatusChangedDate() {
        return this.LastStatusChangedDate;
    }

    @JsonProperty("LastStatusChangedDate")
    public void setLastStatusChangedDate(org.joda.time.DateTime LastStatusChangedDate) {
        this.LastStatusChangedDate = LastStatusChangedDate;
    }

    // LastStatusChangedById
    private String LastStatusChangedById;

    @JsonProperty("LastStatusChangedById")
    public String getLastStatusChangedById() {
        return this.LastStatusChangedById;
    }

    @JsonProperty("LastStatusChangedById")
    public void setLastStatusChangedById(String LastStatusChangedById) {
        this.LastStatusChangedById = LastStatusChangedById;
    }

    // IsInactive
    private Boolean IsInactive;

    @JsonProperty("IsInactive")
    public Boolean getIsInactive() {
        return this.IsInactive;
    }

    @JsonProperty("IsInactive")
    public void setIsInactive(Boolean IsInactive) {
        this.IsInactive = IsInactive;
    }

    // CompanyName
    private String CompanyName;

    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return this.CompanyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
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

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Latitude
    private Double Latitude;

    @JsonProperty("Latitude")
    public Double getLatitude() {
        return this.Latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    // Longitude
    private Double Longitude;

    @JsonProperty("Longitude")
    public Double getLongitude() {
        return this.Longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    // Address
    private org.apache.camel.component.salesforce.api.dto.Address Address;

    @JsonProperty("Address")
    public org.apache.camel.component.salesforce.api.dto.Address getAddress() {
        return this.Address;
    }

    @JsonProperty("Address")
    public void setAddress(org.apache.camel.component.salesforce.api.dto.Address Address) {
        this.Address = Address;
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

    // SicDescription
    private String SicDescription;

    @JsonProperty("SicDescription")
    public String getSicDescription() {
        return this.SicDescription;
    }

    @JsonProperty("SicDescription")
    public void setSicDescription(String SicDescription) {
        this.SicDescription = SicDescription;
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

    // NaicsDescription
    private String NaicsDescription;

    @JsonProperty("NaicsDescription")
    public String getNaicsDescription() {
        return this.NaicsDescription;
    }

    @JsonProperty("NaicsDescription")
    public void setNaicsDescription(String NaicsDescription) {
        this.NaicsDescription = NaicsDescription;
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

    // AccountSite
    private String AccountSite;

    @JsonProperty("AccountSite")
    public String getAccountSite() {
        return this.AccountSite;
    }

    @JsonProperty("AccountSite")
    public void setAccountSite(String AccountSite) {
        this.AccountSite = AccountSite;
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

    // DandBCompanyDunsNumber
    private String DandBCompanyDunsNumber;

    @JsonProperty("DandBCompanyDunsNumber")
    public String getDandBCompanyDunsNumber() {
        return this.DandBCompanyDunsNumber;
    }

    @JsonProperty("DandBCompanyDunsNumber")
    public void setDandBCompanyDunsNumber(String DandBCompanyDunsNumber) {
        this.DandBCompanyDunsNumber = DandBCompanyDunsNumber;
    }

    // DunsRightMatchGrade
    private String DunsRightMatchGrade;

    @JsonProperty("DunsRightMatchGrade")
    public String getDunsRightMatchGrade() {
        return this.DunsRightMatchGrade;
    }

    @JsonProperty("DunsRightMatchGrade")
    public void setDunsRightMatchGrade(String DunsRightMatchGrade) {
        this.DunsRightMatchGrade = DunsRightMatchGrade;
    }

    // DunsRightMatchConfidence
    private Integer DunsRightMatchConfidence;

    @JsonProperty("DunsRightMatchConfidence")
    public Integer getDunsRightMatchConfidence() {
        return this.DunsRightMatchConfidence;
    }

    @JsonProperty("DunsRightMatchConfidence")
    public void setDunsRightMatchConfidence(Integer DunsRightMatchConfidence) {
        this.DunsRightMatchConfidence = DunsRightMatchConfidence;
    }

    // CompanyStatusDataDotCom
    @XStreamConverter(PicklistEnumConverter.class)
    private CompanyStatusDataDotComEnum CompanyStatusDataDotCom;

    @JsonProperty("CompanyStatusDataDotCom")
    public CompanyStatusDataDotComEnum getCompanyStatusDataDotCom() {
        return this.CompanyStatusDataDotCom;
    }

    @JsonProperty("CompanyStatusDataDotCom")
    public void setCompanyStatusDataDotCom(CompanyStatusDataDotComEnum CompanyStatusDataDotCom) {
        this.CompanyStatusDataDotCom = CompanyStatusDataDotCom;
    }

    // IsReviewedCompanyName
    private Boolean IsReviewedCompanyName;

    @JsonProperty("IsReviewedCompanyName")
    public Boolean getIsReviewedCompanyName() {
        return this.IsReviewedCompanyName;
    }

    @JsonProperty("IsReviewedCompanyName")
    public void setIsReviewedCompanyName(Boolean IsReviewedCompanyName) {
        this.IsReviewedCompanyName = IsReviewedCompanyName;
    }

    // IsReviewedPhone
    private Boolean IsReviewedPhone;

    @JsonProperty("IsReviewedPhone")
    public Boolean getIsReviewedPhone() {
        return this.IsReviewedPhone;
    }

    @JsonProperty("IsReviewedPhone")
    public void setIsReviewedPhone(Boolean IsReviewedPhone) {
        this.IsReviewedPhone = IsReviewedPhone;
    }

    // IsReviewedAddress
    private Boolean IsReviewedAddress;

    @JsonProperty("IsReviewedAddress")
    public Boolean getIsReviewedAddress() {
        return this.IsReviewedAddress;
    }

    @JsonProperty("IsReviewedAddress")
    public void setIsReviewedAddress(Boolean IsReviewedAddress) {
        this.IsReviewedAddress = IsReviewedAddress;
    }

    // IsReviewedWebsite
    private Boolean IsReviewedWebsite;

    @JsonProperty("IsReviewedWebsite")
    public Boolean getIsReviewedWebsite() {
        return this.IsReviewedWebsite;
    }

    @JsonProperty("IsReviewedWebsite")
    public void setIsReviewedWebsite(Boolean IsReviewedWebsite) {
        this.IsReviewedWebsite = IsReviewedWebsite;
    }

    // IsReviewedTickerSymbol
    private Boolean IsReviewedTickerSymbol;

    @JsonProperty("IsReviewedTickerSymbol")
    public Boolean getIsReviewedTickerSymbol() {
        return this.IsReviewedTickerSymbol;
    }

    @JsonProperty("IsReviewedTickerSymbol")
    public void setIsReviewedTickerSymbol(Boolean IsReviewedTickerSymbol) {
        this.IsReviewedTickerSymbol = IsReviewedTickerSymbol;
    }

    // IsReviewedAnnualRevenue
    private Boolean IsReviewedAnnualRevenue;

    @JsonProperty("IsReviewedAnnualRevenue")
    public Boolean getIsReviewedAnnualRevenue() {
        return this.IsReviewedAnnualRevenue;
    }

    @JsonProperty("IsReviewedAnnualRevenue")
    public void setIsReviewedAnnualRevenue(Boolean IsReviewedAnnualRevenue) {
        this.IsReviewedAnnualRevenue = IsReviewedAnnualRevenue;
    }

    // IsReviewedNumberOfEmployees
    private Boolean IsReviewedNumberOfEmployees;

    @JsonProperty("IsReviewedNumberOfEmployees")
    public Boolean getIsReviewedNumberOfEmployees() {
        return this.IsReviewedNumberOfEmployees;
    }

    @JsonProperty("IsReviewedNumberOfEmployees")
    public void setIsReviewedNumberOfEmployees(Boolean IsReviewedNumberOfEmployees) {
        this.IsReviewedNumberOfEmployees = IsReviewedNumberOfEmployees;
    }

    // IsReviewedIndustry
    private Boolean IsReviewedIndustry;

    @JsonProperty("IsReviewedIndustry")
    public Boolean getIsReviewedIndustry() {
        return this.IsReviewedIndustry;
    }

    @JsonProperty("IsReviewedIndustry")
    public void setIsReviewedIndustry(Boolean IsReviewedIndustry) {
        this.IsReviewedIndustry = IsReviewedIndustry;
    }

    // IsReviewedOwnership
    private Boolean IsReviewedOwnership;

    @JsonProperty("IsReviewedOwnership")
    public Boolean getIsReviewedOwnership() {
        return this.IsReviewedOwnership;
    }

    @JsonProperty("IsReviewedOwnership")
    public void setIsReviewedOwnership(Boolean IsReviewedOwnership) {
        this.IsReviewedOwnership = IsReviewedOwnership;
    }

    // IsReviewedDunsNumber
    private Boolean IsReviewedDunsNumber;

    @JsonProperty("IsReviewedDunsNumber")
    public Boolean getIsReviewedDunsNumber() {
        return this.IsReviewedDunsNumber;
    }

    @JsonProperty("IsReviewedDunsNumber")
    public void setIsReviewedDunsNumber(Boolean IsReviewedDunsNumber) {
        this.IsReviewedDunsNumber = IsReviewedDunsNumber;
    }

    // IsReviewedSic
    private Boolean IsReviewedSic;

    @JsonProperty("IsReviewedSic")
    public Boolean getIsReviewedSic() {
        return this.IsReviewedSic;
    }

    @JsonProperty("IsReviewedSic")
    public void setIsReviewedSic(Boolean IsReviewedSic) {
        this.IsReviewedSic = IsReviewedSic;
    }

    // IsReviewedSicDescription
    private Boolean IsReviewedSicDescription;

    @JsonProperty("IsReviewedSicDescription")
    public Boolean getIsReviewedSicDescription() {
        return this.IsReviewedSicDescription;
    }

    @JsonProperty("IsReviewedSicDescription")
    public void setIsReviewedSicDescription(Boolean IsReviewedSicDescription) {
        this.IsReviewedSicDescription = IsReviewedSicDescription;
    }

    // IsReviewedNaicsCode
    private Boolean IsReviewedNaicsCode;

    @JsonProperty("IsReviewedNaicsCode")
    public Boolean getIsReviewedNaicsCode() {
        return this.IsReviewedNaicsCode;
    }

    @JsonProperty("IsReviewedNaicsCode")
    public void setIsReviewedNaicsCode(Boolean IsReviewedNaicsCode) {
        this.IsReviewedNaicsCode = IsReviewedNaicsCode;
    }

    // IsReviewedNaicsDescription
    private Boolean IsReviewedNaicsDescription;

    @JsonProperty("IsReviewedNaicsDescription")
    public Boolean getIsReviewedNaicsDescription() {
        return this.IsReviewedNaicsDescription;
    }

    @JsonProperty("IsReviewedNaicsDescription")
    public void setIsReviewedNaicsDescription(Boolean IsReviewedNaicsDescription) {
        this.IsReviewedNaicsDescription = IsReviewedNaicsDescription;
    }

    // IsReviewedYearStarted
    private Boolean IsReviewedYearStarted;

    @JsonProperty("IsReviewedYearStarted")
    public Boolean getIsReviewedYearStarted() {
        return this.IsReviewedYearStarted;
    }

    @JsonProperty("IsReviewedYearStarted")
    public void setIsReviewedYearStarted(Boolean IsReviewedYearStarted) {
        this.IsReviewedYearStarted = IsReviewedYearStarted;
    }

    // IsReviewedFax
    private Boolean IsReviewedFax;

    @JsonProperty("IsReviewedFax")
    public Boolean getIsReviewedFax() {
        return this.IsReviewedFax;
    }

    @JsonProperty("IsReviewedFax")
    public void setIsReviewedFax(Boolean IsReviewedFax) {
        this.IsReviewedFax = IsReviewedFax;
    }

    // IsReviewedAccountSite
    private Boolean IsReviewedAccountSite;

    @JsonProperty("IsReviewedAccountSite")
    public Boolean getIsReviewedAccountSite() {
        return this.IsReviewedAccountSite;
    }

    @JsonProperty("IsReviewedAccountSite")
    public void setIsReviewedAccountSite(Boolean IsReviewedAccountSite) {
        this.IsReviewedAccountSite = IsReviewedAccountSite;
    }

    // IsReviewedDescription
    private Boolean IsReviewedDescription;

    @JsonProperty("IsReviewedDescription")
    public Boolean getIsReviewedDescription() {
        return this.IsReviewedDescription;
    }

    @JsonProperty("IsReviewedDescription")
    public void setIsReviewedDescription(Boolean IsReviewedDescription) {
        this.IsReviewedDescription = IsReviewedDescription;
    }

    // IsReviewedTradestyle
    private Boolean IsReviewedTradestyle;

    @JsonProperty("IsReviewedTradestyle")
    public Boolean getIsReviewedTradestyle() {
        return this.IsReviewedTradestyle;
    }

    @JsonProperty("IsReviewedTradestyle")
    public void setIsReviewedTradestyle(Boolean IsReviewedTradestyle) {
        this.IsReviewedTradestyle = IsReviewedTradestyle;
    }

    // IsReviewedDandBCompanyDunsNumber
    private Boolean IsReviewedDandBCompanyDunsNumber;

    @JsonProperty("IsReviewedDandBCompanyDunsNumber")
    public Boolean getIsReviewedDandBCompanyDunsNumber() {
        return this.IsReviewedDandBCompanyDunsNumber;
    }

    @JsonProperty("IsReviewedDandBCompanyDunsNumber")
    public void setIsReviewedDandBCompanyDunsNumber(Boolean IsReviewedDandBCompanyDunsNumber) {
        this.IsReviewedDandBCompanyDunsNumber = IsReviewedDandBCompanyDunsNumber;
    }

    // IsDifferentCompanyName
    private Boolean IsDifferentCompanyName;

    @JsonProperty("IsDifferentCompanyName")
    public Boolean getIsDifferentCompanyName() {
        return this.IsDifferentCompanyName;
    }

    @JsonProperty("IsDifferentCompanyName")
    public void setIsDifferentCompanyName(Boolean IsDifferentCompanyName) {
        this.IsDifferentCompanyName = IsDifferentCompanyName;
    }

    // IsDifferentPhone
    private Boolean IsDifferentPhone;

    @JsonProperty("IsDifferentPhone")
    public Boolean getIsDifferentPhone() {
        return this.IsDifferentPhone;
    }

    @JsonProperty("IsDifferentPhone")
    public void setIsDifferentPhone(Boolean IsDifferentPhone) {
        this.IsDifferentPhone = IsDifferentPhone;
    }

    // IsDifferentStreet
    private Boolean IsDifferentStreet;

    @JsonProperty("IsDifferentStreet")
    public Boolean getIsDifferentStreet() {
        return this.IsDifferentStreet;
    }

    @JsonProperty("IsDifferentStreet")
    public void setIsDifferentStreet(Boolean IsDifferentStreet) {
        this.IsDifferentStreet = IsDifferentStreet;
    }

    // IsDifferentCity
    private Boolean IsDifferentCity;

    @JsonProperty("IsDifferentCity")
    public Boolean getIsDifferentCity() {
        return this.IsDifferentCity;
    }

    @JsonProperty("IsDifferentCity")
    public void setIsDifferentCity(Boolean IsDifferentCity) {
        this.IsDifferentCity = IsDifferentCity;
    }

    // IsDifferentState
    private Boolean IsDifferentState;

    @JsonProperty("IsDifferentState")
    public Boolean getIsDifferentState() {
        return this.IsDifferentState;
    }

    @JsonProperty("IsDifferentState")
    public void setIsDifferentState(Boolean IsDifferentState) {
        this.IsDifferentState = IsDifferentState;
    }

    // IsDifferentPostalCode
    private Boolean IsDifferentPostalCode;

    @JsonProperty("IsDifferentPostalCode")
    public Boolean getIsDifferentPostalCode() {
        return this.IsDifferentPostalCode;
    }

    @JsonProperty("IsDifferentPostalCode")
    public void setIsDifferentPostalCode(Boolean IsDifferentPostalCode) {
        this.IsDifferentPostalCode = IsDifferentPostalCode;
    }

    // IsDifferentCountry
    private Boolean IsDifferentCountry;

    @JsonProperty("IsDifferentCountry")
    public Boolean getIsDifferentCountry() {
        return this.IsDifferentCountry;
    }

    @JsonProperty("IsDifferentCountry")
    public void setIsDifferentCountry(Boolean IsDifferentCountry) {
        this.IsDifferentCountry = IsDifferentCountry;
    }

    // IsDifferentWebsite
    private Boolean IsDifferentWebsite;

    @JsonProperty("IsDifferentWebsite")
    public Boolean getIsDifferentWebsite() {
        return this.IsDifferentWebsite;
    }

    @JsonProperty("IsDifferentWebsite")
    public void setIsDifferentWebsite(Boolean IsDifferentWebsite) {
        this.IsDifferentWebsite = IsDifferentWebsite;
    }

    // IsDifferentTickerSymbol
    private Boolean IsDifferentTickerSymbol;

    @JsonProperty("IsDifferentTickerSymbol")
    public Boolean getIsDifferentTickerSymbol() {
        return this.IsDifferentTickerSymbol;
    }

    @JsonProperty("IsDifferentTickerSymbol")
    public void setIsDifferentTickerSymbol(Boolean IsDifferentTickerSymbol) {
        this.IsDifferentTickerSymbol = IsDifferentTickerSymbol;
    }

    // IsDifferentAnnualRevenue
    private Boolean IsDifferentAnnualRevenue;

    @JsonProperty("IsDifferentAnnualRevenue")
    public Boolean getIsDifferentAnnualRevenue() {
        return this.IsDifferentAnnualRevenue;
    }

    @JsonProperty("IsDifferentAnnualRevenue")
    public void setIsDifferentAnnualRevenue(Boolean IsDifferentAnnualRevenue) {
        this.IsDifferentAnnualRevenue = IsDifferentAnnualRevenue;
    }

    // IsDifferentNumberOfEmployees
    private Boolean IsDifferentNumberOfEmployees;

    @JsonProperty("IsDifferentNumberOfEmployees")
    public Boolean getIsDifferentNumberOfEmployees() {
        return this.IsDifferentNumberOfEmployees;
    }

    @JsonProperty("IsDifferentNumberOfEmployees")
    public void setIsDifferentNumberOfEmployees(Boolean IsDifferentNumberOfEmployees) {
        this.IsDifferentNumberOfEmployees = IsDifferentNumberOfEmployees;
    }

    // IsDifferentIndustry
    private Boolean IsDifferentIndustry;

    @JsonProperty("IsDifferentIndustry")
    public Boolean getIsDifferentIndustry() {
        return this.IsDifferentIndustry;
    }

    @JsonProperty("IsDifferentIndustry")
    public void setIsDifferentIndustry(Boolean IsDifferentIndustry) {
        this.IsDifferentIndustry = IsDifferentIndustry;
    }

    // IsDifferentOwnership
    private Boolean IsDifferentOwnership;

    @JsonProperty("IsDifferentOwnership")
    public Boolean getIsDifferentOwnership() {
        return this.IsDifferentOwnership;
    }

    @JsonProperty("IsDifferentOwnership")
    public void setIsDifferentOwnership(Boolean IsDifferentOwnership) {
        this.IsDifferentOwnership = IsDifferentOwnership;
    }

    // IsDifferentDunsNumber
    private Boolean IsDifferentDunsNumber;

    @JsonProperty("IsDifferentDunsNumber")
    public Boolean getIsDifferentDunsNumber() {
        return this.IsDifferentDunsNumber;
    }

    @JsonProperty("IsDifferentDunsNumber")
    public void setIsDifferentDunsNumber(Boolean IsDifferentDunsNumber) {
        this.IsDifferentDunsNumber = IsDifferentDunsNumber;
    }

    // IsDifferentSic
    private Boolean IsDifferentSic;

    @JsonProperty("IsDifferentSic")
    public Boolean getIsDifferentSic() {
        return this.IsDifferentSic;
    }

    @JsonProperty("IsDifferentSic")
    public void setIsDifferentSic(Boolean IsDifferentSic) {
        this.IsDifferentSic = IsDifferentSic;
    }

    // IsDifferentSicDescription
    private Boolean IsDifferentSicDescription;

    @JsonProperty("IsDifferentSicDescription")
    public Boolean getIsDifferentSicDescription() {
        return this.IsDifferentSicDescription;
    }

    @JsonProperty("IsDifferentSicDescription")
    public void setIsDifferentSicDescription(Boolean IsDifferentSicDescription) {
        this.IsDifferentSicDescription = IsDifferentSicDescription;
    }

    // IsDifferentNaicsCode
    private Boolean IsDifferentNaicsCode;

    @JsonProperty("IsDifferentNaicsCode")
    public Boolean getIsDifferentNaicsCode() {
        return this.IsDifferentNaicsCode;
    }

    @JsonProperty("IsDifferentNaicsCode")
    public void setIsDifferentNaicsCode(Boolean IsDifferentNaicsCode) {
        this.IsDifferentNaicsCode = IsDifferentNaicsCode;
    }

    // IsDifferentNaicsDescription
    private Boolean IsDifferentNaicsDescription;

    @JsonProperty("IsDifferentNaicsDescription")
    public Boolean getIsDifferentNaicsDescription() {
        return this.IsDifferentNaicsDescription;
    }

    @JsonProperty("IsDifferentNaicsDescription")
    public void setIsDifferentNaicsDescription(Boolean IsDifferentNaicsDescription) {
        this.IsDifferentNaicsDescription = IsDifferentNaicsDescription;
    }

    // IsDifferentYearStarted
    private Boolean IsDifferentYearStarted;

    @JsonProperty("IsDifferentYearStarted")
    public Boolean getIsDifferentYearStarted() {
        return this.IsDifferentYearStarted;
    }

    @JsonProperty("IsDifferentYearStarted")
    public void setIsDifferentYearStarted(Boolean IsDifferentYearStarted) {
        this.IsDifferentYearStarted = IsDifferentYearStarted;
    }

    // IsDifferentFax
    private Boolean IsDifferentFax;

    @JsonProperty("IsDifferentFax")
    public Boolean getIsDifferentFax() {
        return this.IsDifferentFax;
    }

    @JsonProperty("IsDifferentFax")
    public void setIsDifferentFax(Boolean IsDifferentFax) {
        this.IsDifferentFax = IsDifferentFax;
    }

    // IsDifferentAccountSite
    private Boolean IsDifferentAccountSite;

    @JsonProperty("IsDifferentAccountSite")
    public Boolean getIsDifferentAccountSite() {
        return this.IsDifferentAccountSite;
    }

    @JsonProperty("IsDifferentAccountSite")
    public void setIsDifferentAccountSite(Boolean IsDifferentAccountSite) {
        this.IsDifferentAccountSite = IsDifferentAccountSite;
    }

    // IsDifferentDescription
    private Boolean IsDifferentDescription;

    @JsonProperty("IsDifferentDescription")
    public Boolean getIsDifferentDescription() {
        return this.IsDifferentDescription;
    }

    @JsonProperty("IsDifferentDescription")
    public void setIsDifferentDescription(Boolean IsDifferentDescription) {
        this.IsDifferentDescription = IsDifferentDescription;
    }

    // IsDifferentTradestyle
    private Boolean IsDifferentTradestyle;

    @JsonProperty("IsDifferentTradestyle")
    public Boolean getIsDifferentTradestyle() {
        return this.IsDifferentTradestyle;
    }

    @JsonProperty("IsDifferentTradestyle")
    public void setIsDifferentTradestyle(Boolean IsDifferentTradestyle) {
        this.IsDifferentTradestyle = IsDifferentTradestyle;
    }

    // IsDifferentDandBCompanyDunsNumber
    private Boolean IsDifferentDandBCompanyDunsNumber;

    @JsonProperty("IsDifferentDandBCompanyDunsNumber")
    public Boolean getIsDifferentDandBCompanyDunsNumber() {
        return this.IsDifferentDandBCompanyDunsNumber;
    }

    @JsonProperty("IsDifferentDandBCompanyDunsNumber")
    public void setIsDifferentDandBCompanyDunsNumber(Boolean IsDifferentDandBCompanyDunsNumber) {
        this.IsDifferentDandBCompanyDunsNumber = IsDifferentDandBCompanyDunsNumber;
    }

    // IsDifferentStateCode
    private Boolean IsDifferentStateCode;

    @JsonProperty("IsDifferentStateCode")
    public Boolean getIsDifferentStateCode() {
        return this.IsDifferentStateCode;
    }

    @JsonProperty("IsDifferentStateCode")
    public void setIsDifferentStateCode(Boolean IsDifferentStateCode) {
        this.IsDifferentStateCode = IsDifferentStateCode;
    }

    // IsDifferentCountryCode
    private Boolean IsDifferentCountryCode;

    @JsonProperty("IsDifferentCountryCode")
    public Boolean getIsDifferentCountryCode() {
        return this.IsDifferentCountryCode;
    }

    @JsonProperty("IsDifferentCountryCode")
    public void setIsDifferentCountryCode(Boolean IsDifferentCountryCode) {
        this.IsDifferentCountryCode = IsDifferentCountryCode;
    }

    // CleanedByJob
    private Boolean CleanedByJob;

    @JsonProperty("CleanedByJob")
    public Boolean getCleanedByJob() {
        return this.CleanedByJob;
    }

    @JsonProperty("CleanedByJob")
    public void setCleanedByJob(Boolean CleanedByJob) {
        this.CleanedByJob = CleanedByJob;
    }

    // CleanedByUser
    private Boolean CleanedByUser;

    @JsonProperty("CleanedByUser")
    public Boolean getCleanedByUser() {
        return this.CleanedByUser;
    }

    @JsonProperty("CleanedByUser")
    public void setCleanedByUser(Boolean CleanedByUser) {
        this.CleanedByUser = CleanedByUser;
    }

    // IsFlaggedWrongCompanyName
    private Boolean IsFlaggedWrongCompanyName;

    @JsonProperty("IsFlaggedWrongCompanyName")
    public Boolean getIsFlaggedWrongCompanyName() {
        return this.IsFlaggedWrongCompanyName;
    }

    @JsonProperty("IsFlaggedWrongCompanyName")
    public void setIsFlaggedWrongCompanyName(Boolean IsFlaggedWrongCompanyName) {
        this.IsFlaggedWrongCompanyName = IsFlaggedWrongCompanyName;
    }

    // IsFlaggedWrongPhone
    private Boolean IsFlaggedWrongPhone;

    @JsonProperty("IsFlaggedWrongPhone")
    public Boolean getIsFlaggedWrongPhone() {
        return this.IsFlaggedWrongPhone;
    }

    @JsonProperty("IsFlaggedWrongPhone")
    public void setIsFlaggedWrongPhone(Boolean IsFlaggedWrongPhone) {
        this.IsFlaggedWrongPhone = IsFlaggedWrongPhone;
    }

    // IsFlaggedWrongAddress
    private Boolean IsFlaggedWrongAddress;

    @JsonProperty("IsFlaggedWrongAddress")
    public Boolean getIsFlaggedWrongAddress() {
        return this.IsFlaggedWrongAddress;
    }

    @JsonProperty("IsFlaggedWrongAddress")
    public void setIsFlaggedWrongAddress(Boolean IsFlaggedWrongAddress) {
        this.IsFlaggedWrongAddress = IsFlaggedWrongAddress;
    }

    // IsFlaggedWrongWebsite
    private Boolean IsFlaggedWrongWebsite;

    @JsonProperty("IsFlaggedWrongWebsite")
    public Boolean getIsFlaggedWrongWebsite() {
        return this.IsFlaggedWrongWebsite;
    }

    @JsonProperty("IsFlaggedWrongWebsite")
    public void setIsFlaggedWrongWebsite(Boolean IsFlaggedWrongWebsite) {
        this.IsFlaggedWrongWebsite = IsFlaggedWrongWebsite;
    }

    // IsFlaggedWrongTickerSymbol
    private Boolean IsFlaggedWrongTickerSymbol;

    @JsonProperty("IsFlaggedWrongTickerSymbol")
    public Boolean getIsFlaggedWrongTickerSymbol() {
        return this.IsFlaggedWrongTickerSymbol;
    }

    @JsonProperty("IsFlaggedWrongTickerSymbol")
    public void setIsFlaggedWrongTickerSymbol(Boolean IsFlaggedWrongTickerSymbol) {
        this.IsFlaggedWrongTickerSymbol = IsFlaggedWrongTickerSymbol;
    }

    // IsFlaggedWrongAnnualRevenue
    private Boolean IsFlaggedWrongAnnualRevenue;

    @JsonProperty("IsFlaggedWrongAnnualRevenue")
    public Boolean getIsFlaggedWrongAnnualRevenue() {
        return this.IsFlaggedWrongAnnualRevenue;
    }

    @JsonProperty("IsFlaggedWrongAnnualRevenue")
    public void setIsFlaggedWrongAnnualRevenue(Boolean IsFlaggedWrongAnnualRevenue) {
        this.IsFlaggedWrongAnnualRevenue = IsFlaggedWrongAnnualRevenue;
    }

    // IsFlaggedWrongNumberOfEmployees
    private Boolean IsFlaggedWrongNumberOfEmployees;

    @JsonProperty("IsFlaggedWrongNumberOfEmployees")
    public Boolean getIsFlaggedWrongNumberOfEmployees() {
        return this.IsFlaggedWrongNumberOfEmployees;
    }

    @JsonProperty("IsFlaggedWrongNumberOfEmployees")
    public void setIsFlaggedWrongNumberOfEmployees(Boolean IsFlaggedWrongNumberOfEmployees) {
        this.IsFlaggedWrongNumberOfEmployees = IsFlaggedWrongNumberOfEmployees;
    }

    // IsFlaggedWrongIndustry
    private Boolean IsFlaggedWrongIndustry;

    @JsonProperty("IsFlaggedWrongIndustry")
    public Boolean getIsFlaggedWrongIndustry() {
        return this.IsFlaggedWrongIndustry;
    }

    @JsonProperty("IsFlaggedWrongIndustry")
    public void setIsFlaggedWrongIndustry(Boolean IsFlaggedWrongIndustry) {
        this.IsFlaggedWrongIndustry = IsFlaggedWrongIndustry;
    }

    // IsFlaggedWrongOwnership
    private Boolean IsFlaggedWrongOwnership;

    @JsonProperty("IsFlaggedWrongOwnership")
    public Boolean getIsFlaggedWrongOwnership() {
        return this.IsFlaggedWrongOwnership;
    }

    @JsonProperty("IsFlaggedWrongOwnership")
    public void setIsFlaggedWrongOwnership(Boolean IsFlaggedWrongOwnership) {
        this.IsFlaggedWrongOwnership = IsFlaggedWrongOwnership;
    }

    // IsFlaggedWrongDunsNumber
    private Boolean IsFlaggedWrongDunsNumber;

    @JsonProperty("IsFlaggedWrongDunsNumber")
    public Boolean getIsFlaggedWrongDunsNumber() {
        return this.IsFlaggedWrongDunsNumber;
    }

    @JsonProperty("IsFlaggedWrongDunsNumber")
    public void setIsFlaggedWrongDunsNumber(Boolean IsFlaggedWrongDunsNumber) {
        this.IsFlaggedWrongDunsNumber = IsFlaggedWrongDunsNumber;
    }

    // IsFlaggedWrongSic
    private Boolean IsFlaggedWrongSic;

    @JsonProperty("IsFlaggedWrongSic")
    public Boolean getIsFlaggedWrongSic() {
        return this.IsFlaggedWrongSic;
    }

    @JsonProperty("IsFlaggedWrongSic")
    public void setIsFlaggedWrongSic(Boolean IsFlaggedWrongSic) {
        this.IsFlaggedWrongSic = IsFlaggedWrongSic;
    }

    // IsFlaggedWrongSicDescription
    private Boolean IsFlaggedWrongSicDescription;

    @JsonProperty("IsFlaggedWrongSicDescription")
    public Boolean getIsFlaggedWrongSicDescription() {
        return this.IsFlaggedWrongSicDescription;
    }

    @JsonProperty("IsFlaggedWrongSicDescription")
    public void setIsFlaggedWrongSicDescription(Boolean IsFlaggedWrongSicDescription) {
        this.IsFlaggedWrongSicDescription = IsFlaggedWrongSicDescription;
    }

    // IsFlaggedWrongNaicsCode
    private Boolean IsFlaggedWrongNaicsCode;

    @JsonProperty("IsFlaggedWrongNaicsCode")
    public Boolean getIsFlaggedWrongNaicsCode() {
        return this.IsFlaggedWrongNaicsCode;
    }

    @JsonProperty("IsFlaggedWrongNaicsCode")
    public void setIsFlaggedWrongNaicsCode(Boolean IsFlaggedWrongNaicsCode) {
        this.IsFlaggedWrongNaicsCode = IsFlaggedWrongNaicsCode;
    }

    // IsFlaggedWrongNaicsDescription
    private Boolean IsFlaggedWrongNaicsDescription;

    @JsonProperty("IsFlaggedWrongNaicsDescription")
    public Boolean getIsFlaggedWrongNaicsDescription() {
        return this.IsFlaggedWrongNaicsDescription;
    }

    @JsonProperty("IsFlaggedWrongNaicsDescription")
    public void setIsFlaggedWrongNaicsDescription(Boolean IsFlaggedWrongNaicsDescription) {
        this.IsFlaggedWrongNaicsDescription = IsFlaggedWrongNaicsDescription;
    }

    // IsFlaggedWrongYearStarted
    private Boolean IsFlaggedWrongYearStarted;

    @JsonProperty("IsFlaggedWrongYearStarted")
    public Boolean getIsFlaggedWrongYearStarted() {
        return this.IsFlaggedWrongYearStarted;
    }

    @JsonProperty("IsFlaggedWrongYearStarted")
    public void setIsFlaggedWrongYearStarted(Boolean IsFlaggedWrongYearStarted) {
        this.IsFlaggedWrongYearStarted = IsFlaggedWrongYearStarted;
    }

    // IsFlaggedWrongFax
    private Boolean IsFlaggedWrongFax;

    @JsonProperty("IsFlaggedWrongFax")
    public Boolean getIsFlaggedWrongFax() {
        return this.IsFlaggedWrongFax;
    }

    @JsonProperty("IsFlaggedWrongFax")
    public void setIsFlaggedWrongFax(Boolean IsFlaggedWrongFax) {
        this.IsFlaggedWrongFax = IsFlaggedWrongFax;
    }

    // IsFlaggedWrongAccountSite
    private Boolean IsFlaggedWrongAccountSite;

    @JsonProperty("IsFlaggedWrongAccountSite")
    public Boolean getIsFlaggedWrongAccountSite() {
        return this.IsFlaggedWrongAccountSite;
    }

    @JsonProperty("IsFlaggedWrongAccountSite")
    public void setIsFlaggedWrongAccountSite(Boolean IsFlaggedWrongAccountSite) {
        this.IsFlaggedWrongAccountSite = IsFlaggedWrongAccountSite;
    }

    // IsFlaggedWrongDescription
    private Boolean IsFlaggedWrongDescription;

    @JsonProperty("IsFlaggedWrongDescription")
    public Boolean getIsFlaggedWrongDescription() {
        return this.IsFlaggedWrongDescription;
    }

    @JsonProperty("IsFlaggedWrongDescription")
    public void setIsFlaggedWrongDescription(Boolean IsFlaggedWrongDescription) {
        this.IsFlaggedWrongDescription = IsFlaggedWrongDescription;
    }

    // IsFlaggedWrongTradestyle
    private Boolean IsFlaggedWrongTradestyle;

    @JsonProperty("IsFlaggedWrongTradestyle")
    public Boolean getIsFlaggedWrongTradestyle() {
        return this.IsFlaggedWrongTradestyle;
    }

    @JsonProperty("IsFlaggedWrongTradestyle")
    public void setIsFlaggedWrongTradestyle(Boolean IsFlaggedWrongTradestyle) {
        this.IsFlaggedWrongTradestyle = IsFlaggedWrongTradestyle;
    }

    // DataDotComId
    private String DataDotComId;

    @JsonProperty("DataDotComId")
    public String getDataDotComId() {
        return this.DataDotComId;
    }

    @JsonProperty("DataDotComId")
    public void setDataDotComId(String DataDotComId) {
        this.DataDotComId = DataDotComId;
    }

}
