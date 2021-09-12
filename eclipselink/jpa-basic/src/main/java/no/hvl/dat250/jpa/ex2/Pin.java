package no.hvl.dat250.jpa.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Pin {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String Pincode;
    private int count;
    
    
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
    public String getPin() {
        return Pincode;
    }

    public void setPin(String Pincode) {
        this.Pincode = Pincode;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    

    @ManyToOne
    public List<Credit> getCredit() {
        return this.credit;
    }

    public void setCredit(List<Credit> credit) {
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
        return "Bank [Pincode=" + Pincode + ", Tries= "+ count + "]";
}
}
