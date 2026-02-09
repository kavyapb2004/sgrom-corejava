class InstagramRegistration {
    public static void main(String[] instagramregistration) {
        // invoke save instagram registration
        saveInstagramRegistration(
            "kavya_pb",
            "Kavya",
            "kavya@gmail.com",
            "kavya@123",
            9876543210L,
            21
        );
    }

    static void saveInstagramRegistration(
            String userName,
            String fullName,
            String emailId,
            String password,
            long mobileNumber,
            int age) {

        System.out.println("Instagram Registration Details");
        System.out.println("Username: " + userName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Password: " + password);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Age: " + age);
    }
}
