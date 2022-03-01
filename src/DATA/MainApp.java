/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ghada
 */
public class MainApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DossierMedical dossier_medical = new DossierMedical(1,"123456");
             //   FicheDeSoin ficheDeSoin = new FicheDeSoin();
              ArrayList FichConsulatation_List = new ArrayList();
        ArrayList FichDeSoin_List = new ArrayList();
       Ficheinfermier ficheinfermier=new Ficheinfermier();
       FicheConsultation ficheConsultation=new FicheConsultation();
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         
//********************************************Menu**********************************************
        java.util.Scanner entree =   new java.util.Scanner(System.in);
            int choix;
                
      System.out.println("1- Ajouter un patient ");
      System.out.println("2- afficher un patient ");
       System.out.println();
      System.out.println("3- Ajouter des fiches de soin");
      System.out.println("4- la liste des fiches de soin");
       System.out.println();
      System.out.println("5- la liste des doccier medicale");
       System.out.println();
      System.out.println("6- Ajouter un fiche infermier");
      System.out.println("7- Afficher les fiches infermier");
       System.out.println();
      System.out.println("8- Ajouter un fiche consultation");
      System.out.println("9- Afficher les fiches consultation");
       System.out.println();
      System.out.println("10- Ajouter un consultation");
       System.out.println();
      System.out.println("11- ajouter une operation Analyse");
      System.out.println("12- Afficher la list des operations Analyse");
       System.out.println();
      System.out.println("13- Ajouter une operations Diagnostic");
       System.out.println();
         System.out.println("14- Ajouter une Prescription");

      
      System.out.println("0- quiter");
      System.out.println("Votre choix: ");
        choix = entree.nextInt();
        
 while(choix!= 0){  

      if (choix == 1){
          ajoutpatient( dossier_medical);
               
      }else if (choix == 2){
             //************Dossier Medical : get patient**********************************************
             System.out.println("getPatient() { nom : "+dossier_medical.getPatient().getNom()+"; Age : "+dossier_medical.getPatient().getage()+"; Sex : "+ dossier_medical.getPatient().getSex()+" }");

      }
      else if (choix == 3){

             System.out.println("Donnez Nombre des fiches de soin ");
                 int nbFichDeSoin = entree.nextInt();
                 for(int i=0;i<nbFichDeSoin;i++){
                     Ajouter_des_fiches_de_soin(FichDeSoin_List,dossier_medical);
                        }

              }else if (choix == 4){
                  
                            System.out.println ("***************** la liste des fiches de soin *****************"); 
                            System.out.println (FichDeSoin_List);
                            System.out.println ("*****************  *****************"); 
            
              }else if (choix == 5){
                            System.out.println ("***************** la liste des doccier medicale *****************"); 
                            System.out.println (dossier_medical.toString());

                            System.out.println ("*****************  *****************"); 
              }else if (choix == 6){
                  
                  Ajouter_un_fiche_infermier(ficheinfermier);
                  
                           
                              
              }else if (choix == 7){
                  
                     System.out.println ("---------------liste des fiches infermier-----------------------------");
                         System.out.println ("--------------------------------------------");
                            System.out.println (" Numero Fiche infermier : "+ficheinfermier.getNumeroFiche());
                            System.out.println ("Date Creation : "+ficheinfermier.getDateCreation());
                            System.out.println ("Agent Createur : "+ficheinfermier.getAgentCreateur());
                            System.out.println ("Adress Createur : "+ficheinfermier.getAdressCreateur());
                           System.out.println ("Rapport Infermier : "+ficheinfermier.getRapportInfermier());
                 
                            System.out.println ("*****************  *****************"); 
                  
              }else if (choix == 8){
                     System.out.println ("--------nombre de fiche consultation -----------------------------");
                     int nbC = entree.nextInt();
                     for (int i=0;i<nbC;i++){
                  Ajouter_un_fiche_consultation( FichConsulatation_List,dossier_medical) ;
                  
                     }
                  
                  
                  
              }else if (choix == 9){
                    System.out.println ("---------------liste des fiches Consultation-----------------------------");
                       System.out.println (" Fiche Consultation : "+FichConsulatation_List.toString()); 
                    
                 
                            System.out.println ("*****************  *****************"); 
              }else if (choix == 10){
             //************ajouter consultation **********************************************
        
                    Consultation uneConsultation=new Consultation();
                
                    uneConsultation.setDateConsultation(LocalDateTime.now().getYear()+"/"+LocalDateTime.now().getMonth()+"/"+LocalDateTime.now().getDayOfMonth());
                  
                    uneConsultation.setHeure(LocalDateTime.now().getHour()+"h "+LocalDateTime.now().getMinute());
                    System.out.println ("---------------ajouter un lieu Consultation :-----------------------------");
                    String lieuc = entree.next();
                    uneConsultation.setLieu(lieuc);
                    System.out.println ("---------------ajouter un etat Consultation :-----------------------------");
                    String etatc = entree.next();
                    uneConsultation.setEtatconsult(etatc);
                    ficheConsultation.list_consultation[0]= uneConsultation;
                    System.out.println ("---------------la Consultation :-----------------------------");
                    System.out.println (Arrays.toString(ficheConsultation.list_consultation));
              
              }else if (choix == 11){
             //** ajouter une operation analyse ***********************************
             OperationAnalyse operationAnalyse= new OperationAnalyse();
                    
                    System.out.println ("---------------ajouter une Code Analyse d'operation :-----------------------------");
                                  
                    String codeAnalyse = entree.next();
                    operationAnalyse.setCodeAnalyse(codeAnalyse);
                    
                    operationAnalyse.setDateHeurOperation(dtf.format(LocalDateTime.now()));
                    
                    System.out.println ("---------------ajouter description Operation :-----------------------------");
                    String desc = entree.next();
                    operationAnalyse.setDescription(desc);
                   
                    System.out.println ("---------------ajouter resultat Operation :-----------------------------");
                    String res = entree.next();
                    operationAnalyse.setResult(res);
                    
                    ficheConsultation.list_operation_analyse.add(operationAnalyse);
                    
                   
                    }else if (choix == 12){
                         System.out.println ("--------------- Liste des Operations :-----------------------------");
                           System.out.println (ficheConsultation.list_operation_analyse.toString());
                     
                    }
      else if (choix == 13){
             //************ajouter operation diagnostique **********************************************
        
                    OperationDiagnostique operationDiagnostique=new OperationDiagnostique();
                     System.out.println ("---------------ajouter Date diagnostic :-----------------------------");
                    String dat = entree.next();
                    operationDiagnostique.setDateHeurOperation(dat);
                    
                    System.out.println ("---------------ajouter observation diagnostic :-----------------------------");
                    String obsd = entree.next();
                    operationDiagnostique.setObservation(obsd);
                    
                    
                       System.out.println ("---------------ajouter Activite Medicale :-----------------------------");
                    String act = entree.next();
                    operationDiagnostique.setActiviteMedicle(act);
                    
                    
                    
                    ficheConsultation.operation_diagnostique[0]= operationDiagnostique;
                    System.out.println ("---------------Liste des opearions diagnostics :-----------------------------");
                    System.out.println (Arrays.toString(ficheConsultation.operation_diagnostique));
              
              }else if (choix == 14){
             //** ajouter une Prescription ***********************************
             Prescription prescription= new Prescription();
                    
                    System.out.println ("---------------ajouter une Designation :-----------------------------");
                                  
                    String des = entree.next();
                    prescription.setDesignation(des);
                    
                   
                    
                    System.out.println ("---------------ajouter Periode :-----------------------------");
                    String per = entree.next();
                    prescription.setPeriode(per);
                   
                    System.out.println ("---------------ajouter indication :-----------------------------");
                    String ind = entree.next();
                    prescription.setIndication(ind);
                    
                    ficheConsultation.list_prescription.add(prescription);
                    
                   
                    }
           
          
                 
            
                 
             

      
              
              
              
      System.out.println("1- Ajouter un patient ");
      System.out.println("2- afficher un patient ");
       System.out.println();
      System.out.println("3- Ajouter des fiches de soin");
      System.out.println("4- la liste des fiches de soin");
       System.out.println();
      System.out.println("5- la liste des doccier medicale");
       System.out.println();
      System.out.println("6- Ajouter un fiche infermier");
      System.out.println("7- Afficher les fiches infermier");
       System.out.println();
      System.out.println("8- Ajouter un fiche consultation");
      System.out.println("9- Afficher les fiches consultation");
       System.out.println();
      System.out.println("10- Ajouter un consultation");
       System.out.println();
      System.out.println("11- ajouter une operation Analyse");
      System.out.println("12- Afficher la list des operations Analyse");
       System.out.println();
      System.out.println("13- Ajouter une operations Diagnostic");
       System.out.println();
         System.out.println("14- Ajouter une Prescription");

     
      System.out.println("0- quiter");
      System.out.println("Votre choix: ");
        choix = entree.nextInt();
                }
     

        //********************************************Fiche de Soin************************************************
         FicheDeSoin FS=new FicheDeSoin();
         System.out.println("Donnez Numero de fiche ");
	int numF = entree.nextInt();
        System.out.println("Donnez date creation fiche ");
	String  dateF = entree.next();
        System.out.println("Donnez agent createur  ");
	String agentCreateurF = entree.next();
        System.out.println("Donnez adress createur  ");
	String adressCreateurF = entree.next();
         System.out.println( FS.createFicheDeSoin(numF,dateF,agentCreateurF,adressCreateurF,dossier_medical));
         FS.setAgentCreateur("Ali chelbiiiiii");
         System.out.println("le nouveaux agent Createur : "+ FS.getAgentCreateur());
  
         
         //********************************************
        
        
    }

    private static void ajoutpatient(DossierMedical dossier_medical) {
                java.util.Scanner entree =   new java.util.Scanner(System.in);

       //************Ajouter un Patient**********************************************
                 System.out.println("Donnez Nom de Patient");
                 String no = entree.next();
                 System.out.println("Donnez Age de Patient ");
                 int ag = entree.nextInt();
                 System.out.println("Donnez Sex de Patient ");
                 String se = entree.next();
                 dossier_medical.patientx.addPatient(no,ag,se);
    }

    private static void Ajouter_des_fiches_de_soin(ArrayList FichDeSoin_List,DossierMedical dossier_medical) {
                     java.util.Scanner entree =   new java.util.Scanner(System.in);
                     FicheDeSoin ficheDeSoin = new FicheDeSoin();
                              System.out.println("*****************Donnez NumeroFiche de fiche de soin  ");
                            int NumeroFiche = entree.nextInt();
                            ficheDeSoin.setNumeroFiche(NumeroFiche);
                            if(ficheDeSoin.getDossier_medical().patientx.getNom()==null){
                            
                             System.out.println("*****************Donnez le Nom de Patient  ");
                             String pation_nom = entree.next();
                             ficheDeSoin.getDossier_medical().patientx.setNom(pation_nom);
                             
                              System.out.println("*****************Donnez l'age de Patient  ");
                             int pation_age = entree.nextInt();
                             ficheDeSoin.getDossier_medical().patientx.setage(pation_age);
                             
                                  System.out.println("*****************Donnez le sexe de Patient  ");
                             String sexe = entree.next();
                             ficheDeSoin.getDossier_medical().patientx.setSex(sexe);
                            } 
                              System.out.println("*****************Donnez dateCreation de fiche de soin  ");
                            String dateCreation = entree.next();
                            ficheDeSoin.setDateCreation(dateCreation);



                              System.out.println("*****************Donnez agentCreateur de fiche de soin  ");
                            String agentCreateur = entree.next();
                            ficheDeSoin.setagentCreateur(agentCreateur);


                               System.out.println("*****************Donnez adressCreateur de fiche de soin  ");
                            String adressCreateur = entree.next();
                            ficheDeSoin.setAdressCreateur(adressCreateur);


                               System.out.println("*****************Donnez Code Access Medecin de fiche de soin  ");
                             String dossier_medicale = entree.next();
                             ficheDeSoin.getDossier_medical().setCodeAccessMedecin(dossier_medicale);
                             
                             

                             FichDeSoin_List.add(ficheDeSoin);       
                             dossier_medical.Liste_FicheDeSoins.add(ficheDeSoin);
    }
     private static void Ajouter_un_fiche_infermier(Ficheinfermier ficheinfermier) {
          java.util.Scanner entree =   new java.util.Scanner(System.in);
                   System.out.println ("***************** Ajouter un fiche infermier *****************"); 
                            System.out.println ("--------------------------------------------");
                            
                               
                            System.out.println ("******Numero fiche infermier*****************"); 
                             int numrapportInfermier = entree.nextInt();
                            ficheinfermier.setNumeroFiche(numrapportInfermier);
                            System.out.println ("--------------------------------------------");                            
                            
                            System.out.println ("******Date creation fiche infermier*****************"); 
                             String dateFichInfermier = entree.next();
                            ficheinfermier.setDateCreation(dateFichInfermier);
                            System.out.println ("--------------------------------------------");
                            
                            
                             System.out.println ("******Agent createur de fiche infermier*****************"); 
                             String AgentcreateurInfermier = entree.next();
                            ficheinfermier.setAgentCreateur(AgentcreateurInfermier);
                             System.out.println ("--------------------------------------------");
                            
                             
                            System.out.println ("******Adress createur de fiche infermier*****************"); 
                             String AdrcreateurInfermier = entree.next();
                            ficheinfermier.setAdressCreateur(AdrcreateurInfermier);
                             System.out.println ("--------------------------------------------");
                             
                            System.out.println ("******rapport infermier *****************"); 
                             String rapportInfermier = entree.next();
                            ficheinfermier.setRapportInfermier(rapportInfermier);
    }

    private static void Ajouter_un_fiche_consultation(ArrayList FichConsulatation_List,DossierMedical dossier_medical) {
          java.util.Scanner entree =   new java.util.Scanner(System.in);
           FicheConsultation FichConsulatation = new FicheConsultation();
                   System.out.println ("***************** Ajouter un fiche consultation *****************"); 
                            System.out.println ("--------------------------------------------");
                            
                               
                            System.out.println ("******Numero fiche consultation*****************"); 
                             int numrapportInfermier = entree.nextInt();
                            FichConsulatation.setNumeroFiche(numrapportInfermier);
                            System.out.println ("--------------------------------------------");                            
                            
                            System.out.println ("******Date creation fiche consultation*****************"); 
                             String dateFichInfermier = entree.next();
                            FichConsulatation.setDateCreation(dateFichInfermier);
                            System.out.println ("--------------------------------------------");
                            
                            
                             System.out.println ("******Agent createur de fiche consultation*****************"); 
                             String AgentcreateurInfermier = entree.next();
                            FichConsulatation.setAgentCreateur(AgentcreateurInfermier);
                             System.out.println ("--------------------------------------------");
                            
                             
                            System.out.println ("******Adress createur de fiche consultation*****************"); 
                             String AdrcreateurInfermier = entree.next();
                            FichConsulatation.setAdressCreateur(AdrcreateurInfermier);
                             System.out.println ("--------------------------------------------");
                             
                             
                               System.out.println ("******Observation de fiche consultation*****************"); 
                             String obs = entree.next();
                            FichConsulatation.setObservation(obs);
                             System.out.println ("--------------------------------------------");
                             
                             
                              System.out.println ("******Compte Rendu de fiche consultation*****************"); 
                             String cmptR = entree.next();
                            FichConsulatation.setCompteRendu(cmptR);
                             System.out.println ("--------------------------------------------");
    
                             
                             
                             
                             FichConsulatation_List.add(FichConsulatation);       
                             dossier_medical.Liste_FicheDeSoins.add(FichConsulatation);
    }
}
