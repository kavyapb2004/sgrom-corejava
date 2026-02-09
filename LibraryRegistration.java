class LibraryRegistration {

    public static void main(String[] libraryregistration) {
        // invoke save Library Registration
        saveLibraryRegistration( "Ravi", "LIB2026","ravi@gmail.com");
    }
    static void saveLibraryRegistration(String memberName,String membershipId,String emailId) {
		 /*String memberName = "Ravi";
        String membershipId = "LIB2026";
        String emailId = "ravi@gmail.com";*/

        System.out.println("Library Membership Registration");
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Email ID: " + emailId);
    }
}


        