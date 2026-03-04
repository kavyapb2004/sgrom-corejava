class SanitizerExecutor{

	public static void main(Scltring[] args){
	
	
	    Sanitizer sanitizer = new Sanitizer();
	
	    sanitizer.brandName = "Dettol";
        String brandName = sanitizer.brandName;

        sanitizer.type = "Hand Sanitizer";
        String type = sanitizer.type;

        sanitizer.price = 99.00;
        double price = sanitizer.price;

        sanitizer.quantityInMl = 200;
        int quantityInMl = sanitizer.quantityInMl;

        sanitizer.isAvailable = true;
        boolean isAvailable = sanitizer.isAvailable;

        sanitizer.isAlcoholBased = true;
        boolean isAlcoholBased = sanitizer.isAlcoholBased;
		
	    System.out.println("sanitizer");
		System.out.println("Brand Name: " + brandName);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity (ml): " + quantityInMl);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Alcohol Based: " + isAlcoholBased);
	}
}