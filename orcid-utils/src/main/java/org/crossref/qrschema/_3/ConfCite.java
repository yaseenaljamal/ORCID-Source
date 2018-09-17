//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.17 at 03:19:13 PM BST 
//


package org.crossref.qrschema._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}issn" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}isbn" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}series_title" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}volume_title" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}paper_title" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}contributors" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}volume" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}issue" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}first_page" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}item_number" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}year" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}publication_type"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}edition_number" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}component_number" minOccurs="0"/>
 *         &lt;element ref="{http://www.crossref.org/qrschema/3.0}doi"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fl_count">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issn",
    "isbn",
    "seriesTitle",
    "volumeTitle",
    "paperTitle",
    "contributors",
    "volume",
    "issue",
    "firstPage",
    "itemNumber",
    "year",
    "publicationType",
    "editionNumber",
    "componentNumber",
    "doi"
})
@XmlRootElement(name = "conf_cite")
public class ConfCite {

    protected Issn issn;
    protected Isbn isbn;
    @XmlElement(name = "series_title")
    protected SeriesTitle seriesTitle;
    @XmlElement(name = "volume_title")
    protected VolumeTitle volumeTitle;
    @XmlElement(name = "paper_title")
    protected PaperTitle paperTitle;
    protected Contributors contributors;
    protected Volume volume;
    protected Issue issue;
    @XmlElement(name = "first_page")
    protected FirstPage firstPage;
    @XmlElement(name = "item_number")
    protected ItemNumber itemNumber;
    protected Year year;
    @XmlElement(name = "publication_type", required = true)
    protected PublicationType publicationType;
    @XmlElement(name = "edition_number")
    protected EditionNumber editionNumber;
    @XmlElement(name = "component_number")
    protected ComponentNumber componentNumber;
    @XmlElement(required = true)
    protected Doi doi;
    @XmlAttribute(name = "fl_count")
    protected BigInteger flCount;

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link Issn }
     *     
     */
    public Issn getIssn() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issn }
     *     
     */
    public void setIssn(Issn value) {
        this.issn = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link Isbn }
     *     
     */
    public Isbn getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Isbn }
     *     
     */
    public void setIsbn(Isbn value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the seriesTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesTitle }
     *     
     */
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }

    /**
     * Sets the value of the seriesTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesTitle }
     *     
     */
    public void setSeriesTitle(SeriesTitle value) {
        this.seriesTitle = value;
    }

    /**
     * Gets the value of the volumeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeTitle }
     *     
     */
    public VolumeTitle getVolumeTitle() {
        return volumeTitle;
    }

    /**
     * Sets the value of the volumeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeTitle }
     *     
     */
    public void setVolumeTitle(VolumeTitle value) {
        this.volumeTitle = value;
    }

    /**
     * Gets the value of the paperTitle property.
     * 
     * @return
     *     possible object is
     *     {@link PaperTitle }
     *     
     */
    public PaperTitle getPaperTitle() {
        return paperTitle;
    }

    /**
     * Sets the value of the paperTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperTitle }
     *     
     */
    public void setPaperTitle(PaperTitle value) {
        this.paperTitle = value;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * @return
     *     possible object is
     *     {@link Contributors }
     *     
     */
    public Contributors getContributors() {
        return contributors;
    }

    /**
     * Sets the value of the contributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contributors }
     *     
     */
    public void setContributors(Contributors value) {
        this.contributors = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(Issue value) {
        this.issue = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPage }
     *     
     */
    public FirstPage getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPage }
     *     
     */
    public void setFirstPage(FirstPage value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumber }
     *     
     */
    public ItemNumber getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumber }
     *     
     */
    public void setItemNumber(ItemNumber value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the publicationType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationType }
     *     
     */
    public PublicationType getPublicationType() {
        return publicationType;
    }

    /**
     * Sets the value of the publicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationType }
     *     
     */
    public void setPublicationType(PublicationType value) {
        this.publicationType = value;
    }

    /**
     * Gets the value of the editionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EditionNumber }
     *     
     */
    public EditionNumber getEditionNumber() {
        return editionNumber;
    }

    /**
     * Sets the value of the editionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditionNumber }
     *     
     */
    public void setEditionNumber(EditionNumber value) {
        this.editionNumber = value;
    }

    /**
     * Gets the value of the componentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentNumber }
     *     
     */
    public ComponentNumber getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentNumber }
     *     
     */
    public void setComponentNumber(ComponentNumber value) {
        this.componentNumber = value;
    }

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link Doi }
     *     
     */
    public Doi getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doi }
     *     
     */
    public void setDoi(Doi value) {
        this.doi = value;
    }

    /**
     * Gets the value of the flCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlCount() {
        return flCount;
    }

    /**
     * Sets the value of the flCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlCount(BigInteger value) {
        this.flCount = value;
    }

}
