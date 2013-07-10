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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;sequence>
 *         &lt;element ref="{}blockinfo" minOccurs="0"/>
 *         &lt;group ref="{}formalobject.title.content" minOccurs="0"/>
 *         &lt;group ref="{}component.mix" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}tasksummary.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "blockinfo",
    "attTitle",
    "titleabbrev",
    "listClassAndAdmonClassAndLinespecificClass"
})
@XmlRootElement(name = "tasksummary")
public class Tasksummary {

    protected Blockinfo blockinfo;
    @XmlElement(name = "title")
    protected Title attTitle;
    protected Titleabbrev titleabbrev;
    @XmlElementRefs({
        @XmlElementRef(name = "synop.class", type = JAXBElement.class),
        @XmlElementRef(name = "ndxterm.class", type = NdxTerm2 .class),
        @XmlElementRef(name = "list.class", type = JAXBElement.class),
        @XmlElementRef(name = "informal.class", type = JAXBElement.class),
        @XmlElementRef(name = "beginpage", type = Beginpage.class),
        @XmlElementRef(name = "formal.class", type = JAXBElement.class),
        @XmlElementRef(name = "abstract", type = Abstract.class),
        @XmlElementRef(name = "compound.class", type = JAXBElement.class),
        @XmlElementRef(name = "admon.class", type = JAXBElement.class),
        @XmlElementRef(name = "highlights", type = Highlights.class),
        @XmlElementRef(name = "epigraph", type = Epigraph.class),
        @XmlElementRef(name = "bridgehead", type = Bridgehead.class),
        @XmlElementRef(name = "anchor", type = Anchor.class),
        @XmlElementRef(name = "linespecific.class", type = JAXBElement.class),
        @XmlElementRef(name = "para.class", type = JAXBElement.class),
        @XmlElementRef(name = "remark", type = Remark.class),
        @XmlElementRef(name = "authorblurb", type = Authorblurb.class)
    })
    protected List<Object> listClassAndAdmonClassAndLinespecificClass;
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
     * Gets the value of the blockinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Blockinfo }
     *     
     */
    public Blockinfo getBlockinfo() {
        return blockinfo;
    }

    /**
     * Sets the value of the blockinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blockinfo }
     *     
     */
    public void setBlockinfo(Blockinfo value) {
        this.blockinfo = value;
    }

    /**
     * Gets the value of the attTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getAttTitle() {
        return attTitle;
    }

    /**
     * Sets the value of the attTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setAttTitle(Title value) {
        this.attTitle = value;
    }

    /**
     * Gets the value of the titleabbrev property.
     * 
     * @return
     *     possible object is
     *     {@link Titleabbrev }
     *     
     */
    public Titleabbrev getTitleabbrev() {
        return titleabbrev;
    }

    /**
     * Sets the value of the titleabbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titleabbrev }
     *     
     */
    public void setTitleabbrev(Titleabbrev value) {
        this.titleabbrev = value;
    }

    /**
     * Gets the value of the listClassAndAdmonClassAndLinespecificClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listClassAndAdmonClassAndLinespecificClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListClassAndAdmonClassAndLinespecificClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Mediaobjectco }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Informalequation }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Para }{@code >}
     * {@link JAXBElement }{@code <}{@link Qandaset }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Graphicco }{@code >}
     * {@link JAXBElement }{@code <}{@link Graphic }{@code >}
     * {@link JAXBElement }{@code <}{@link Classsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Warning }{@code >}
     * {@link JAXBElement }{@code <}{@link Msgset }{@code >}
     * {@link JAXBElement }{@code <}{@link Informaltable }{@code >}
     * {@link JAXBElement }{@code <}{@link Procedure }{@code >}
     * {@link JAXBElement }{@code <}{@link Methodsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Fieldsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Figure }{@code >}
     * {@link JAXBElement }{@code <}{@link Funcsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Variablelist }{@code >}
     * {@link JAXBElement }{@code <}{@link Note }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Abstract }
     * {@link JAXBElement }{@code <}{@link Simplelist }{@code >}
     * {@link JAXBElement }{@code <}{@link Important }{@code >}
     * {@link JAXBElement }{@code <}{@link NdxTerm2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Glosslist }{@code >}
     * {@link Bridgehead }
     * {@link JAXBElement }{@code <}{@link Blockquote }{@code >}
     * {@link JAXBElement }{@code <}{@link Screen }{@code >}
     * {@link Authorblurb }
     * {@link JAXBElement }{@code <}{@link Equation }{@code >}
     * {@link JAXBElement }{@code <}{@link Destructorsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Itemizedlist }{@code >}
     * {@link NdxTerm2 }
     * {@link JAXBElement }{@code <}{@link Cmdsynopsis }{@code >}
     * {@link Beginpage }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Tip }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link Programlisting }{@code >}
     * {@link JAXBElement }{@code <}{@link Screenco }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Constructorsynopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Calloutlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Task }{@code >}
     * {@link JAXBElement }{@code <}{@link Programlistingco }{@code >}
     * {@link JAXBElement }{@code <}{@link Screenshot }{@code >}
     * {@link JAXBElement }{@code <}{@link Formalpara }{@code >}
     * {@link JAXBElement }{@code <}{@link Mediaobject }{@code >}
     * {@link JAXBElement }{@code <}{@link Literallayout }{@code >}
     * {@link JAXBElement }{@code <}{@link Caution }{@code >}
     * {@link JAXBElement }{@code <}{@link Table }{@code >}
     * {@link JAXBElement }{@code <}{@link Informalexample }{@code >}
     * {@link Highlights }
     * {@link Epigraph }
     * {@link JAXBElement }{@code <}{@link Sidebar }{@code >}
     * {@link JAXBElement }{@code <}{@link Bibliolist }{@code >}
     * {@link Anchor }
     * {@link JAXBElement }{@code <}{@link Example }{@code >}
     * {@link Remark }
     * {@link JAXBElement }{@code <}{@link Synopsis }{@code >}
     * {@link JAXBElement }{@code <}{@link Orderedlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Segmentedlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Simpara }{@code >}
     * {@link JAXBElement }{@code <}{@link Informalfigure }{@code >}
     * 
     * 
     */
    public List<Object> getListClassAndAdmonClassAndLinespecificClass() {
        if (listClassAndAdmonClassAndLinespecificClass == null) {
            listClassAndAdmonClassAndLinespecificClass = new ArrayList<Object>();
        }
        return this.listClassAndAdmonClassAndLinespecificClass;
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
