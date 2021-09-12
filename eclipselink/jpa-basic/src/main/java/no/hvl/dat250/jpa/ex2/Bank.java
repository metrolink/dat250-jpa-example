package no.hvl.dat250.jpa.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Bank {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String Name;
    
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private List<Credit> credit = new ArrayList<Credit>();
   


    private String nonsenseField = "";

    
    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

 

    // Leave the standard column name of the table
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    

    @OneToMany
    public List<Credit> getPerson() {
        return this.credit;
    }

    public void setPerson(List<Credit> credit) {
        this.credit = credit;
    }

    @Transient
    public String getNonsenseField() {
        return nonsenseField;
    }

    public void setNonsenseField(String nonsenseField) {
        this.nonsenseField = nonsenseField;
    }
    
    @Override
    public String toString() {
        return "Bank [Name=" + Name + "]";
}
}
