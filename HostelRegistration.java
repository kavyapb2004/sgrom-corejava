class HostelRegistration{
	public static void main(String[] hostelregistration){
		// invoke save Hostel Registration
        saveHostelRegistration("kavya", "single", 105);
	}
	static void saveHostelRegistration(String studentName, String roomType,int roomNumber){
        /*String studentName = "Kavya";
        String roomType = "Single";
        int roomNumber = 105;*/

        System.out.println("Hostel Registration");
        System.out.println("Student Name: " + studentName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
    }   
}