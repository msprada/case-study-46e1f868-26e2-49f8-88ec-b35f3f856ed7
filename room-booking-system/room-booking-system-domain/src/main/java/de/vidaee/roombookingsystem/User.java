package de.vidaee.roombookingsystem;

public class User {
    private String id;
    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        super();
        this.lastname=lastname;
        this.firstname=firstname;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.firstname + this.lastname;
    }
}
