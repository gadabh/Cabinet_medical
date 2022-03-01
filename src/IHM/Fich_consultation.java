/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import BDD.bdd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lotfil3ebri
 */
public class Fich_consultation extends javax.swing.JFrame{
    
    
           private String num_fiche ;
           private String date_creation ;
           private String agent_createur ;
           private String adr_createur;
           private String observation ;
            private String compte_rendu ;

  


     

    public String addFich_consultation( String observation ,String compte_rendu ,String num_fiche,  String date_creation,  String agent_createur,  String adr_createur,  String rapport_infermeier){

        this.num_fiche=num_fiche;
        this.date_creation = date_creation;
        this.adr_createur=adr_createur;
        this.agent_createur=agent_createur;
        this.observation=observation;
        this.compte_rendu=compte_rendu;
        return "Fich  consultation"+num_fiche+" et ajouter avec succes ";
    }

    
    
    
    
 /*
     * Creates new form Fich_infermier
     */
    public Fich_consultation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        Adresse_Createur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Agent_Createur = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Date_Creation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        compte_rendu1 = new javax.swing.JTextField();
        observation1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Adresse_Createur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adresse_CreateurActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Ajouter Fich Consultation");

        jLabel2.setText("Date Creation");

        jLabel3.setText("Agent Createur ");

        jLabel4.setText("Adresse Createur");

        Agent_Createur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agent_CreateurActionPerformed(evt);
            }
        });

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Date_Creation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_CreationActionPerformed(evt);
            }
        });

        jLabel5.setText("compte Rendu");

        compte_rendu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compte_rendu1ActionPerformed(evt);
            }
        });

        observation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observation1ActionPerformed(evt);
            }
        });

        jLabel6.setText("observation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Adresse_Createur, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date_Creation)
                            .addComponent(Agent_Createur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(compte_rendu1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(observation1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(629, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date_Creation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agent_Createur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adresse_Createur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compte_rendu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(observation1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String DateCreation= Date_Creation.getText();
          String AgentCreateur= Agent_Createur.getText();
          String AdresseCreateur= Adresse_Createur.getText();
          String compteRendu= compte_rendu1.getText();
          String observation= observation1.getText();

          
          
        
      Fich_consultation f =new Fich_consultation();
        bdd b =new bdd();
         DefaultTableModel fich_consultation;
        f.setNum_fiche("1");
        f.setAdr_createur(AdresseCreateur);
        f.setAgent_createur(AgentCreateur);
        f.setCompte_rendu(compteRendu);
        f.setObservation(observation);
        
        f.setDate_creation(DateCreation);
        try{
      if(f.Ajouterf(AdresseCreateur,DateCreation,AgentCreateur,compteRendu,observation)){
      //    b.fillToJtable("select * from fich_infermier",client_tab);
          JOptionPane.showConfirmDialog(null,"l'ajout est bien faits");
          
      }else{
   JOptionPane.showConfirmDialog(null,"Erreur d'ajout");

      }
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setCompte_rendu(String compte_rendu) {
        this.compte_rendu = compte_rendu;
    }

    public String getObservation() {
        return observation;
    }

    public JTextField getObservation1() {
        return observation1;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setObservation1(JTextField observation1) {
        this.observation1 = observation1;
    }

       public boolean Ajouterf(String AdresseCreateur,String DateCreation,String AgentCreateur,String compteRendu,String observation) throws ClassNotFoundException {
            
 String requete="INSERT INTO `fich_consultation`(`date_creation`,`agent_createur`,`adr_createur`,`compteRendu`,`observation`) VALUES ('"+DateCreation+"','"+AgentCreateur+"','"+AdresseCreateur+"','"+compteRendu+"','"+observation+"');";
    return bdd.runNonQuery(requete);
    }
    private void Agent_CreateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agent_CreateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agent_CreateurActionPerformed

    private void Adresse_CreateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adresse_CreateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adresse_CreateurActionPerformed

    private void Date_CreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_CreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_CreationActionPerformed

    private void compte_rendu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compte_rendu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compte_rendu1ActionPerformed

    private void observation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observation1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fich_consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fich_consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fich_consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fich_consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fich_consultation().setVisible(true);
            }
        });
    }

    
    
    
    
    public void setNum_fiche(String num_fiche) {
        this.num_fiche = num_fiche;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setAgent_createur(String agent_createur) {
        this.agent_createur = agent_createur;
    }

    public void setAdr_createur(String adr_createur) {
        this.adr_createur = adr_createur;
    }

 

    public void setAgefild(JTextField agefild) {
        this.Agent_Createur = agefild;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

  


    public void setNomfild(JTextField nomfild) {
        this.Date_Creation = nomfild;
    }

    public void setSexfild(JTextField sexfild) {
        this.Adresse_Createur = sexfild;
    }

    public String getNum_fiche() {
        return num_fiche;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public String getAgent_createur() {
        return agent_createur;
    }

    public String getAdr_createur() {
        return adr_createur;
    }

  

    public JTextField getAgefild() {
        return Agent_Createur;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

 

    public JTextField getNomfild() {
        return Date_Creation;
    }

    public JTextField getSexfild() {
        return Adresse_Createur;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adresse_Createur;
    private javax.swing.JTextField Agent_Createur;
    private javax.swing.JTextField Date_Creation;
    private javax.swing.JTextField compte_rendu1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField observation1;
    // End of variables declaration//GEN-END:variables

     
}