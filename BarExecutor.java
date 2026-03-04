class BarExecutor{

	public static void main(String[] args){
	
	
	Bar bar = new Bar();
	bar.areaName = "ckm";
	String areaName = bar.areaName;
	
	bar.barName = "rakshitha win";
	String barName = bar.barName;
	
	bar.brand = "Kingfisher";
	String brand = bar.brand;
	
    bar.price = 300.00;
    double price = bar.price;
	
    bar.isOpen = true;
    boolean isOpen = bar.isOpen;
	
    bar.isClosed = true;
    boolean isClosed = bar.isClosed ;


	
	System.out.println("bar");
	System.out.println("bar area is :" + areaName);
	System.out.println("bar name is :" + barName);
	System.out.println("bar brand is :" + brand);
	System.out.println("bar brand price :" + price);
	System.out.println("bar is open : " + isOpen);
	System.out.println("bar is closed :" +isClosed);
	
	}
}