class MysoreSandalSoapExecutor{

	public static void main(String[] mysore){
	
	MysoreSandalSoap soap = new MysoreSandalSoap();
	
	   soap.brandName = "Mysore Sandal Soap";
        String brandName = soap.brandName;

        soap.fragrance = "Pure Sandalwood";
        String fragrance = soap.fragrance;

        soap.price = 45.00;
        double price = soap.price;

        soap.weightInGrams = 125;
        int weightInGrams = soap.weightInGrams;

        soap.isAvailable = true;
        boolean isAvailable = soap.isAvailable;

        soap.isOriginal = true;
        boolean isOriginal = soap.isOriginal;
		
	    System.out.println("mysore sandal soap");
	    System.out.println("Brand Name: " + brandName);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Price: " + price);
        System.out.println("Weight (grams): " + weightInGrams);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Original: " + isOriginal);
	
	
	}
}