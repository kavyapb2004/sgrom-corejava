class ExamRegistration {
    public static void main(String[] examregistration) {
        // invoke save ExamRegistration
        saveExamRegistration("kavya","Java Test",300);
    }

    static void saveExamRegistration(String studentName, String examName, int examFee) {
        System.out.println("Exam Registration");
        System.out.println("Student: " + studentName);
        System.out.println("Exam: " + examName);
        System.out.println("Fee: " + examFee);
    }
}
