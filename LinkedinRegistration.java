class LinkedinRegistration {

    public static void main(String[] args) {
        saveLinkedinRegistration( "Kavya", "kavya@gmail.com","kavya@123","Software Engineer","Bangalore" );
    }

    static void saveLinkedinRegistration(String fullName,String emailId,String password,String jobTitle,String location) {

        System.out.println("LinkedIn Registration Details");
        System.out.println("Full Name: " + fullName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Password: " + password);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Location: " + location);
    }
}
