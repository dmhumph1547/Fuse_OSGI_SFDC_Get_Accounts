/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Campaign
 */
public class QueryRecordsCampaign extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Campaign> records;

    public List<Campaign> getRecords() {
        return records;
    }

    public void setRecords(List<Campaign> records) {
        this.records = records;
    }
}
