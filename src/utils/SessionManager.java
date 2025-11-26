package utils;

public class SessionManager {
    private static boolean isLoggedIn = false;
    private static String userType = ""; // "sollicitant" or "bedrijf"
    
    public static void login(String type) {
        isLoggedIn = true;
        userType = type;
    }
    
    public static void logout() {
        isLoggedIn = false;
        userType = "";
    }
    
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    public static String getUserType() {
        return userType;
    }
}
