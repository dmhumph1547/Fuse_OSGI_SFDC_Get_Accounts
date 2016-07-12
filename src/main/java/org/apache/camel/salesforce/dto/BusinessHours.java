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
 * Salesforce DTO for SObject BusinessHours
 */
@XStreamAlias("BusinessHours")
public class BusinessHours extends AbstractSObjectBase {

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

    // IsDefault
    private Boolean IsDefault;

    @JsonProperty("IsDefault")
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    @JsonProperty("IsDefault")
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    // SundayStartTime
    private org.joda.time.DateTime SundayStartTime;

    @JsonProperty("SundayStartTime")
    public org.joda.time.DateTime getSundayStartTime() {
        return this.SundayStartTime;
    }

    @JsonProperty("SundayStartTime")
    public void setSundayStartTime(org.joda.time.DateTime SundayStartTime) {
        this.SundayStartTime = SundayStartTime;
    }

    // SundayEndTime
    private org.joda.time.DateTime SundayEndTime;

    @JsonProperty("SundayEndTime")
    public org.joda.time.DateTime getSundayEndTime() {
        return this.SundayEndTime;
    }

    @JsonProperty("SundayEndTime")
    public void setSundayEndTime(org.joda.time.DateTime SundayEndTime) {
        this.SundayEndTime = SundayEndTime;
    }

    // MondayStartTime
    private org.joda.time.DateTime MondayStartTime;

    @JsonProperty("MondayStartTime")
    public org.joda.time.DateTime getMondayStartTime() {
        return this.MondayStartTime;
    }

    @JsonProperty("MondayStartTime")
    public void setMondayStartTime(org.joda.time.DateTime MondayStartTime) {
        this.MondayStartTime = MondayStartTime;
    }

    // MondayEndTime
    private org.joda.time.DateTime MondayEndTime;

    @JsonProperty("MondayEndTime")
    public org.joda.time.DateTime getMondayEndTime() {
        return this.MondayEndTime;
    }

    @JsonProperty("MondayEndTime")
    public void setMondayEndTime(org.joda.time.DateTime MondayEndTime) {
        this.MondayEndTime = MondayEndTime;
    }

    // TuesdayStartTime
    private org.joda.time.DateTime TuesdayStartTime;

    @JsonProperty("TuesdayStartTime")
    public org.joda.time.DateTime getTuesdayStartTime() {
        return this.TuesdayStartTime;
    }

    @JsonProperty("TuesdayStartTime")
    public void setTuesdayStartTime(org.joda.time.DateTime TuesdayStartTime) {
        this.TuesdayStartTime = TuesdayStartTime;
    }

    // TuesdayEndTime
    private org.joda.time.DateTime TuesdayEndTime;

    @JsonProperty("TuesdayEndTime")
    public org.joda.time.DateTime getTuesdayEndTime() {
        return this.TuesdayEndTime;
    }

    @JsonProperty("TuesdayEndTime")
    public void setTuesdayEndTime(org.joda.time.DateTime TuesdayEndTime) {
        this.TuesdayEndTime = TuesdayEndTime;
    }

    // WednesdayStartTime
    private org.joda.time.DateTime WednesdayStartTime;

    @JsonProperty("WednesdayStartTime")
    public org.joda.time.DateTime getWednesdayStartTime() {
        return this.WednesdayStartTime;
    }

    @JsonProperty("WednesdayStartTime")
    public void setWednesdayStartTime(org.joda.time.DateTime WednesdayStartTime) {
        this.WednesdayStartTime = WednesdayStartTime;
    }

    // WednesdayEndTime
    private org.joda.time.DateTime WednesdayEndTime;

    @JsonProperty("WednesdayEndTime")
    public org.joda.time.DateTime getWednesdayEndTime() {
        return this.WednesdayEndTime;
    }

    @JsonProperty("WednesdayEndTime")
    public void setWednesdayEndTime(org.joda.time.DateTime WednesdayEndTime) {
        this.WednesdayEndTime = WednesdayEndTime;
    }

    // ThursdayStartTime
    private org.joda.time.DateTime ThursdayStartTime;

    @JsonProperty("ThursdayStartTime")
    public org.joda.time.DateTime getThursdayStartTime() {
        return this.ThursdayStartTime;
    }

    @JsonProperty("ThursdayStartTime")
    public void setThursdayStartTime(org.joda.time.DateTime ThursdayStartTime) {
        this.ThursdayStartTime = ThursdayStartTime;
    }

    // ThursdayEndTime
    private org.joda.time.DateTime ThursdayEndTime;

    @JsonProperty("ThursdayEndTime")
    public org.joda.time.DateTime getThursdayEndTime() {
        return this.ThursdayEndTime;
    }

    @JsonProperty("ThursdayEndTime")
    public void setThursdayEndTime(org.joda.time.DateTime ThursdayEndTime) {
        this.ThursdayEndTime = ThursdayEndTime;
    }

    // FridayStartTime
    private org.joda.time.DateTime FridayStartTime;

    @JsonProperty("FridayStartTime")
    public org.joda.time.DateTime getFridayStartTime() {
        return this.FridayStartTime;
    }

    @JsonProperty("FridayStartTime")
    public void setFridayStartTime(org.joda.time.DateTime FridayStartTime) {
        this.FridayStartTime = FridayStartTime;
    }

    // FridayEndTime
    private org.joda.time.DateTime FridayEndTime;

    @JsonProperty("FridayEndTime")
    public org.joda.time.DateTime getFridayEndTime() {
        return this.FridayEndTime;
    }

    @JsonProperty("FridayEndTime")
    public void setFridayEndTime(org.joda.time.DateTime FridayEndTime) {
        this.FridayEndTime = FridayEndTime;
    }

    // SaturdayStartTime
    private org.joda.time.DateTime SaturdayStartTime;

    @JsonProperty("SaturdayStartTime")
    public org.joda.time.DateTime getSaturdayStartTime() {
        return this.SaturdayStartTime;
    }

    @JsonProperty("SaturdayStartTime")
    public void setSaturdayStartTime(org.joda.time.DateTime SaturdayStartTime) {
        this.SaturdayStartTime = SaturdayStartTime;
    }

    // SaturdayEndTime
    private org.joda.time.DateTime SaturdayEndTime;

    @JsonProperty("SaturdayEndTime")
    public org.joda.time.DateTime getSaturdayEndTime() {
        return this.SaturdayEndTime;
    }

    @JsonProperty("SaturdayEndTime")
    public void setSaturdayEndTime(org.joda.time.DateTime SaturdayEndTime) {
        this.SaturdayEndTime = SaturdayEndTime;
    }

    // TimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private TimeZoneSidKeyEnum TimeZoneSidKey;

    @JsonProperty("TimeZoneSidKey")
    public TimeZoneSidKeyEnum getTimeZoneSidKey() {
        return this.TimeZoneSidKey;
    }

    @JsonProperty("TimeZoneSidKey")
    public void setTimeZoneSidKey(TimeZoneSidKeyEnum TimeZoneSidKey) {
        this.TimeZoneSidKey = TimeZoneSidKey;
    }

}
