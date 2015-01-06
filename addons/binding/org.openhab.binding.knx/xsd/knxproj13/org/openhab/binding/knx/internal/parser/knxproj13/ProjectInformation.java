//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 06:54:48 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProjectInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="HistoryEntries" type="{http://knx.org/xml/project/13}HistoryEntries" minOccurs="0"/>
 *         &lt;element name="UserFiles" type="{http://knx.org/xml/project/13}UserFiles" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ProjectStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProjectTracingLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Hide16BitGroupsFromLegacyPlugins" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GroupAddressStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompletionStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUsedPuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodePage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProjectNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProjectPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeviceCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectInformation", propOrder = {

})
public class ProjectInformation {

    @XmlElement(name = "HistoryEntries")
    protected HistoryEntries historyEntries;
    @XmlElement(name = "UserFiles")
    protected UserFiles userFiles;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "ProjectStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectStart;
    @XmlAttribute(name = "ProjectId")
    protected java.lang.String projectId;
    @XmlAttribute(name = "ProjectTracingLevel")
    protected java.lang.String projectTracingLevel;
    @XmlAttribute(name = "Hide16BitGroupsFromLegacyPlugins")
    protected java.lang.String hide16BitGroupsFromLegacyPlugins;
    @XmlAttribute(name = "GroupAddressStyle")
    protected java.lang.String groupAddressStyle;
    @XmlAttribute(name = "CompletionStatus")
    protected java.lang.String completionStatus;
    @XmlAttribute(name = "LastUsedPuid")
    protected java.lang.String lastUsedPuid;
    @XmlAttribute(name = "Guid")
    protected java.lang.String guid;
    @XmlAttribute(name = "CodePage")
    protected java.lang.String codePage;
    @XmlAttribute(name = "ProjectNumber")
    protected java.lang.String projectNumber;
    @XmlAttribute(name = "ContractNumber")
    protected java.lang.String contractNumber;
    @XmlAttribute(name = "ProjectPassword")
    protected java.lang.String projectPassword;
    @XmlAttribute(name = "Comment")
    protected java.lang.String comment;
    @XmlAttribute(name = "DeviceCount")
    protected java.lang.String deviceCount;

    /**
     * Gets the value of the historyEntries property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryEntries }
     *     
     */
    public HistoryEntries getHistoryEntries() {
        return historyEntries;
    }

    /**
     * Sets the value of the historyEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryEntries }
     *     
     */
    public void setHistoryEntries(HistoryEntries value) {
        this.historyEntries = value;
    }

    /**
     * Gets the value of the userFiles property.
     * 
     * @return
     *     possible object is
     *     {@link UserFiles }
     *     
     */
    public UserFiles getUserFiles() {
        return userFiles;
    }

    /**
     * Sets the value of the userFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFiles }
     *     
     */
    public void setUserFiles(UserFiles value) {
        this.userFiles = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the projectStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectStart() {
        return projectStart;
    }

    /**
     * Sets the value of the projectStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectStart(XMLGregorianCalendar value) {
        this.projectStart = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProjectId(java.lang.String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectTracingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProjectTracingLevel() {
        return projectTracingLevel;
    }

    /**
     * Sets the value of the projectTracingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProjectTracingLevel(java.lang.String value) {
        this.projectTracingLevel = value;
    }

    /**
     * Gets the value of the hide16BitGroupsFromLegacyPlugins property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHide16BitGroupsFromLegacyPlugins() {
        return hide16BitGroupsFromLegacyPlugins;
    }

    /**
     * Sets the value of the hide16BitGroupsFromLegacyPlugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHide16BitGroupsFromLegacyPlugins(java.lang.String value) {
        this.hide16BitGroupsFromLegacyPlugins = value;
    }

    /**
     * Gets the value of the groupAddressStyle property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGroupAddressStyle() {
        return groupAddressStyle;
    }

    /**
     * Sets the value of the groupAddressStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGroupAddressStyle(java.lang.String value) {
        this.groupAddressStyle = value;
    }

    /**
     * Gets the value of the completionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCompletionStatus() {
        return completionStatus;
    }

    /**
     * Sets the value of the completionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCompletionStatus(java.lang.String value) {
        this.completionStatus = value;
    }

    /**
     * Gets the value of the lastUsedPuid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLastUsedPuid() {
        return lastUsedPuid;
    }

    /**
     * Sets the value of the lastUsedPuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLastUsedPuid(java.lang.String value) {
        this.lastUsedPuid = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGuid(java.lang.String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the codePage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCodePage() {
        return codePage;
    }

    /**
     * Sets the value of the codePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCodePage(java.lang.String value) {
        this.codePage = value;
    }

    /**
     * Gets the value of the projectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProjectNumber() {
        return projectNumber;
    }

    /**
     * Sets the value of the projectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProjectNumber(java.lang.String value) {
        this.projectNumber = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContractNumber(java.lang.String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the projectPassword property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProjectPassword() {
        return projectPassword;
    }

    /**
     * Sets the value of the projectPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProjectPassword(java.lang.String value) {
        this.projectPassword = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setComment(java.lang.String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the deviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDeviceCount() {
        return deviceCount;
    }

    /**
     * Sets the value of the deviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDeviceCount(java.lang.String value) {
        this.deviceCount = value;
    }

}