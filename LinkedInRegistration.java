class LinkedInRegistration {

    public static void main(String[] args) {

        registerUser("kavya_dev", "kavya@linkedin.com", "Linked@123");
        registerUser("kavya_dev", "kavya@linkedin.com", "Linked@123", 9988776655L);
    }

    public static void registerUser(String username, String email, String password) {

        if(username != null && email != null && password != null) {

            System.out.println("\nLinkedIn Registration - Basic");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Invalid Details!");
        }
    }

    public static void registerUser(String username, String email, String password, long mobileNumber) {

        if(username != null && email != null && password != null && mobileNumber != 0) {

            System.out.println("\nLinkedIn Registration - Full");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Mobile: " + mobileNumber);
        } else {
            System.out.println("Invalid Details!");
        }
    }
}