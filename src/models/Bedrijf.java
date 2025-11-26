package models;

public class Bedrijf {
    private String naam;
    private String vacatures;
    
    public Bedrijf(String naam, String vacatures) {
        this.naam = naam;
        this.vacatures = vacatures;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    public String getVacatures() {
        return vacatures;
    }
    
    public void setVacatures(String vacatures) {
        this.vacatures = vacatures;
    }
}
