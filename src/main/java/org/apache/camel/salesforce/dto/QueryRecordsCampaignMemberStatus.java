/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type CampaignMemberStatus
 */
public class QueryRecordsCampaignMemberStatus extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<CampaignMemberStatus> records;

    public List<CampaignMemberStatus> getRecords() {
        return records;
    }

    public void setRecords(List<CampaignMemberStatus> records) {
        this.records = records;
    }
}
