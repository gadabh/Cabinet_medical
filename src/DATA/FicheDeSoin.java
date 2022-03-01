/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


public class FicheDeSoin {
    protected int numeroFiche ;
    public String dateCreation ;
    public String agentCreateur ;

    public void setDossier_medical(DossierMedical dossier_medical) {
        this.dossier_medical = dossier_medical;
    }
    protected String adressCreateur;
    DossierMedical dossier_medical=new DossierMedical();

    
     FicheDeSoin createFicheDeSoin(int numeroFiche,String dateCreation,String agentCreateur,String adressCreateur,DossierMedical dossier_medical){
       this.numeroFiche=numeroFiche;
       this.dateCreation=dateCreation;
               this.agentCreateur=agentCreateur;
               this.adressCreateur=adressCreateur;
               this.getDossier_medical().setNumero(dossier_medical.getNumero());
               this.getDossier_medical().setCodeAccessMedecin(dossier_medical.getCodeAccessMedecin());
        return this;
              
      
    }
     
   public  void  setAgentCreateur(String AG){
      
          FicheDeSoin.this.agentCreateur=AG;
               
      
              
      
    }
     
     
     
     
     
     

    @Override
    public String toString() {
        return "FicheDeSoin{" + "numeroFiche=" + numeroFiche + ", dateCreation=" + dateCreation + ", agentCreateur=" + agentCreateur + ", adressCreateur=" + adressCreateur + ", dossier_medical  : Code Access =" + getDossier_medical().getCodeAccessMedecin() +  '}';
    }
    
    
    
    
    
    
    public FicheDeSoin(int numeroFiche, String dateCreation, String agentCreateur, String adressCreateur) {
        this.numeroFiche = numeroFiche;
        this.dateCreation = dateCreation;
        this.agentCreateur = agentCreateur;
        this.adressCreateur = adressCreateur;
    }

    public FicheDeSoin() {
    }
    
    
    
     public void setagentCreateur(String agentCreateur) {
        this.agentCreateur = agentCreateur;
    }

    

    public void setNumeroFiche(int numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }



    public void setAdressCreateur(String adressCreateur) {
        this.adressCreateur = adressCreateur;
    }

    public int getNumeroFiche() {
        return numeroFiche;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getAgentCreateur() {
        return agentCreateur;
    }

    public String getAdressCreateur() {
        return adressCreateur;
    }

	public DossierMedical getDossier_medical() {
		return dossier_medical;
	}
    
}
