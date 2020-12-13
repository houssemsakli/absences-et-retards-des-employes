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
public class Comptes {
    public String email,nom,prenom,genre,mdp,fonction,nomentreprise;
    public Comptes(String em,String nm,String pren,String gn,String mp,String fn,String nment)
    {
        email=em;
        nom=nm;
        prenom=pren;
        genre=gn;
        mdp=mp;
        fonction=fn;
        nomentreprise=nment;
    }
}
