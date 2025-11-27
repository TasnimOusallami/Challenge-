package models;

public class Gebruiker {
    private String klantenID;
    private String vaardigheden;
    private String werkervaring;
    
    public Gebruiker(String klantenID) {
        this.klantenID = klantenID;
        this.vaardigheden = "C#, C++, PHP, Java, JavaScript, HTML, CSS";
        this.werkervaring = "2016-2020 Odido (IT)\n2020-2025 Microsoft (Developer)";
    }
    
    public Gebruiker(String klantenID, String vaardigheden, String werkervaring) {
        this.klantenID = klantenID;
        this.vaardigheden = vaardigheden;
        this.werkervaring = werkervaring;
    }
    
    public String getKlantenID() {
        return klantenID;
    }
    
    public void setKlantenID(String klantenID) {
        this.klantenID = klantenID;
    }
    
    public String getVaardigheden() {
        return vaardigheden;
    }
    
    public void setVaardigheden(String vaardigheden) {
        this.vaardigheden = vaardigheden;
    }
    
    public String getWerkervaring() {
        return werkervaring;
    }
    
    public void setWerkervaring(String werkervaring) {
        this.werkervaring = werkervaring;
    }
}
