/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import BDD.bdd;
import DATA.Patient;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lotfil3ebri
 */
public class DossierMedical extends javax.swing.JFrame{
    
    
           private int num ;
           private String CodeA ;
          
  


    

    public String addDossier(String code){

        this.CodeA=CodeA;
        this.num = num;
      
        return "Dossier Medical "+CodeA+" et ajouter avec succes ";
    }

    
    
    
    
 /*
     * Creates new form Fich_infermier
     */
    public DossierMedical() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       public boolean AjouterD(String CodeA) throws ClassNotFoundException {
            
 String requete="INSERT INTO `Dossier_Medical`(`codeAccessMed`) VALUES ('"+CodeA+"');";
    return bdd.runNonQuery(requete);
    }
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
            java.util.logging.Logger.getLogger(Fich_infermier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fich_infermier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fich_infermier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fich_infermier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fich_infermier().setVisible(true);
            }
        });
    }

    public DossierMedical(int num, String CodeA, JDialog jDialog1) throws HeadlessException {
        this.num = num;
        this.CodeA = CodeA;
        this.jDialog1 = jDialog1;
    }

    public DossierMedical(int num, String CodeA, JDialog jDialog1, GraphicsConfiguration gc) {
        super(gc);
        this.num = num;
        this.CodeA = CodeA;
        this.jDialog1 = jDialog1;
    }

    public DossierMedical(int num, String CodeA, JDialog jDialog1, String title) throws HeadlessException {
        super(title);
        this.num = num;
        this.CodeA = CodeA;
        this.jDialog1 = jDialog1;
    }

    public DossierMedical(int num, String CodeA, JDialog jDialog1, String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.num = num;
        this.CodeA = CodeA;
        this.jDialog1 = jDialog1;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCodeA(String CodeA) {
        this.CodeA = CodeA;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    public int getNum() {
        return num;
    }

    public String getCodeA() {
        return CodeA;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }


   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables

     
}
