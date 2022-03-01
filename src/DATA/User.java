/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import BDD.bdd;
import java.sql.SQLException;

/**
 *
 * @author ghada
 */
public class User {
   private  String username;
  private  String  password ;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }

    
    public boolean Login() throws ClassNotFoundException, SQLException {
        bdd b = new bdd();
      return  bdd.Chekuserandpass(username,password);
    }
    
    
}
