class ColinExecutor{

	public static void main(String[] args){
	
	Colin colin = new Colin();
	
	    colin.brandName = "Colin"; //ref.value
        String brandName = colin.brandName;

        colin.fragrance = "Lemon Fresh";
        String fragrance = colin.fragrance;

        colin.price = 85.00;
        double price = colin.price;

        colin.quantityInMl = 500;
        int quantityInMl = colin.quantityInMl;

        colin.isAvailable = true;
        boolean isAvailable = colin.isAvailable;

        colin.isOutOfStock = false;
        boolean isOutOfStock = colin.isOutOfStock;
		
		
	System.out.println("colin");
	System.out.println("Brand Name: " + brandName);
    System.out.println("Fragrance: " + fragrance);
    System.out.println("Price: " + price);
    System.out.println("Quantity : " + quantityInMl);
    System.out.println("Is Available: " + isAvailable);
    System.out.println("Is Out Of Stock: " + isOutOfStock);
	}
}