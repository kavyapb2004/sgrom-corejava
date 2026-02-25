class Swiggy {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "RavaDosa") { 
		price = 65.00; 
		return price; 
		}
        else if (foodName == "MasalaDosa") {
		price = 85; 
		return price;
		}
        else if (foodName == "OnionUttapam") { 
		price = 95;
		return price;
		}
        else if (foodName == "SetDosa") { 
		price = 55;
		return price;
		}
        else if (foodName == "NeerDosa") {
		price = 105;
		return price;
		}
        else if (foodName == "TomatoSoup") { 
		price = 115; 
		return price; 
		}
        else if (foodName == "SweetCornSoup") { 
		price = 125;
		return price; 
		}
        else if (foodName == "VegBiryani") {
		price = 205;
		return price;
		}
        else if (foodName == "EggBiryani") { 
		price = 215; 
		return price; 
		}
        else if (foodName == "PrawnsFry") {
		price = 275; 
		return price;
		}
        else if (foodName == "CrabMasala") {
		price = 285;
		return price; 
		}
        else if (foodName == "Chicken65") { 
		price = 195;
		return price;
		}
        else if (foodName == "EggRoll") {
		price = 145; 
		return price;
		}
        else if (foodName == "VegRoll") { 
		price = 135;
		return price;
		}
        else if (foodName == "AlooParatha") {
		price = 155; 
		return price; 
		}
        else if (foodName == "GheeRice") {
		price = 175; 
		return price;
		}
        else if (foodName == "JeeraRice") {
		price = 165;
		return price;
		}
        else if (foodName == "LemonRice") { 
		price = 95;
		return price;
		}
        else if (foodName == "TomatoRice") { 
		price = 85;
		return price; 
		}
        else if (foodName == "CoconutRice") {
		price = 115;
		return price; 
		}
        else if (foodName == "VegPulao") {
		price = 185;
		return price; 
		}
        else if (foodName == "ChickenPulao") {
		price = 255; 
		return price;
		}
        else if (foodName == "MysorePak") {
		price = 65;
		return price; 
		}
        else if (foodName == "Laddu") {
		price = 55;
		return price;
		}
        else if (foodName == "BadamHalwa") {
		price = 145;
		return price; 
		}
        else if (foodName == "KesariBath") {
		price = 75;
		return price; 
		}
        else if (foodName == "RotiCurry") {
		price = 95;
		return price;
		}
        else if (foodName == "VegCurry") { 
		price = 155;
		return price;
		}
        else if (foodName == "ChickenCurry") { 
		price = 265;
		return price; 
		}
        else if (foodName == "MuttonBiryani") { 
		price = 355;
		return price;
		}
        else if (foodName == "PaneerTikka") {
		price = 275;
		return price;
		}
        else if (foodName == "VegTikka") { 
		price = 185; 
		return price;
		}
        else if (foodName == "ChickenTikka") { 
		price = 295;
		return price;
		}
        else if (foodName == "VegCutlet") {
		price = 85;
		return price;
		}
        else if (foodName == "ChickenCutlet") {
		price = 145;
		return price;
		}
        else if (foodName == "FrenchFries") {
		price = 125;
		return price;
		}
        else if (foodName == "CheeseBalls") {
		price = 165;
		return price; 
		}
        else if (foodName == "GarlicBread") { 
		price = 155;
		return price; 
		}
        else if (foodName == "ChocoCake") {
		price = 205;
		return price; 
		}
        else if (foodName == "VanillaCake") {
		price = 195;
		return price;
		}
        else if (foodName == "StrawberryCake") {
		price = 215;
		return price; 
		}
        else if (foodName == "BlackForestCake") {
		price = 225;
		return price;
		}
        else if (foodName == "BlueberryShake") {
		price = 135;
		return price; 
		}
        else if (foodName == "MangoShake") {
		price = 145;
		return price; 
		}
        else if (foodName == "ColdCoffee") {
		price = 115;
		return price; 
		}
        else if (foodName == "GreenTea") {
		price = 35;
		return price;
		}
        else if (foodName == "MasalaTea") {
		price = 25;
		return price;
		}
        else if (foodName == "Lassi") {
		price = 95;
		return price;
		}
        else if (foodName == "ButterMilk") { 
		price = 45;
		return price;
		}
        else if (foodName == "VegThali") {
		price = 275;
		return price; 
		}
        else if (foodName == "NonVegThali") { 
		price = 365;
		return price;
		}
        else if (foodName == "EggCurry") {
		price = 185;
		return price; 
		}
        else if (foodName == "VegManchowSoup") { 
		price = 135;
		return price; 
		}
        else if (foodName == "ChickenManchowSoup") { 
		price = 155;
		return price;
		}
        else if (foodName == "PannerRoll") { 
		price = 175;
		return price;
		}
        else {
            System.out.println("Food not available in Swiggy");
            return price;
        }
    }
	public static double search(String foodName,int quantity) {

        double price = 0.0;
		

        if (foodName == "RavaDosa") { 
		price = 65.00 * quantity; 
		return price; 
		}
        else if (foodName == "MasalaDosa") {
		price = 85 * quantity; 
		return price;
		}
        else if (foodName == "OnionUttapam") { 
		price = 95 * quantity;
		return price;
		}
        else if (foodName == "SetDosa") { 
		price = 55 * quantity;
		return price;
		}
        else if (foodName == "NeerDosa") {
		price = 105 * quantity;
		return price;
		}
        else if (foodName == "TomatoSoup") { 
		price = 115 * quantity; 
		return price; 
		}
        else if (foodName == "SweetCornSoup") { 
		price = 125 * quantity;
		return price; 
		}
        else if (foodName == "VegBiryani") {
		price = 205 * quantity ;
		return price;
		}
        else if (foodName == "EggBiryani") { 
		price = 215 * quantity ; 
		return price; 
		}
        else if (foodName == "PrawnsFry") {
		price = 275 * quantity; 
		return price;
		}
        else if (foodName == "CrabMasala") {
		price = 285 * quantity;
		return price; 
		}
        else if (foodName == "Chicken65") { 
		price = 195 * quantity;
		return price;
		}
        else if (foodName == "EggRoll") {
		price = 145 * quantity; 
		return price;
		}
        else if (foodName == "VegRoll") { 
		price = 135 * quantity;
		return price;
		}
        else if (foodName == "AlooParatha") {
		price = 155 * quantity; 
		return price; 
		}
        else if (foodName == "GheeRice") {
		price = 175 * quantity; 
		return price;
		}
        else if (foodName == "JeeraRice") {
		price = 165 * quantity;
		return price;
		}
        else if (foodName == "LemonRice") { 
		price = 95 * quantity;
		return price;
		}
        else if (foodName == "TomatoRice") { 
		price = 85 * quantity;
		return price; 
		}
        else if (foodName == "CoconutRice") {
		price = 115 * quantity;
		return price; 
		}
        else if (foodName == "VegPulao") {
		price = 185 * quantity;
		return price; 
		}
        else if (foodName == "ChickenPulao") {
		price = 255 * quantity; 
		return price;
		}
        else if (foodName == "MysorePak") {
		price = 65 * quantity;
		return price; 
		}
        else if (foodName == "Laddu") {
		price = 55 * quantity;
		return price;
		}
        else if (foodName == "BadamHalwa") {
		price = 145 * quantity;
		return price; 
		}
        else if (foodName == "KesariBath") {
		price = 75 * quantity;
		return price; 
		}
        else if (foodName == "RotiCurry") {
		price = 95 * quantity;
		return price;
		}
        else if (foodName == "VegCurry") { 
		price = 155 * quantity;
		return price;
		}
        else if (foodName == "ChickenCurry") { 
		price = 265 * quantity;
		return price; 
		}
        else if (foodName == "MuttonBiryani") { 
		price = 355 * quantity;
		return price;
		}
        else if (foodName == "PaneerTikka") {
		price = 275 * quantity;
		return price;
		}
        else if (foodName == "VegTikka") { 
		price = 185 * quantity; 
		return price;
		}
        else if (foodName == "ChickenTikka") { 
		price = 295 * quantity;
		return price;
		}
        else if (foodName == "VegCutlet") {
		price = 85 * quantity;
		return price;
		}
        else if (foodName == "ChickenCutlet") {
		price = 145 * quantity;
		return price;
		}
        else if (foodName == "FrenchFries") {
		price = 125 * quantity;
		return price;
		}
        else if (foodName == "CheeseBalls") {
		price = 165 * quantity;
		return price; 
		}
        else if (foodName == "GarlicBread") { 
		price = 155 * quantity;
		return price; 
		}
        else if (foodName == "ChocoCake") {
		price = 205 * quantity;
		return price; 
		}
        else if (foodName == "VanillaCake") {
		price = 195 * quantity;
		return price;
		}
        else if (foodName == "StrawberryCake") {
		price = 215 * quantity;
		return price; 
		}
        else if (foodName == "BlackForestCake") {
		price = 225 * quantity;
		return price;
		}
        else if (foodName == "BlueberryShake") {
		price = 135 * quantity;
		return price; 
		}
        else if (foodName == "MangoShake") {
		price = 145 * quantity;
		return price; 
		}
        else if (foodName == "ColdCoffee") {
		price = 115 * quantity;
		return price; 
		}
        else if (foodName == "GreenTea") {
		price = 35 * quantity;
		return price;
		}
        else if (foodName == "MasalaTea") {
		price = 25 * quantity;
		return price;
		}
        else if (foodName == "Lassi") {
		price = 95 * quantity;
		return price;
		}
        else if (foodName == "ButterMilk") { 
		price = 45 * quantity;
		return price;
		}
        else if (foodName == "VegThali") {
		price = 275 * quantity;
		return price; 
		}
        else if (foodName == "NonVegThali") { 
		price = 365 * quantity;
		return price;
		}
        else if (foodName == "EggCurry") {
		price = 185 * quantity;
		return price; 
		}
        else if (foodName == "VegManchowSoup") { 
		price = 135 * quantity;
		return price; 
		}
        else if (foodName == "ChickenManchowSoup") { 
		price = 155 * quantity;
		return price;
		}
        else if (foodName == "PannerRoll") { 
		price = 175 * quantity;
		return price;
		}
        else {
            System.out.println("Food not available in Swiggy");
            return price;
        }
    }
}
