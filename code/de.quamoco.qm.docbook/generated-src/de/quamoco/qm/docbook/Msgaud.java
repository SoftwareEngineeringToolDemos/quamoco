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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;group ref="{}para.char.mix" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{}msgaud.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "msgaud")
public class Msgaud {

    @XmlElementRefs({
        @XmlElementRef(name = "synop.class", type = JAXBElement.class),
        @XmlElementRef(name = "gen.char.class", type = JAXBElement.class),
        @XmlElementRef(name = "ndxterm.class", type = NdxTerm2 .class),
        @XmlElementRef(name = "superscript", type = Superscript.class),
        @XmlElementRef(name = "xref.char.class", type = JAXBElement.class),
        @XmlElementRef(name = "beginpage", type = Beginpage.class),
        @XmlElementRef(name = "subscript", type = Subscript.class),
        @XmlElementRef(name = "link.char.class", type = JAXBElement.class),
        @XmlElementRef(name = "anchor", type = Anchor.class),
        @XmlElementRef(name = "inlineobj.char.class", type = JAXBElement.class),
        @XmlElementRef(name = "remark", type = Remark.class),
        @XmlElementRef(name = "docinfo.char.class", type = JAXBElement.class),
        @XmlElementRef(name = "tech.char.class", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
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

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Acronym }{@code >}
     * {@link JAXBElement }{@code <}{@link Corpauthor }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Token }{@code >}
     * {@link JAXBElement }{@code <}{@link Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Trademark }{@code >}
     * {@link JAXBElement }{@code <}{@link Keycode }{@code >}
     * {@link JAXBElement }{@code <}{@link Biblioref }{@code >}
     * {@link JAXBElement }{@code <}{@link Citetitle }{@code >}
     * {@link JAXBElement }{@code <}{@link Code }{@code >}
     * {@link JAXBElement }{@code <}{@link Personname }{@code >}
     * {@link JAXBElement }{@code <}{@link Command }{@code >}
     * {@link JAXBElement }{@code <}{@link Link }{@code >}
     * {@link JAXBElement }{@code <}{@link Exceptionname }{@code >}
     * {@link JAXBElement }{@code <}{@link Errortext }{@code >}
     * {@link JAXBElement }{@code <}{@link Firstterm }{@code >}
     * {@link JAXBElement }{@code <}{@link Xref }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Productname }{@code >}
     * {@link JAXBElement }{@code <}{@link Database }{@code >}
     * {@link JAXBElement }{@code <}{@link Methodname }{@code >}
     * {@link JAXBElement }{@code <}{@link Envar }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Ooclass }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlineequation }{@code >}
     * {@link JAXBElement }{@code <}{@link Authorinitials }{@code >}
     * {@link JAXBElement }{@code <}{@link Hardware }{@code >}
     * {@link JAXBElement }{@code <}{@link Guilabel }{@code >}
     * {@link JAXBElement }{@code <}{@link Interfacename }{@code >}
     * {@link JAXBElement }{@code <}{@link Destructorsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Symbol }{@code >}
     * {@link NdxTerm2 }
     * {@link JAXBElement }{@code <}{@link Glossterm }{@code >}
     * {@link JAXBElement }{@code <}{@link Computeroutput }{@code >}
     * {@link JAXBElement }{@code <}{@link Filename }{@code >}
     * {@link JAXBElement }{@code <}{@link Parameter }{@code >}
     * {@link JAXBElement }{@code <}{@link Returnvalue }{@code >}
     * {@link JAXBElement }{@code <}{@link Modespec }{@code >}
     * {@link JAXBElement }{@code <}{@link Interface }{@code >}
     * {@link JAXBElement }{@code <}{@link Guiicon }{@code >}
     * {@link JAXBElement }{@code <}{@link Varname }{@code >}
     * {@link JAXBElement }{@code <}{@link Keysym }{@code >}
     * {@link JAXBElement }{@code <}{@link Uri }{@code >}
     * {@link JAXBElement }{@code <}{@link Literal }{@code >}
     * {@link JAXBElement }{@code <}{@link Function }{@code >}
     * {@link JAXBElement }{@code <}{@link Author }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinegraphic }{@code >}
     * {@link JAXBElement }{@code <}{@link Structname }{@code >}
     * {@link JAXBElement }{@code <}{@link Corpcredit }{@code >}
     * {@link JAXBElement }{@code <}{@link Userinput }{@code >}
     * {@link JAXBElement }{@code <}{@link Synopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Option }{@code >}
     * {@link JAXBElement }{@code <}{@link Othercredit }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Errortype }{@code >}
     * {@link JAXBElement }{@code <}{@link Classname }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Superscript }
     * {@link JAXBElement }{@code <}{@link Foreignphrase }{@code >}
     * {@link JAXBElement }{@code <}{@link Property }{@code >}
     * {@link JAXBElement }{@code <}{@link Sgmltag }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbrev }{@code >}
     * {@link JAXBElement }{@code <}{@link Structfield }{@code >}
     * {@link JAXBElement }{@code <}{@link Markup }{@code >}
     * {@link JAXBElement }{@code <}{@link Optional }{@code >}
     * {@link JAXBElement }{@code <}{@link Classsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Footnote }{@code >}
     * {@link JAXBElement }{@code <}{@link Methodsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Fieldsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Funcsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Keycombo }{@code >}
     * {@link JAXBElement }{@code <}{@link Olink }{@code >}
     * {@link String }
     * {@link Subscript }
     * {@link JAXBElement }{@code <}{@link Wordasword }{@code >}
     * {@link JAXBElement }{@code <}{@link Action }{@code >}
     * {@link JAXBElement }{@code <}{@link NdxTerm2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Citation }{@code >}
     * {@link JAXBElement }{@code <}{@link Menuchoice }{@code >}
     * {@link JAXBElement }{@code <}{@link Guimenu }{@code >}
     * {@link JAXBElement }{@code <}{@link Oointerface }{@code >}
     * {@link JAXBElement }{@code <}{@link Email }{@code >}
     * {@link JAXBElement }{@code <}{@link Ulink }{@code >}
     * {@link JAXBElement }{@code <}{@link Emphasis }{@code >}
     * {@link JAXBElement }{@code <}{@link Guibutton }{@code >}
     * {@link JAXBElement }{@code <}{@link Orgname }{@code >}
     * {@link JAXBElement }{@code <}{@link Cmdsynopsis }{@code >}
     * {@link Beginpage }
     * {@link JAXBElement }{@code <}{@link Inlinemediaobject }{@code >}
     * {@link JAXBElement }{@code <}{@link Phrase }{@code >}
     * {@link JAXBElement }{@code <}{@link Constant }{@code >}
     * {@link JAXBElement }{@code <}{@link Ooexception }{@code >}
     * {@link JAXBElement }{@code <}{@link Keycap }{@code >}
     * {@link JAXBElement }{@code <}{@link Citerefentry }{@code >}
     * {@link JAXBElement }{@code <}{@link Medialabel }{@code >}
     * {@link JAXBElement }{@code <}{@link Constructorsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Systemitem }{@code >}
     * {@link JAXBElement }{@code <}{@link Application }{@code >}
     * {@link JAXBElement }{@code <}{@link Package }{@code >}
     * {@link JAXBElement }{@code <}{@link Mousebutton }{@code >}
     * {@link JAXBElement }{@code <}{@link Errorname }{@code >}
     * {@link JAXBElement }{@code <}{@link Prompt }{@code >}
     * {@link JAXBElement }{@code <}{@link Productnumber }{@code >}
     * {@link JAXBElement }{@code <}{@link Revhistory }{@code >}
     * {@link Anchor }
     * {@link JAXBElement }{@code <}{@link Quote }{@code >}
     * {@link JAXBElement }{@code <}{@link Guisubmenu }{@code >}
     * {@link Remark }
     * {@link JAXBElement }{@code <}{@link Errorcode }{@code >}
     * {@link JAXBElement }{@code <}{@link Footnoteref }{@code >}
     * {@link JAXBElement }{@code <}{@link Guimenuitem }{@code >}
     * {@link JAXBElement }{@code <}{@link Replaceable }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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

}
