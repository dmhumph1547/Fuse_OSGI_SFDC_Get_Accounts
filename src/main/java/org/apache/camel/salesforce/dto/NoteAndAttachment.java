/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject NoteAndAttachment
 */
@XStreamAlias("NoteAndAttachment")
public class NoteAndAttachment extends AbstractSObjectBase {

    // IsNote
    private Boolean IsNote;

    @JsonProperty("IsNote")
    public Boolean getIsNote() {
        return this.IsNote;
    }

    @JsonProperty("IsNote")
    public void setIsNote(Boolean IsNote) {
        this.IsNote = IsNote;
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

}
