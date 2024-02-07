//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.07 at 01:13:09 PM MSK 
//


package ru.namazov.pas.talon.controller.soap;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleXML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleStart" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="scheduleEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="doctorID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dayStart" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="dayEnd" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="slotsCountPerDay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="slotsTimeDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleXML", propOrder = {
    "scheduleStart",
    "scheduleEnd",
    "doctorID",
    "dayStart",
    "dayEnd",
    "slotsCountPerDay",
    "slotsTimeDuration"
})
public class ScheduleXML {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleEnd;
    protected long doctorID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dayStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dayEnd;
    protected int slotsCountPerDay;
    protected int slotsTimeDuration;

    /**
     * Gets the value of the scheduleStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStart() {
        return scheduleStart;
    }

    /**
     * Sets the value of the scheduleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStart(XMLGregorianCalendar value) {
        this.scheduleStart = value;
    }

    /**
     * Gets the value of the scheduleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEnd() {
        return scheduleEnd;
    }

    /**
     * Sets the value of the scheduleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleEnd(XMLGregorianCalendar value) {
        this.scheduleEnd = value;
    }

    /**
     * Gets the value of the doctorID property.
     * 
     */
    public long getDoctorID() {
        return doctorID;
    }

    /**
     * Sets the value of the doctorID property.
     * 
     */
    public void setDoctorID(long value) {
        this.doctorID = value;
    }

    /**
     * Gets the value of the dayStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayStart() {
        return dayStart;
    }

    /**
     * Sets the value of the dayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayStart(XMLGregorianCalendar value) {
        this.dayStart = value;
    }

    /**
     * Gets the value of the dayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayEnd() {
        return dayEnd;
    }

    /**
     * Sets the value of the dayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayEnd(XMLGregorianCalendar value) {
        this.dayEnd = value;
    }

    /**
     * Gets the value of the slotsCountPerDay property.
     * 
     */
    public int getSlotsCountPerDay() {
        return slotsCountPerDay;
    }

    /**
     * Sets the value of the slotsCountPerDay property.
     * 
     */
    public void setSlotsCountPerDay(int value) {
        this.slotsCountPerDay = value;
    }

    /**
     * Gets the value of the slotsTimeDuration property.
     * 
     */
    public int getSlotsTimeDuration() {
        return slotsTimeDuration;
    }

    /**
     * Sets the value of the slotsTimeDuration property.
     * 
     */
    public void setSlotsTimeDuration(int value) {
        this.slotsTimeDuration = value;
    }

}