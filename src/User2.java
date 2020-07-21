/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgale
 */
public class User2 implements BDUser{
    
    private int id;
    private String name;
    private String documentType;
    private int documentNumber;
    
    public User2()
    {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }
    
    public BDUser clone()
    {
        BDUser clone = new User2();
        clone.setId(this.id);
        clone.setName(this.name);
        clone.setDocumentType(this.documentType);
        clone.setDocumentNumber(this.documentNumber);
        return clone;
    }
}
