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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tbl.table.mdl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tbl.table.mdl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}blockinfo" minOccurs="0"/>
 *           &lt;group ref="{}formalobject.title.content"/>
 *           &lt;element ref="{}ndxterm.class" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}textobject" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element ref="{}graphic" maxOccurs="unbounded"/>
 *             &lt;element ref="{}mediaobject" maxOccurs="unbounded"/>
 *             &lt;element ref="{}tgroup" maxOccurs="unbounded"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}caption"/>
 *           &lt;choice>
 *             &lt;element ref="{}col" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{}colgroup" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/choice>
 *           &lt;element ref="{}thead" minOccurs="0"/>
 *           &lt;element ref="{}tfoot" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element ref="{}tbody" maxOccurs="unbounded"/>
 *             &lt;element ref="{}tr" maxOccurs="unbounded"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tbl.table.mdl", propOrder = {
    "caption",
    "colgroups",
    "cols",
    "thead",
    "tfoot",
    "trs",
    "tbodies",
    "blockinfo",
    "attTitle",
    "titleabbrev",
    "ndxtermClass",
    "textobjects",
    "tgroups",
    "mediaobjects",
    "graphics"
})
@XmlSeeAlso({
    Table.class
})
public class TblTableMdl {

    protected Caption caption;
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
    protected Blockinfo blockinfo;
    @XmlElement(name = "title")
    protected Title attTitle;
    protected Titleabbrev titleabbrev;
    @XmlElementRef(name = "ndxterm.class", type = NdxTerm2 .class)
    protected List<JAXBElement<NdxTerm2Type>> ndxtermClass;
    @XmlElement(name = "textobject")
    protected List<Textobject> textobjects;
    @XmlElement(name = "tgroup")
    protected List<Tgroup> tgroups;
    @XmlElement(name = "mediaobject")
    protected List<Mediaobject> mediaobjects;
    @XmlElement(name = "graphic")
    protected List<Graphic> graphics;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
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
     * Gets the value of the ndxtermClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndxtermClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdxtermClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NdxTerm2Type }{@code >}
     * {@link NdxTerm2 }
     * 
     * 
     */
    public List<JAXBElement<NdxTerm2Type>> getNdxtermClass() {
        if (ndxtermClass == null) {
            ndxtermClass = new ArrayList<JAXBElement<NdxTerm2Type>>();
        }
        return this.ndxtermClass;
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

}
