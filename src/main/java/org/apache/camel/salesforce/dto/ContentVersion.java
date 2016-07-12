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
 * Salesforce DTO for SObject ContentVersion
 */
@XStreamAlias("ContentVersion")
public class ContentVersion extends AbstractSObjectBase {

    // ContentDocumentId
    private String ContentDocumentId;

    @JsonProperty("ContentDocumentId")
    public String getContentDocumentId() {
        return this.ContentDocumentId;
    }

    @JsonProperty("ContentDocumentId")
    public void setContentDocumentId(String ContentDocumentId) {
        this.ContentDocumentId = ContentDocumentId;
    }

    // IsLatest
    private Boolean IsLatest;

    @JsonProperty("IsLatest")
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    @JsonProperty("IsLatest")
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    // ContentUrl
    private String ContentUrl;

    @JsonProperty("ContentUrl")
    public String getContentUrl() {
        return this.ContentUrl;
    }

    @JsonProperty("ContentUrl")
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    // VersionNumber
    private String VersionNumber;

    @JsonProperty("VersionNumber")
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    @JsonProperty("VersionNumber")
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
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

    // ReasonForChange
    private String ReasonForChange;

    @JsonProperty("ReasonForChange")
    public String getReasonForChange() {
        return this.ReasonForChange;
    }

    @JsonProperty("ReasonForChange")
    public void setReasonForChange(String ReasonForChange) {
        this.ReasonForChange = ReasonForChange;
    }

    // PathOnClient
    private String PathOnClient;

    @JsonProperty("PathOnClient")
    public String getPathOnClient() {
        return this.PathOnClient;
    }

    @JsonProperty("PathOnClient")
    public void setPathOnClient(String PathOnClient) {
        this.PathOnClient = PathOnClient;
    }

    // RatingCount
    private Integer RatingCount;

    @JsonProperty("RatingCount")
    public Integer getRatingCount() {
        return this.RatingCount;
    }

    @JsonProperty("RatingCount")
    public void setRatingCount(Integer RatingCount) {
        this.RatingCount = RatingCount;
    }

    // ContentModifiedDate
    private org.joda.time.DateTime ContentModifiedDate;

    @JsonProperty("ContentModifiedDate")
    public org.joda.time.DateTime getContentModifiedDate() {
        return this.ContentModifiedDate;
    }

    @JsonProperty("ContentModifiedDate")
    public void setContentModifiedDate(org.joda.time.DateTime ContentModifiedDate) {
        this.ContentModifiedDate = ContentModifiedDate;
    }

    // ContentModifiedById
    private String ContentModifiedById;

    @JsonProperty("ContentModifiedById")
    public String getContentModifiedById() {
        return this.ContentModifiedById;
    }

    @JsonProperty("ContentModifiedById")
    public void setContentModifiedById(String ContentModifiedById) {
        this.ContentModifiedById = ContentModifiedById;
    }

    // PositiveRatingCount
    private Integer PositiveRatingCount;

    @JsonProperty("PositiveRatingCount")
    public Integer getPositiveRatingCount() {
        return this.PositiveRatingCount;
    }

    @JsonProperty("PositiveRatingCount")
    public void setPositiveRatingCount(Integer PositiveRatingCount) {
        this.PositiveRatingCount = PositiveRatingCount;
    }

    // NegativeRatingCount
    private Integer NegativeRatingCount;

    @JsonProperty("NegativeRatingCount")
    public Integer getNegativeRatingCount() {
        return this.NegativeRatingCount;
    }

    @JsonProperty("NegativeRatingCount")
    public void setNegativeRatingCount(Integer NegativeRatingCount) {
        this.NegativeRatingCount = NegativeRatingCount;
    }

    // FeaturedContentBoost
    private Integer FeaturedContentBoost;

    @JsonProperty("FeaturedContentBoost")
    public Integer getFeaturedContentBoost() {
        return this.FeaturedContentBoost;
    }

    @JsonProperty("FeaturedContentBoost")
    public void setFeaturedContentBoost(Integer FeaturedContentBoost) {
        this.FeaturedContentBoost = FeaturedContentBoost;
    }

    // FeaturedContentDate
    private org.joda.time.DateTime FeaturedContentDate;

    @JsonProperty("FeaturedContentDate")
    public org.joda.time.DateTime getFeaturedContentDate() {
        return this.FeaturedContentDate;
    }

