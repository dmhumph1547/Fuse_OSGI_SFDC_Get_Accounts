/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotificationFrequency
 */
public enum NotificationFrequencyEnum {

    // D
    D("D"),
    // N
    N("N"),
    // P
    P("P"),
    // W
    W("W");

    final String value;

    private NotificationFrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotificationFrequencyEnum fromValue(String value) {
        for (NotificationFrequencyEnum e : NotificationFrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
