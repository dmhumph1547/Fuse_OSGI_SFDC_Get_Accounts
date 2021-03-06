/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CallType
 */
public enum CallTypeEnum {

    // Inbound
    INBOUND("Inbound"),
    // Internal
    INTERNAL("Internal"),
    // Outbound
    OUTBOUND("Outbound");

    final String value;

    private CallTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CallTypeEnum fromValue(String value) {
        for (CallTypeEnum e : CallTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
