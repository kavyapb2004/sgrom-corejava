class WhatsAppRegistration {

    public static void main(String[] args) {

        registerUser("Rakshi", "rakshi@gmail.com", "Whats@123");
        registerUser("Rakshi", "rakshi@gmail.com", "Whats@123", 7411254225L);
    }

    public static void registerUser(String username, String email, String password) {

        if(username != null && email != null && password != null) {

            System.out.println("\nWhatsApp Registration - Basic");
            System.out.println("Name: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Registration Failed!");
        }
    }

    public static void registerUser(String username, String email, String password, long mobileNumber) {

        if(username != null && email != null && password != null && mobileNumber > 0) {

            System.out.println("\nWhatsApp Registration - With Mobile");
            System.out.println("Name: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Mobile: " + mobileNumber);
        } else {
            System.out.println("Registration Failed!");
        }
    }
}