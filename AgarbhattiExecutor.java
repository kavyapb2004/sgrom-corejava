class AgarbhattiExecutor{

	public static void main(String[] args){
	
	
	    Agarbhatti agarbatti = new Agarbhatti();
	
	    agarbatti.brandName = "Cycle Pure";
        String brandName = agarbatti.brandName;

        agarbatti.fragrance = "Sandalwood";
        String fragrance = agarbatti.fragrance;

        agarbatti.price = 60.00;
        double price = agarbatti.price;

        agarbatti.sticksCount = 40;
        int sticksCount = agarbatti.sticksCount;

        agarbatti.isAvailable = true;
        boolean isAvailable = agarbatti.isAvailable;

        agarbatti.isLongLasting = true;
        boolean isLongLasting = agarbatti.isLongLasting;
		
		
        System.out.println("Agarbhatti");
	    System.out.println("Brand Name: " + brandName);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Price: " + price);
        System.out.println("Sticks Count: " + sticksCount);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Long Lasting: " + isLongLasting);
	}
}