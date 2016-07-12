/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Industry
 */
public enum IndustryEnum {

    // Agriculture
    AGRICULTURE("Agriculture"),
    // Apparel
    APPAREL("Apparel"),
    // Banking
    BANKING("Banking"),
    // Biotechnology
    BIOTECHNOLOGY("Biotechnology"),
    // Chemicals
    CHEMICALS("Chemicals"),
    // Communications
    COMMUNICATIONS("Communications"),
    // Construction
    CONSTRUCTION("Construction"),
    // Consulting
    CONSULTING("Consulting"),
    // Education
    EDUCATION("Education"),
    // Electronics
    ELECTRONICS("Electronics"),
    // Energy
    ENERGY("Energy"),
    // Engineering
    ENGINEERING("Engineering"),
    // Entertainment
    ENTERTAINMENT("Entertainment"),
    // Environmental
    ENVIRONMENTAL("Environmental"),
    // Finance
    FINANCE("Finance"),
    // Food & Beverage
    FOOD___BEVERAGE("Food & Beverage"),
    // Government
    GOVERNMENT("Government"),
    // Healthcare
    HEALTHCARE("Healthcare"),
    // Hospitality
    HOSPITALITY("Hospitality"),
    // Insurance
    INSURANCE("Insurance"),
    // Machinery
    MACHINERY("Machinery"),
    // Manufacturing
    MANUFACTURING("Manufacturing"),
    // Media
    MEDIA("Media"),
    // Not For Profit
    NOT_FOR_PROFIT("Not For Profit"),
    // Other
    OTHER("Other"),
    // Recreation
    RECREATION("Recreation"),
    // Retail
    RETAIL("Retail"),
    // Shipping
    SHIPPING("Shipping"),
    // Technology
    TECHNOLOGY("Technology"),
    // Telecommunications
    TELECOMMUNICATIONS("Telecommunications"),
    // Transportation
    TRANSPORTATION("Transportation"),
    // Utilities
    UTILITIES("Utilities");

    final String value;

    private IndustryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static IndustryEnum fromValue(String value) {
        for (IndustryEnum e : IndustryEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
