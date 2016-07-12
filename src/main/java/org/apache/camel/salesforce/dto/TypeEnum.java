/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
public enum TypeEnum {

    // ActivityEvent
    ACTIVITYEVENT("ActivityEvent"),
    // AdvancedTextPost
    ADVANCEDTEXTPOST("AdvancedTextPost"),
    // AnnouncementPost
    ANNOUNCEMENTPOST("AnnouncementPost"),
    // ApprovalPost
    APPROVALPOST("ApprovalPost"),
    // AttachArticleEvent
    ATTACHARTICLEEVENT("AttachArticleEvent"),
    // BasicTemplateFeedItem
    BASICTEMPLATEFEEDITEM("BasicTemplateFeedItem"),
    // CallLogPost
    CALLLOGPOST("CallLogPost"),
    // CanvasPost
    CANVASPOST("CanvasPost"),
    // CaseCommentPost
    CASECOMMENTPOST("CaseCommentPost"),
    // ChangeStatusPost
    CHANGESTATUSPOST("ChangeStatusPost"),
    // ChatTranscriptPost
    CHATTRANSCRIPTPOST("ChatTranscriptPost"),
    // CollaborationGroupCreated
    COLLABORATIONGROUPCREATED("CollaborationGroupCreated"),
    // CollaborationGroupUnarchived
    COLLABORATIONGROUPUNARCHIVED("CollaborationGroupUnarchived"),
    // ContentPost
    CONTENTPOST("ContentPost"),
    // CreateRecordEvent
    CREATERECORDEVENT("CreateRecordEvent"),
    // DashboardComponentSnapshot
    DASHBOARDCOMPONENTSNAPSHOT("DashboardComponentSnapshot"),
    // EmailMessageEvent
    EMAILMESSAGEEVENT("EmailMessageEvent"),
    // FacebookPost
    FACEBOOKPOST("FacebookPost"),
    // LinkPost
    LINKPOST("LinkPost"),
    // MilestoneEvent
    MILESTONEEVENT("MilestoneEvent"),
    // PollPost
    POLLPOST("PollPost"),
    // ProfileSkillPost
    PROFILESKILLPOST("ProfileSkillPost"),
    // QuestionPost
    QUESTIONPOST("QuestionPost"),
    // ReplyPost
    REPLYPOST("ReplyPost"),
    // RypplePost
    RYPPLEPOST("RypplePost"),
    // SocialPost
    SOCIALPOST("SocialPost"),
    // TextPost
    TEXTPOST("TextPost"),
    // TrackedChange
    TRACKEDCHANGE("TrackedChange"),
    // UserStatus
    USERSTATUS("UserStatus");

    final String value;

    private TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum e : TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
