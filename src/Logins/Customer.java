package bankapp;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carl
 */
public class Customer  implements Serializable{
    private final String prenume;
    private final String nume;
    private final String cnp;
    private final Account account;

    Customer(String prenume, String nume, String cnp, Account account) {
        this.prenume = prenume;
        this.nume = nume;
        this.cnp = cnp;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return "\nCustomer Information\n" +
                "Prenume: " + getFirstName() + "\n" + 
                "Nume: " + getLastName() +  "\n" + 
                "CNP: " + getCnp() +  "\n" + 
                account;
    }
    
    public String basicInfo(){
        return " Account Number: " + account.getAccountNumber() + " - Nume: " + getFirstName() + " " + getLastName();
    }
    
    Account getAccount(){
        return account;
    }

    /**
     * @return the prenume
     */
    public String getFirstName() {
        return prenume;
    }

    /**
     * @return the nume
     */
    public String getLastName() {
        return nume;
    }

    /**
     * @return the cnp
     */
    public String getCnp() {
        return cnp;
    }
    
}
