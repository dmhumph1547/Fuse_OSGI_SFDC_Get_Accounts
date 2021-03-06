/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ActivityType
 */
public enum ActivityTypeEnum {

    // Call
    CALL("Call"),
    // Email
    EMAIL("Email"),
    // Meeting
    MEETING("Meeting"),
    // Other
    OTHER("Other");

    final String value;

    private ActivityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActivityTypeEnum fromValue(String value) {
        for (ActivityTypeEnum e : ActivityTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
