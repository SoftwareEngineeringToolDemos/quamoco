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
 *         &lt;element ref="{}blockinfo" minOccurs="0"/>
 *         &lt;group ref="{}informal.tbl.table.mdl"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}informaltable.attlist"/>
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
    "colgroups",
    "cols",
    "thead",
    "tfoot",
    "trs",
    "tbodies",
    "textobjects",
    "tgroups",
    "mediaobjects",
    "graphics"
})
public class Informaltable {

    protected Blockinfo blockinfo;
    @XmlElement(name = "colgroup")
    protected List<Colgroup> colgroups;
    @XmlElement(name = "col")
    protected List<Col> cols;
    protected Thead thead;
    protected Tfoot tfoot;
    @XmlElement(name = "tr")
    protected List<Tr> trs;
    @XmlElement(name = "tbody")
    protected List<Tbody> tbodies;
    @XmlElement(name = "textobject")
    protected List<Textobject> textobjects;
    @XmlElement(name = "tgroup")
    protected List<Tgroup> tgroups;
    @XmlElement(name = "mediaobject")
    protected List<Mediaobject> mediaobjects;
    @XmlElement(name = "graphic")
    protected List<Graphic> graphics;
    @XmlAttribute
    protected TblFrameAttval frame;
    @XmlAttribute
    protected String colsep;
    @XmlAttribute
    protected String rowsep;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String tabstyle;
    @XmlAttribute
    protected String tocentry;
    @XmlAttribute
    protected String shortentry;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orient;
    @XmlAttribute
    protected String pgwide;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String summary;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String width;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String border;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String rules;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String cellspacing;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String cellpadding;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String bgcolor;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;
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
    protected String onclick;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ondblclick;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousedown;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseup;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseover;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousemove;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseout;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeypress;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeydown;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeyup;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String floatstyle;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rowheader;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String label;

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
     * Gets the value of the colgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colgroup }
     * 
     * 
     */
    public List<Colgroup> getColgroups() {
        if (colgroups == null) {
            colgroups = new ArrayList<Colgroup>();
        }
        return this.colgroups;
    }

    /**
     * Gets the value of the cols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Col }
     * 
     * 
     */
    public List<Col> getCols() {
        if (cols == null) {
            cols = new ArrayList<Col>();
        }
        return this.cols;
    }

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    public Thead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    public void setThead(Thead value) {
        this.thead = value;
    }

    /**
     * Gets the value of the tfoot property.
     * 
     * @return
     *     possible object is
     *     {@link Tfoot }
     *     
     */
    public Tfoot getTfoot() {
        return tfoot;
    }

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfoot }
     *     
     */
    public void setTfoot(Tfoot value) {
        this.tfoot = value;
    }

    /**
     * Gets the value of the trs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tr }
     * 
     * 
     */
    public List<Tr> getTrs() {
        if (trs == null) {
            trs = new ArrayList<Tr>();
        }
        return this.trs;
    }

    /**
     * Gets the value of the tbodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tbody }
     * 
     * 
     */
    public List<Tbody> getTbodies() {
        if (tbodies == null) {
            tbodies = new ArrayList<Tbody>();
        }
        return this.tbodies;
    }

    /**
     * Gets the value of the textobjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textobjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextobjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Textobject }
     * 
     * 
     */
    public List<Textobject> getTextobjects() {
        if (textobjects == null) {
            textobjects = new ArrayList<Textobject>();
        }
        return this.textobjects;
    }

    /**
     * Gets the value of the tgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tgroup }
     * 
     * 
     */
    public List<Tgroup> getTgroups() {
        if (tgroups == null) {
            tgroups = new ArrayList<Tgroup>();
        }
        return this.tgroups;
    }

    /**
     * Gets the value of the mediaobjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaobjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaobjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mediaobject }
     * 
     * 
     */
    public List<Mediaobject> getMediaobjects() {
        if (mediaobjects == null) {
            mediaobjects = new ArrayList<Mediaobject>();
        }
        return this.mediaobjects;
    }

    /**
     * Gets the value of the graphics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Graphic }
     * 
     * 
     */
    public List<Graphic> getGraphics() {
        if (graphics == null) {
            graphics = new ArrayList<Graphic>();
        }
        return this.graphics;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link TblFrameAttval }
     *     
     */
    public TblFrameAttval getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TblFrameAttval }
     *     
     */
    public void setFrame(TblFrameAttval value) {
        this.frame = value;
    }

    /**
     * Gets the value of the colsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsep() {
        return colsep;
    }

    /**
     * Sets the value of the colsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsep(String value) {
        this.colsep = value;
    }

    /**
     * Gets the value of the rowsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsep() {
        return rowsep;
    }

    /**
     * Sets the value of the rowsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsep(String value) {
        this.rowsep = value;
    }

    /**
     * Gets the value of the tabstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabstyle() {
        return tabstyle;
    }

    /**
     * Sets the value of the tabstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabstyle(String value) {
        this.tabstyle = value;
    }

    /**
     * Gets the value of the tocentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocentry() {
        return tocentry;
    }

    /**
     * Sets the value of the tocentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocentry(String value) {
        this.tocentry = value;
    }

    /**
     * Gets the value of the shortentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortentry() {
        return shortentry;
    }

    /**
     * Sets the value of the shortentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortentry(String value) {
        this.shortentry = value;
    }

    /**
     * Gets the value of the orient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrient() {
        return orient;
    }

    /**
     * Sets the value of the orient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrient(String value) {
        this.orient = value;
    }

    /**
     * Gets the value of the pgwide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgwide() {
        return pgwide;
    }

    /**
     * Sets the value of the pgwide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgwide(String value) {
        this.pgwide = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRules(String value) {
        this.rules = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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
     * Gets the value of the onclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * Sets the value of the onclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnclick(String value) {
        this.onclick = value;
    }

    /**
     * Gets the value of the ondblclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndblclick() {
        return ondblclick;
    }

    /**
     * Sets the value of the ondblclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndblclick(String value) {
        this.ondblclick = value;
    }

    /**
     * Gets the value of the onmousedown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousedown() {
        return onmousedown;
    }

    /**
     * Sets the value of the onmousedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousedown(String value) {
        this.onmousedown = value;
    }

    /**
     * Gets the value of the onmouseup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseup() {
        return onmouseup;
    }

    /**
     * Sets the value of the onmouseup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseup(String value) {
        this.onmouseup = value;
    }

    /**
     * Gets the value of the onmouseover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseover() {
        return onmouseover;
    }

    /**
     * Sets the value of the onmouseover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseover(String value) {
        this.onmouseover = value;
    }

    /**
     * Gets the value of the onmousemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousemove() {
        return onmousemove;
    }

    /**
     * Sets the value of the onmousemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousemove(String value) {
        this.onmousemove = value;
    }

    /**
     * Gets the value of the onmouseout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseout() {
        return onmouseout;
    }

    /**
     * Sets the value of the onmouseout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseout(String value) {
        this.onmouseout = value;
    }

    /**
     * Gets the value of the onkeypress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeypress() {
        return onkeypress;
    }

    /**
     * Sets the value of the onkeypress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeypress(String value) {
        this.onkeypress = value;
    }

    /**
     * Gets the value of the onkeydown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeydown() {
        return onkeydown;
    }

    /**
     * Sets the value of the onkeydown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeydown(String value) {
        this.onkeydown = value;
    }

    /**
     * Gets the value of the onkeyup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeyup() {
        return onkeyup;
    }

    /**
     * Sets the value of the onkeyup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeyup(String value) {
        this.onkeyup = value;
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
     * Gets the value of the floatstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatstyle() {
        return floatstyle;
    }

    /**
     * Sets the value of the floatstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatstyle(String value) {
        this.floatstyle = value;
    }

    /**
     * Gets the value of the rowheader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowheader() {
        return rowheader;
    }

    /**
     * Sets the value of the rowheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowheader(String value) {
        this.rowheader = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
