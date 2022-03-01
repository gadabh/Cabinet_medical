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
public class FicheConsultation  extends FicheDeSoin{
    private String observation ;
    private String compteRendu ;
    OperationDiagnostique[] operation_diagnostique=new OperationDiagnostique[1]; //0..1
  
    Consultation [] list_consultation=new Consultation[1];// 1..*
    ArrayList<Prescription> list_prescription=new ArrayList<Prescription>();// 1..*
    ArrayList<OperationAnalyse> list_operation_analyse=new ArrayList<OperationAnalyse>();// *

    @Override
    public String toString() {
        return "FicheConsultation{" + "observation=" + observation + ", compteRendu=" + compteRendu + ", operation_diagnostique=" + operation_diagnostique + ", list_consultation=" + list_consultation + ", list_prescription=" + list_prescription + ", list_operation_analyse=" + list_operation_analyse + '}';
    }

    

    
    
    
  
    
    
    
    
    
    public void setOperation_diagnostique(OperationDiagnostique[] operation_diagnostique) {
        this.operation_diagnostique = operation_diagnostique;
    }

    public void setConsultation(Consultation[] list_consultation) {
        this.list_consultation = list_consultation;
    }

    public void setList_prescription(ArrayList<Prescription> list_prescription) {
        this.list_prescription = list_prescription;
    }

    public void setList_operation_analyse(ArrayList<OperationAnalyse> list_operation_analyse) {
        this.list_operation_analyse = list_operation_analyse;
    }

    public void setNumeroFiche(int numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setAgentCreateur(String agentCreateur) {
        this.agentCreateur = agentCreateur;
    }

    public void setAdressCreateur(String adressCreateur) {
        this.adressCreateur = adressCreateur;
    }

    public void setDossier_medical(DossierMedical dossier_medical) {
        this.dossier_medical = dossier_medical;
    }
    
       
       
  public FicheConsultation(String observation, String compteRendu) {
        this.observation = observation;
        this.compteRendu = compteRendu;
         this.numeroFiche=numeroFiche;
         this.dateCreation=dateCreation;
         this.agentCreateur=agentCreateur;
         this.adressCreateur=adressCreateur;
         this.getDossier_medical().setNumero(getDossier_medical().getNumero());
         this.getDossier_medical().setCodeAccessMedecin(getDossier_medical().getCodeAccessMedecin());
    }
    public String getObservation() {
        return observation;
    }

    public String getCompteRendu() {
        return compteRendu;
    }

    public FicheConsultation() {
    }

  

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }

    
}
