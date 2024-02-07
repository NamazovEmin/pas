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
 * <p>Java class for talonXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="talonXML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="uuID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="doctor" type="{http://www.namazov.ru/pas/talon/controller/soap}doctorXML"/&gt;
 *         &lt;element name="patient" type="{http://www.namazov.ru/pas/talon/controller/soap}patientXML"/&gt;
 *         &lt;element name="startReception" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "talonXML", propOrder = {
    "id",
    "uuID",
    "doctor",
    "patient",
    "startReception"
})
public class TalonXML {

    protected long id;
    @XmlElement(required = true)
    protected String uuID;
    @XmlElement(required = true)
    protected DoctorXML doctor;
    @XmlElement(required = true)
    protected PatientXML patient;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startReception;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the uuID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuID() {
        return uuID;
    }

    /**
     * Sets the value of the uuID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuID(String value) {
        this.uuID = value;
    }

    /**
     * Gets the value of the doctor property.
     * 
     * @return
     *     possible object is
     *     {@link DoctorXML }
     *     
     */
    public DoctorXML getDoctor() {
        return doctor;
    }

    /**
     * Sets the value of the doctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoctorXML }
     *     
     */
    public void setDoctor(DoctorXML value) {
        this.doctor = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link PatientXML }
     *     
     */
    public PatientXML getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientXML }
     *     
     */
    public void setPatient(PatientXML value) {
        this.patient = value;
    }

    /**
     * Gets the value of the startReception property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartReception() {
        return startReception;
    }

    /**
     * Sets the value of the startReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartReception(XMLGregorianCalendar value) {
        this.startReception = value;
    }

}