    @JsonProperty("FeaturedContentDate")
    public void setFeaturedContentDate(org.joda.time.DateTime FeaturedContentDate) {
        this.FeaturedContentDate = FeaturedContentDate;
    }

    // TagCsv
    private String TagCsv;

    @JsonProperty("TagCsv")
    public String getTagCsv() {
        return this.TagCsv;
    }

    @JsonProperty("TagCsv")
    public void setTagCsv(String TagCsv) {
        this.TagCsv = TagCsv;
    }

    // FileType
    private String FileType;

    @JsonProperty("FileType")
    public String getFileType() {
        return this.FileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    // PublishStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private PublishStatusEnum PublishStatus;

    @JsonProperty("PublishStatus")
    public PublishStatusEnum getPublishStatus() {
        return this.PublishStatus;
    }

    @JsonProperty("PublishStatus")
    public void setPublishStatus(PublishStatusEnum PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    // VersionData
    // blob field url, use getBlobField to get the content
    @XStreamAlias("VersionData")
    private String VersionDataUrl;

    @JsonProperty("VersionData")
    public String getVersionDataUrl() {
        return this.VersionDataUrl;
    }

    @JsonProperty("VersionData")
    public void setVersionDataUrl(String VersionDataUrl) {
        this.VersionDataUrl = VersionDataUrl;
    }

    // ContentSize
    private Integer ContentSize;

    @JsonProperty("ContentSize")
    public Integer getContentSize() {
        return this.ContentSize;
    }

    @JsonProperty("ContentSize")
    public void setContentSize(Integer ContentSize) {
        this.ContentSize = ContentSize;
    }

    // FileExtension
    private String FileExtension;

    @JsonProperty("FileExtension")
    public String getFileExtension() {
        return this.FileExtension;
    }

    @JsonProperty("FileExtension")
    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    // FirstPublishLocationId
    private String FirstPublishLocationId;

    @JsonProperty("FirstPublishLocationId")
    public String getFirstPublishLocationId() {
        return this.FirstPublishLocationId;
    }

    @JsonProperty("FirstPublishLocationId")
    public void setFirstPublishLocationId(String FirstPublishLocationId) {
        this.FirstPublishLocationId = FirstPublishLocationId;
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

    // ContentLocation
    @XStreamConverter(PicklistEnumConverter.class)
    private ContentLocationEnum ContentLocation;

    @JsonProperty("ContentLocation")
    public ContentLocationEnum getContentLocation() {
        return this.ContentLocation;
    }

    @JsonProperty("ContentLocation")
    public void setContentLocation(ContentLocationEnum ContentLocation) {
        this.ContentLocation = ContentLocation;
    }

    // ExternalDocumentInfo1
    private String ExternalDocumentInfo1;

    @JsonProperty("ExternalDocumentInfo1")
    public String getExternalDocumentInfo1() {
        return this.ExternalDocumentInfo1;
    }

    @JsonProperty("ExternalDocumentInfo1")
    public void setExternalDocumentInfo1(String ExternalDocumentInfo1) {
        this.ExternalDocumentInfo1 = ExternalDocumentInfo1;
    }

    // ExternalDocumentInfo2
    private String ExternalDocumentInfo2;

    @JsonProperty("ExternalDocumentInfo2")
    public String getExternalDocumentInfo2() {
        return this.ExternalDocumentInfo2;
    }

    @JsonProperty("ExternalDocumentInfo2")
    public void setExternalDocumentInfo2(String ExternalDocumentInfo2) {
        this.ExternalDocumentInfo2 = ExternalDocumentInfo2;
    }

    // ExternalDataSourceId
    private String ExternalDataSourceId;

    @JsonProperty("ExternalDataSourceId")
    public String getExternalDataSourceId() {
        return this.ExternalDataSourceId;
    }

    @JsonProperty("ExternalDataSourceId")
    public void setExternalDataSourceId(String ExternalDataSourceId) {
        this.ExternalDataSourceId = ExternalDataSourceId;
    }

    // Checksum
    private String Checksum;

    @JsonProperty("Checksum")
    public String getChecksum() {
        return this.Checksum;
    }

    @JsonProperty("Checksum")
    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    // IsMajorVersion
    private Boolean IsMajorVersion;

    @JsonProperty("IsMajorVersion")
    public Boolean getIsMajorVersion() {
        return this.IsMajorVersion;
    }

    @JsonProperty("IsMajorVersion")
    public void setIsMajorVersion(Boolean IsMajorVersion) {
        this.IsMajorVersion = IsMajorVersion;
    }

}
