/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.util.Date;

/**
 *
 * @author ghada
 */
public class Consultation {
    private String dateConsultation ;
    private String heure ;
    private String lieu;
    private String etatconsult ;

    public Consultation() {
    }

    @Override
    public String toString() {
        return "Consultation{" + "dateConsultation=" + dateConsultation + ", heure=" + heure + ", lieu=" + lieu + ", etatconsult=" + etatconsult + '}';
    }

    public Consultation(String dateConsultation, String heure, String lieu, String etatconsult) {
        this.dateConsultation = dateConsultation;
        this.heure = heure;
        this.lieu = lieu;
        this.etatconsult = etatconsult;
    }

    public String getDateConsultation() {
        return dateConsultation;
    }

    public String getHeure() {
        return heure;
    }

    public String getLieu() {
        return lieu;
    }

    public String getEtatconsult() {
        return etatconsult;
    }

    public void setDateConsultation(String dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setEtatconsult(String etatconsult) {
        this.etatconsult = etatconsult;
    }
    
}
