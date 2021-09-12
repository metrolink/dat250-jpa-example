package no.hvl.dat250.jpa.ex2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "Bank";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
       // em.createQuery("DELETE FROM Credit").executeUpdate();
        
        // create new todo
        em.getTransaction().begin();
        /*em.createQuery("DELETE FROM Credit").executeUpdate();
        em.createQuery("DELETE FROM Address").executeUpdate();
        em.createQuery("DELETE FROM Bank").executeUpdate();
        //em.createQuery("DELETE FROM Person").executeUpdate();
        em.createQuery("DELETE FROM Pin").executeUpdate();*/
        
        Credit credit = new Credit();
        credit.setBalance(5000);
        credit.setLimit(100000);
        credit.setNumber(50);
        em.persist(credit);
        
        Address address = new Address();
        address.setNumber(17);
        address.setStreet("Bergensgate");
        em.persist(address);
        
        Bank bank = new Bank();
        bank.setName("Bergen Bank");
        em.persist(bank);
        
        /*Person person = new Person();
        person.setFirstName("Harald");
        person.setLastName("g");
        em.persist(person);
        */
        
        Pin pincode = new Pin();
        pincode.setPin("1234");
        pincode.setCount(2);
        em.persist(pincode);
        
        
        // read the existing entries and write to console
        Query q1 = em.createQuery("select t from Credit t");
        //Query q2 = em.createQuery("select t from Person t");
        Query q3 = em.createQuery("select t from Bank t");
        Query q4 = em.createQuery("select t from Address t");
        Query q5 = em.createQuery("select t from Pin t");
        
        List<Credit> creditList = q1.getResultList();
        //List<Person> personList = q2.getResultList();
        List<Bank> bankList = q3.getResultList();
        List<Address> addressList = q4.getResultList();
        List<Pin> pinList = q5.getResultList();
        //List<Credit> deletedList = del.getResultList();
        
        em.getTransaction().commit();
        //List<Person> personList = w.getResultList();
        for (Credit cards : creditList) {
            System.out.println(cards);
        }
        
        for (Bank banks : bankList) {
            System.out.println(bank);
        }
        
        for (Address addresses : addressList) {
            System.out.println(addresses);
        }
        
        for (Pin codes : pinList) {
            System.out.println(codes);
        }
        /*for (Person people : personList) {
        	System.out.println(people);
        }*/
        System.out.println("Size: " + creditList.size());

        
        
        

        em.close();
    }
}
