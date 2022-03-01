/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;
import BDD.bdd;



/**
 *
 * @author ghada
 */
public class Patient {
        private String nom ;
    private int  age ;

    private String sex ;

    public boolean Ajouter() throws ClassNotFoundException {
        String requete="INSERT INTO `patient`(`nom`, `age`, `sex`) VALUES ('"+nom+"','"+age+"','"+sex+"');";
        return bdd.runNonQuery(requete);
    }
   
  

    public String toString( String nom, int age , String sex) {
        return "Patient{" + "age=" + age + ", nom=" + nom + ", sex=" + sex + '}';
    }
    
   

    public Patient() {
        
    }

    public Patient( String nom,int age ,String sex) {
        this.age = age;
        this.nom = nom;
        this.sex=sex;
    }
    public String addPatient(String no, int ag , String se){

        this.age= ag;
        this.nom = no;
        this.sex=se;
        return "Patient "+no+" et ajouter avec succes ";
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getage() {
        return age;
    }

    public String getNom() {
        return nom;
    }
        public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }


    
}
