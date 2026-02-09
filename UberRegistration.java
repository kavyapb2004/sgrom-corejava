class UberRegistration {

    public static void main(String[] uberregistration) {
        // invoke save Uber Registration
        saveUberRegistration("Kavya","kavya@gmail.com",9876543210L,"Bangalore",true );
    }

    static void saveUberRegistration(String riderName,String emailId,long mobileNumber,String city,boolean paymentMethodAdded) {

        /*String riderName = "Kavya";
        String emailId = "kavya@gmail.com";
        String mobileNumber = "9876543210";
        String city = "Bangalore";
        boolean paymentMethodAdded = true*/
		
        System.out.println("Uber Rider Registration Details");
        System.out.println("Rider Name: " + riderName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("City: " + city);
        System.out.println("Payment Method Added: " + paymentMethodAdded);
    }
}

        