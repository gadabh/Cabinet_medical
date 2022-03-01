/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

/**
 *
 * @author ghada
 */
public class Prescription {
    private String designation ;
    private String periode ;
    private String indication ;

    public Prescription() {
    }

    public Prescription(String designation, String periode, String indication) {
        this.designation = designation;
        this.periode = periode;
        this.indication = indication;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPeriode() {
        return periode;
    }

    public String getIndication() {
        return indication;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
    
}
