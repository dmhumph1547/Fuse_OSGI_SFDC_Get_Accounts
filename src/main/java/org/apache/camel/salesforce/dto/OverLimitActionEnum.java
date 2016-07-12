/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OverLimitAction
 */
public enum OverLimitActionEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3");

    final String value;

    private OverLimitActionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OverLimitActionEnum fromValue(String value) {
        for (OverLimitActionEnum e : OverLimitActionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
