package models;

public class Gebruiker {
    private String naam;
    
    public Gebruiker(String naam) {
        this.naam = naam;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
}
