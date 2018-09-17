//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.17 at 03:04:42 PM BST 
//


package org.datacite.schema.kernel_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for descriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="descriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abstract"/>
 *     &lt;enumeration value="Methods"/>
 *     &lt;enumeration value="SeriesInformation"/>
 *     &lt;enumeration value="TableOfContents"/>
 *     &lt;enumeration value="TechnicalInfo"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "descriptionType")
@XmlEnum
public enum DescriptionType {

    @XmlEnumValue("Abstract")
    ABSTRACT("Abstract"),
    @XmlEnumValue("Methods")
    METHODS("Methods"),
    @XmlEnumValue("SeriesInformation")
    SERIES_INFORMATION("SeriesInformation"),
    @XmlEnumValue("TableOfContents")
    TABLE_OF_CONTENTS("TableOfContents"),
    @XmlEnumValue("TechnicalInfo")
    TECHNICAL_INFO("TechnicalInfo"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DescriptionType fromValue(String v) {
        for (DescriptionType c: DescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
