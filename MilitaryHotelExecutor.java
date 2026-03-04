class MilitaryHotelExecutor{
	public static void main(String[] args){
	
	MilitaryHotel hotel = new MilitaryHotel(); //className ref = new className
	hotel.hotelName = "rajanna miltry hotel";
	String hotelName = hotel.hotelName;
	
	hotel.location = "rajaji nagar";
	String location = hotel.location;
	
	hotel.priceAvarage = 500;
	double priceAvarage = hotel.priceAvarage;
	
	hotel.isNonVegAvailable = true;
	boolean isNonVegAvailable = hotel.isNonVegAvailable;
	
	
	
	System.out.println("Military hotel");
	System.out.println("the hotel name is :" + hotelName );
	System.out.println("the location is :" + location);
	System.out.println("the avarage price is :" + priceAvarage);
	System.out.println("is non veg available :" + isNonVegAvailable);
	
	}
}