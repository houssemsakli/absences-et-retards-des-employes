/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package houssem.sakli;

/**
 *
 * @author sakli
 */
import java.sql.*;
public class Test {
    static Connection c = null;
    static PreparedStatement stmt = null;
    public Test() throws ClassNotFoundException, SQLException
    {

    }
      public static void main(String args[]) throws ClassNotFoundException, SQLException {
    
                Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        System.out.println("tester l'ecriture des données :");
        //stmt = c.createStatement();
        //String requete = "insert into comptesinscrits values ('test','1','2','3','4','5','6')";
        
        String requete = "UPDATE employes SET mat='newmat2', nom='nom10', prenom='prenom10' WHERE mat='testmatt'";
        stmt= c.prepareStatement(requete);
        //stmt.setString(1, email);
        int nb = stmt.executeUpdate(requete);
        if (nb==0)
            System.out.println("Echec d'ajout");
        else
            System.out.println("ajout reussi");
    }
}
