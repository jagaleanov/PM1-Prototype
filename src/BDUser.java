/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgale
 */
public interface BDUser {
    public void setId (int id);
    public void setName (String name);
    public void setDocumentType (String documentType);
    public void setDocumentNumber (int documentNumber);
    
    public int getId ();
    public String getName ();
    public String getDocumentType ();
    public int getDocumentNumber ();
    
    public BDUser clone ();
}
