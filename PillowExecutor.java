class PillowExecutor{

	public static void main(String[] args){
	
	
	    Pillow pillow = new Pillow();
		
	    pillow.brandName = "SleepWell";
        String brandName = pillow.brandName;

        pillow.material = "Cotton";
        String material = pillow.material;

        pillow.price = 799.00;
        double price = pillow.price;

        pillow.size = "Medium";
        String size = pillow.size;

        pillow.isSoft = true;
        boolean isSoft = pillow.isSoft;

        pillow.isAvailable = true;
        boolean isAvailable = pillow.isAvailable;
	
	
	    System.out.println("pillow");
	    System.out.println("Brand Name: " + brandName);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Is Soft: " + isSoft);
        System.out.println("Is Available: " + isAvailable);
	
	
	}
}