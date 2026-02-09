class NptelRegistration {

    public static void main(String[] nptlregistration) {
        // invoke save Nptel Registration
        saveNptelRegistration( "Kavya", "kavya@gmail.com", "Programming in Java", "VTU", 12, true );
    }

    static void saveNptelRegistration(String studentName,String emailId,String courseName,String university,int courseDurationWeeks,boolean certificateOpted) {

        System.out.println("NPTEL Registration Form");
        System.out.println("Student Name: " + studentName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Course Name: " + courseName);
        System.out.println("University: " + university);
        System.out.println("Course Duration (Weeks): " + courseDurationWeeks);
        System.out.println("Certificate Opted: " + certificateOpted);
    }
}
