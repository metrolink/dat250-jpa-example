package no.hvl.dat250.jpa.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Credit {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Essentially sequence
    private long id;
    
    private int Number;
    private long Limit;
    private long Balance;
    
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private List<Person> person = new ArrayList<Person>();
   


    private String nonsenseField = "";

    
    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public Long getLimit() {
        return Limit;
    }

    public void setLimit(long Limit) {
        this.Limit = Limit;
    }

    // Leave the standard column name of the table
    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
    public long getBalance() {
    	return Balance;
    }
    
    public void setBalance(long Balance) {
    	this.Balance = Balance;
    }
    

    @ManyToOne
    public List<Person> setCredit() {
        return this.person;
    }

    public void setCredit(List<Person> person) {
        this.person = person;
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
        return "Credit [Number=" + Number + ", Limit=" + Limit
                + ", Balance=" + Balance + ", ID=" + id + "]";
}
}
