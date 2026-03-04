class MatExecutor{


	public static void main(String[] args){
	
	Mat mat = new Mat();
	
	
	    mat.brandName = "Relaxo";
        String brandName = mat.brandName;

        mat.material = "Rubber";
        String material = mat.material;

        mat.price = 499.00;
        double price = mat.price;


        mat.isWaterproof = true;
        boolean isWaterproof = mat.isWaterproof;

        mat.isAvailable = true;
        boolean isAvailable = mat.isAvailable;

	    System.out.println("mat");
	    System.out.println("Brand Name: " + brandName);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Is Available: " + isAvailable);
	}
}