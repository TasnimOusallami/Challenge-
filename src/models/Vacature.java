package models;

public class Vacature {
    private String functieNaam;
    private String status;
    private String adres;
    private String werkuren;
    private String dienstverband;
    private String salaris;
    private String bedrijfNaam;
    
    public Vacature(String functieNaam, String status, String adres, String werkuren, 
                    String dienstverband, String salaris, String bedrijfNaam) {
        this.functieNaam = functieNaam;
        this.status = status;
        this.adres = adres;
        this.werkuren = werkuren;
        this.dienstverband = dienstverband;
        this.salaris = salaris;
        this.bedrijfNaam = bedrijfNaam;
    }
    
    public String getFunctieNaam() { return functieNaam; }
    public String getStatus() { return status; }
    public String getAdres() { return adres; }
    public String getWerkuren() { return werkuren; }
    public String getDienstverband() { return dienstverband; }
    public String getSalaris() { return salaris; }
    public String getBedrijfNaam() { return bedrijfNaam; }
}
