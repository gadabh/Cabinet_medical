/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.util.ArrayList;



/**
 *
 * @author ghada
 */
public class DossierMedical {
    private int numero ;
    private String codeAccessMedecin;
      ArrayList<FicheDeSoin> Liste_FicheDeSoins=new ArrayList<FicheDeSoin>();
      
     public Patient patientx = new Patient("",0,"");

    public DossierMedical(int numero, String codeAccessMedecin ) {
     
        this.numero = numero;
        this.codeAccessMedecin = codeAccessMedecin;
    }

    @Override
    public String toString() {
        return "DossierMedical{" + "numero=" + numero + ", codeAccessMedecin=" + codeAccessMedecin + ", Liste_FicheDeSoins=" + Liste_FicheDeSoins + ", patientx{ Nom : " + patientx.getNom() + " , Age : "+patientx.getage()+" , Sexe : "+patientx.getSex()+'}';
    }

    
  public FicheDeSoin addFicheDeSoin(FicheDeSoin F){
       FicheDeSoin ficheDeSoins= new FicheDeSoin(F.getNumeroFiche(),F.getDateCreation(),F.getAdressCreateur(),F.getAdressCreateur());
        return ficheDeSoins;
    }

    public Patient getPatient(){
      return patientx;
    }
    
    public void addFicheDesoin(FicheDeSoin F){
      //  F.add();
    }
    
    DossierMedical() {        
    }

    public int getNumero() {
        return numero;
    }

    public String getCodeAccessMedecin() {
        return codeAccessMedecin;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodeAccessMedecin(String codeAccessMedecin) {
        this.codeAccessMedecin = codeAccessMedecin;
    }
    
}
