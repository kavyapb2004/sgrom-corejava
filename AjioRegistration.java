class AjioRegistration {
    public static void main(String[] ajioregistration) {
        // invoke save AjioRegistration
        saveAjioRegistration( "kavya", "kavya@gmail.com", 9876543210L,"kavya@123","Female" );
    }

    static void saveAjioRegistration(String userName,String emailId, long mobileNumber, String password,String gender) {

        System.out.println("AJIO Registration Details");
        System.out.println("User Name: " + userName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
    }
}
