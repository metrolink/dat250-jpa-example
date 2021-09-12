package no.hvl.dat250.jpa.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Address {
	 @Id 
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private String id;
	    private String Street;
	    private int Number;
	    
	    private List<Person> person = new ArrayList<Person>();
	   


	    private String nonsenseField = "";

	    
	    public String getId() {
	        return id;
	    }

	    public void setId(String Id) {
	        this.id = Id;
	    }

	    public String getStreet() {
	        return Street;
	    }

	    public void setStreet(String Street) {
	        this.Street = Street;
	    }

	    // Leave the standard column name of the table
	    public int getNumber() {
	        return Number;
	    }

	    public void setNumber(int Number) {
	        this.Number = Number;
	    }

	    @ManyToMany
	    public List<Person> getPerson() {
	        return this.person;
	    }

	    public void setPerson(List<Person> person) {
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
	        return "Address [Street=" + Street + ", Number=" + Number
	                + "]";
	    }
}
