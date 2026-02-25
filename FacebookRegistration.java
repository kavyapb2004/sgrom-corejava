class FacebookRegistration {

    public static void main(String[] args) {

        registerUser("kavya.pb", "kavya@gmail.com", "Kavya@123");
        registerUser("kavya.pb", "kavya@gmail.com", "Kavya@123", 9876543210L);
    }

    public static void registerUser(String username, String email, String password) {

        if(username != null && email != null && password != null) {

            System.out.println("\nFacebook Registration - Basic");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Account Created Successfully!");

        } else {
            System.out.println("Registration Failed!");
        }
    }

    public static void registerUser(String username, String email, String password, long mobileNumber) {

        if(username != null && email != null && password != null && mobileNumber != 0) {

            System.out.println("\nFacebook Registration - With Mobile");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Mobile: " + mobileNumber);
            System.out.println("Account Created Successfully!");

        } else {
            System.out.println("Registration Failed!");
        }
    }
}