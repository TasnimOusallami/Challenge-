package utils;

public class SessionManager {
    private static boolean isLoggedIn = false;
    private static String userType = ""; // "sollicitant" or "bedrijf"
    private static String klantenID = "";
    private static String bedrijfsID = "";
    private static String bedrijfsNaam = "";
    private static String werkervaring = "";
    private static String vaardigheden = "";
    
    public static void login(String type) {
        isLoggedIn = true;
        userType = type;
        
        // Genereer ID's
        if (type.equals("sollicitant")) {
            klantenID = generateKlantenID();
        } else if (type.equals("bedrijf")) {
            bedrijfsID = generateBedrijfsID();
        }
    }
    
    public static void loginSollicitant(String vaardigheden, String werkervaring) {
        isLoggedIn = true;
        userType = "sollicitant";
        klantenID = generateKlantenID();
        SessionManager.vaardigheden = vaardigheden;
        SessionManager.werkervaring = werkervaring;
    }
    
    public static void loginBedrijf(String bedrijfsNaam) {
        isLoggedIn = true;
        userType = "bedrijf";
        bedrijfsID = generateBedrijfsID();
        SessionManager.bedrijfsNaam = bedrijfsNaam;
    }
    
    public static void logout() {
        isLoggedIn = false;
        userType = "";
        klantenID = "";
        bedrijfsID = "";
        bedrijfsNaam = "";
        werkervaring = "";
        vaardigheden = "";
    }
    
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    public static String getUserType() {
        return userType;
    }
    
    public static String getKlantenID() {
        return klantenID;
    }
    
    public static String getBedrijfsID() {
        return bedrijfsID;
    }
    
    public static String getBedrijfsNaam() {
        return bedrijfsNaam;
    }
    
    public static String getWerkervaring() {
        return werkervaring;
    }
    
    public static String getVaardigheden() {
        return vaardigheden;
    }
    
    public static void setWerkervaring(String werkervaring) {
        SessionManager.werkervaring = werkervaring;
    }
    
    public static void setVaardigheden(String vaardigheden) {
        SessionManager.vaardigheden = vaardigheden;
    }
    
    private static String generateKlantenID() {
        return String.format("%08d", (int)(Math.random() * 100000000));
    }
    
    private static String generateBedrijfsID() {
        return String.format("%06d", (int)(Math.random() * 1000000));
    }
}
