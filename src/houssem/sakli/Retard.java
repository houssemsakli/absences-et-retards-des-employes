/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem.sakli;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author sakli
 */
public class Retard {
    String id,mat,type,motif,justificatif,autorise;
    Date dateabs;
    Time heuredb,duree;
    public Retard(String xid, String xmat, String xtype, Date xdateabs, Time xheuredb, Time xduree, String xmotif, String xjustificatif, String xautorise)
    {
        id=xid;
        mat=xmat;
        type=xtype;
        dateabs=xdateabs;
        heuredb=xheuredb;
        duree=xduree;
        motif=xmotif;
        justificatif=xjustificatif;
        autorise=xautorise;
    }
}
