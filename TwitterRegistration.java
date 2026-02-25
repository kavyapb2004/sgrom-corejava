class TwitterRegistration {

    public static void main(String[] args) {

        registerUser("rakshi07", "rakshi@gmail.com", "Twitter@123");
        registerUser("rakshi07", "rakshi@gmail.com", "Twitter@123", 9123456789L);
    }

    public static void registerUser(String username, String email, String password) {

        if(username != null && email != null && password != null) {

            System.out.println("\nTwitter Registration - Basic");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Registration Failed!");
        }
    }

    public static void registerUser(String username, String email, String password, long mobileNumber) {

        if(username != null && email != null && password != null && mobileNumber > 0) {

            System.out.println("\nTwitter Registration - Full");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Mobile: " + mobileNumber);
        } else {
            System.out.println("Registration Failed!");
        }
    }
}