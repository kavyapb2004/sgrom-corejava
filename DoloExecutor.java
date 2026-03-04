class DoloExecutor{


	public static void main(String[] args){
	
	
	Dolo dolo = new Dolo();
	
	    dolo.tabletName = "Dolo 650";
        String tabletName = dolo.tabletName;

        dolo.dosageInMg = 650;
        int dosageInMg = dolo.dosageInMg;

        dolo.price = 30.00;
        double price = dolo.price;

        dolo.quantity = 15;
        int quantity = dolo.quantity;

        dolo.isAvailable = true;
        boolean isAvailable = dolo.isAvailable;

        dolo.requiresPrescription = false;
        boolean requiresPrescription = dolo.requiresPrescription;

	
	
	
	    System.out.println("Dolo");
	    System.out.println("Dolo Tablet Details");
        System.out.println("Tablet Name: " + tabletName);
        System.out.println("Dosage (mg): " + dosageInMg);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Is Available: " + isAvailable);
	}
}