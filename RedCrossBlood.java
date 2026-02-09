class RedCrossBlood {

    public static void main(String[] donating) {
      // invoke save donor account
        saveDonorAccount("xyz@gmail.com", "dec123", 10, "Kavya", "PB", 345,"kavya123","kavya123");
    }
      // method definition
    static void saveDonorAccount(String emailId,String dateOfBirth,int donorId,String firstName,String lastName,int zipCode,String password,String confirmPassword) {
        System.out.println("email id: " + emailId);
        System.out.println("date of birth: " + dateOfBirth);
        System.out.println("donor id: " + donorId);
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("zip code: " + zipCode);
        System.out.println("password: " + password);
        System.out.println("confirm password: " + confirmPassword);
    }
}

	
	
	
