/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.18 at 02:47:21 PM CET 
//


package de.quamoco.qm.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice>
 *           &lt;element ref="{}personname"/>
 *           &lt;group ref="{}person.ident.mix" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}personblurb"/>
 *           &lt;element ref="{}email"/>
 *           &lt;element ref="{}address"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}author.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "honorificsAndFirstnamesAndSurnames",
    "personname",
    "personblurbsAndEmailsAndAddress"
})
public class Author {

    @XmlElements({
        @XmlElement(name = "surname", type = Surname.class),
        @XmlElement(name = "othername", type = Othername.class),
        @XmlElement(name = "contrib", type = Contrib.class),
        @XmlElement(name = "lineage", type = Lineage.class),
        @XmlElement(name = "honorific", type = Honorific.class),
        @XmlElement(name = "authorblurb", type = Authorblurb.class),
        @XmlElement(name = "firstname", type = Firstname.class),
        @XmlElement(name = "affiliation", type = Affiliation.class)
    })
    protected List<Object> honorificsAndFirstnamesAndSurnames;
    protected Personname personname;
    @XmlElements({
        @XmlElement(name = "email", type = Email.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "personblurb", type = Personblurb.class)
    })
    protected List<Object> personblurbsAndEmailsAndAddress;
    @XmlAttribute(name = "lang")
    @XmlSchemaType(name = "anySimpleType")
    protected String attLang;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String revisionflag;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String vendor;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String condition;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String security;
    @XmlAttribute(name = "conformance")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> conformances;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String wordsize;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String revision;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String arch;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String userlevel;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String xreflabel;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String remap;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String role;

    /**
     * Gets the value of the honorificsAndFirstnamesAndSurnames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the honorificsAndFirstnamesAndSurnames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHonorificsAndFirstnamesAndSurnames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Surname }
     * {@link Othername }
     * {@link Contrib }
     * {@link Lineage }
     * {@link Honorific }
     * {@link Authorblurb }
     * {@link Firstname }
     * {@link Affiliation }
     * 
     * 
     */
    public List<Object> getHonorificsAndFirstnamesAndSurnames() {
        if (honorificsAndFirstnamesAndSurnames == null) {
            honorificsAndFirstnamesAndSurnames = new ArrayList<Object>();
        }
        return this.honorificsAndFirstnamesAndSurnames;
    }

    /**
     * Gets the value of the personname property.
     * 
     * @return
     *     possible object is
     *     {@link Personname }
     *     
     */
    public Personname getPersonname() {
        return personname;
    }

    /**
     * Sets the value of the personname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Personname }
     *     
     */
    public void setPersonname(Personname value) {
        this.personname = value;
    }

    /**
     * Gets the value of the personblurbsAndEmailsAndAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personblurbsAndEmailsAndAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonblurbsAndEmailsAndAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * {@link Address }
     * {@link Personblurb }
     * 
     * 
     */
    public List<Object> getPersonblurbsAndEmailsAndAddress() {
        if (personblurbsAndEmailsAndAddress == null) {
            personblurbsAndEmailsAndAddress = new ArrayList<Object>();
        }
        return this.personblurbsAndEmailsAndAddress;
    }

    /**
     * Gets the value of the attLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttLang() {
        return attLang;
    }

    /**
     * Sets the value of the attLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttLang(String value) {
        this.attLang = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the revisionflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionflag() {
        return revisionflag;
    }

    /**
     * Sets the value of the revisionflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionflag(String value) {
        this.revisionflag = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the conformances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conformances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConformances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConformances() {
        if (conformances == null) {
            conformances = new ArrayList<String>();
        }
        return this.conformances;
    }

    /**
     * Gets the value of the wordsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsize() {
        return wordsize;
    }

    /**
     * Sets the value of the wordsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsize(String value) {
        this.wordsize = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * Gets the value of the userlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlevel() {
        return userlevel;
    }

    /**
     * Sets the value of the userlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlevel(String value) {
        this.userlevel = value;
    }

    /**
     * Gets the value of the xreflabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * Sets the value of the xreflabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * Gets the value of the remap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemap() {
        return remap;
    }

    /**
     * Sets the value of the remap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemap(String value) {
        this.remap = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

}
