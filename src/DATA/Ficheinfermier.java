
package DATA;

import BDD.bdd;

/**
 *
 * @author ghada
 */
public class Ficheinfermier extends FicheDeSoin {
    private  String rapportInfermier ;

    public Ficheinfermier() {
    }
  

    public Ficheinfermier(String rapportInfermier) {
        this.rapportInfermier = rapportInfermier;
         this.numeroFiche=numeroFiche;
         this.dateCreation=dateCreation;
         this.agentCreateur=agentCreateur;
         this.adressCreateur=adressCreateur;
         this.getDossier_medical().setNumero(getDossier_medical().getNumero());
         this.getDossier_medical().setCodeAccessMedecin(getDossier_medical().getCodeAccessMedecin());
    }

    @Override
    public String toString() {
        return "Ficheinfermier{" + "rapportInfermier=" + rapportInfermier + '}';
    }

    @Override
    public void setNumeroFiche(int numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    @Override
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public void setAgentCreateur(String agentCreateur) {
        this.agentCreateur = agentCreateur;
    }

    @Override
    public void setAdressCreateur(String adressCreateur) {
        this.adressCreateur = adressCreateur;
    }
@Override
    public void setDossier_medical(DossierMedical dossier_medical) {
        this.dossier_medical = dossier_medical;
    }
@Override
    public int getNumeroFiche() {
        return numeroFiche;
    }
@Override
    public String getDateCreation() {
        return dateCreation;
    }
@Override
    public String getAgentCreateur() {
        return agentCreateur;
    }
@Override
    public String getAdressCreateur() {
        return adressCreateur;
    }

    public DossierMedical getDossier_medical() {
        return dossier_medical;
    }

    public String getRapportInfermier() {
        return rapportInfermier;
    }

    public void setRapportInfermier(String rapportInfermier) {
        this.rapportInfermier = rapportInfermier;
    }
    
}
