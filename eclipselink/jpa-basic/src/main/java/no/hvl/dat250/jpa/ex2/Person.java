package no.hvl.dat250.jpa.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Person {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String firstName;
    private String lastName;
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private List<Address> address = new ArrayList<Address>();
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private List<Credit> creditcard = new ArrayList<Credit>();


    private String nonsenseField = "";

    
    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Leave the standard column name of the table
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany
    public List<Address> getAddress() {
        return this.address;
    }

    public void setAdress(List<Address> address) {
        this.address = address;
    }

    @Transient
    public String getNonsenseField() {
        return nonsenseField;
    }

    public void setNonsenseField(String nonsenseField) {
        this.nonsenseField = nonsenseField;
    }

    @OneToMany
    public List<Credit> getCreditList() {
        return this.creditcard;
    }

    public void setCreditList(List<Credit> ccnumber) {
        this.creditcard = ccnumber;
    }
    
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + "]";
    }

}