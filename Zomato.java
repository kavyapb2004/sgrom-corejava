class Zomato {

    public static double search(String foodName,int quantity) {

        double price = 0.0;

        if (foodName == "Burger") {
            price = 99 * quantity;
            return price;
        }
        else if (foodName == "Pizza") {
            price = 249  * quantity;
            return price;
        }
        else if (foodName == "Pasta") {
            price = 180  * quantity;
            return price;
        }
        else if (foodName == "Momos") {
            price = 120  * quantity;
            return price;
        }
        else if (foodName == "Dosa") {
            price = 60 * quantity;
            return price;
        }
        else if (foodName == "Idli") {
            price = 40 * quantity;
            return price;
        }
        else if (foodName == "Biryani") {
            price = 220  * quantity;
            return price;
        }
        else if (foodName == "FriedRice") {
            price = 140  * quantity;
            return price;
        }
        else if (foodName == "Noodles") {
            price = 130  * quantity;
            return price;
        }
        else if (foodName == "Sandwich") {
            price = 110 * quantity;
            return price;
        }
        else if (foodName == "Panipuri") {
            price = 50  * quantity;
            return price;
        }
        else if (foodName == "VadaPav") {
            price = 35  * quantity;
            return price;
        }
        else if (foodName == "Samosa") {
            price = 25  * quantity;
            return price;
        }
        else if (foodName == "Manchurian") {
            price = 150  * quantity;
            return price;
        }
        else if (foodName == "TandooriRoti") {
            price = 20  * quantity;
            return price;
        }
        else if (foodName == "ButterNaan") {
            price = 30  * quantity;
            return price;
        }
        else if (foodName == "PaneerButterMasala") {
            price = 240  * quantity;
            return price;
        }
        else if (foodName == "CholeBhature") {
            price = 130  * quantity;
            return price;
        }
        else if (foodName == "RajmaRice") {
            price = 120  * quantity;
            return price;
        }
        else if (foodName == "Puliyogare") {
            price = 80 * quantity;
            return price;
        }
        else if (foodName == "CurdRice") {
            price = 70  * quantity ;
            return price;
        }
        else if (foodName == "Upma") {
            price = 45  * quantity;
            return price;
        }
        else if (foodName == "Poori") {
            price = 60  * quantity;
            return price;
        }
        else if (foodName == "Chapathi") {
            price = 25 * quantity;
            return price;
        }
        else if (foodName == "MushroomMasala") {
            price = 210  * quantity;
            return price;
        }
        else if (foodName == "VegMeals") {
            price = 180 * quantity;
            return price;
        }
        else if (foodName == "NonVegMeals") {
            price = 250  * quantity;
            return price;
        }
        else if (foodName == "FishFry") {
            price = 260  * quantity;
            return price;
        }
        else if (foodName == "ChickenFry") {
            price = 240  * quantity;
            return price;
        }
        else if (foodName == "MuttonCurry") {
            price = 320  * quantity;
            return price;
        }
        else if (foodName == "GobiManchurian") {
            price = 150  * quantity;
            return price;
        }
        else if (foodName == "SpringRoll") {
            price = 100 * quantity;
            return price;
        }
        else if (foodName == "Kebab") {
            price = 230  * quantity;
            return price;
        }
        else if (foodName == "Shawarma") {
            price = 160 * quantity;
            return price;
        }
        else if (foodName == "Falooda") {
            price = 120  * quantity;
            return price;
        }
        else if (foodName == "Milkshake") {
            price = 90  * quantity;
            return price;
        }
        else if (foodName == "Brownie") {
            price = 85 * quantity;
            return price;
        }
        else if (foodName == "Donut") {
            price = 75  * quantity;
            return price;
        }
        else if (foodName == "Cupcake") {
            price = 60  * quantity;
            return price;
        }
        else if (foodName == "HotDog") {
            price = 140  * quantity;
            return price;
        }
        else if (foodName == "Tacos") {
            price = 170  * quantity;
            return price;
        }
        else if (foodName == "Nachos") {
            price = 150  * quantity;
            return price;
        }
        else if (foodName == "MacAndCheese") {
            price = 190 * quantity;
            return price;
        }
        else if (foodName == "Lasagna") {
            price = 260  * quantity;
            return price;
        }
        else if (foodName == "PavBhaji") {
            price = 110 * quantity;
            return price;
        }
        else if (foodName == "BhelPuri") {
            price = 60 * quantity;
            return price;
        }
        else if (foodName == "Kachori") {
            price = 35 * quantity;
            return price;
        }
        else if (foodName == "Rasgulla") {
            price = 40 * quantity;
            return price;
        }
        else if (foodName == "GulabJamun") {
            price = 45  * quantity;
            return price;
        }
        else if (foodName == "Jalebi") {
            price = 50 * quantity;
            return price;
        }
        else if (foodName == "Kheer") {
            price = 70  * quantity;
            return price;
        }
        else if (foodName == "Payasam") {
            price = 75 * quantity;
            return price;
        }
        else if (foodName == "FruitSalad") {
            price = 90 * quantity;
            return price;
        }
        else if (foodName == "Soup") {
            price = 80 * quantity;
            return price;
        }
        else if (foodName == "Rice"){
			price = 15  * quantity;
			return price;
		}
		else{
            System.out.println("Food not available");
            return price;
        }
    }
	public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "Burger") {
            price = 99;
            return price;
        }
        else if (foodName == "Pizza") {
            price = 249;
            return price;
        }
        else if (foodName == "Pasta") {
            price = 180;
            return price;
        }
        else if (foodName == "Momos") {
            price = 120;
            return price;
        }
        else if (foodName == "Dosa") {
            price = 60;
            return price;
        }
        else if (foodName == "Idli") {
            price = 40;
            return price;
        }
        else if (foodName == "Biryani") {
            price = 220;
            return price;
        }
        else if (foodName == "FriedRice") {
            price = 140;
            return price;
        }
        else if (foodName == "Noodles") {
            price = 130;
            return price;
        }
        else if (foodName == "Sandwich") {
            price = 110;
            return price;
        }
        else if (foodName == "Panipuri") {
            price = 50;
            return price;
        }
        else if (foodName == "VadaPav") {
            price = 35;
            return price;
        }
        else if (foodName == "Samosa") {
            price = 25;
            return price;
        }
        else if (foodName == "Manchurian") {
            price = 150;
            return price;
        }
        else if (foodName == "TandooriRoti") {
            price = 20;
            return price;
        }
        else if (foodName == "ButterNaan") {
            price = 30;
            return price;
        }
        else if (foodName == "PaneerButterMasala") {
            price = 240;
            return price;
        }
        else if (foodName == "CholeBhature") {
            price = 130;
            return price;
        }
        else if (foodName == "RajmaRice") {
            price = 120;
            return price;
        }
        else if (foodName == "Puliyogare") {
            price = 80;
            return price;
        }
        else if (foodName == "CurdRice") {
            price = 70;
            return price;
        }
        else if (foodName == "Upma") {
            price = 45;
            return price;
        }
        else if (foodName == "Poori") {
            price = 60;
            return price;
        }
        else if (foodName == "Chapathi") {
            price = 25;
            return price;
        }
        else if (foodName == "MushroomMasala") {
            price = 210;
            return price;
        }
        else if (foodName == "VegMeals") {
            price = 180;
            return price;
        }
        else if (foodName == "NonVegMeals") {
            price = 250;
            return price;
        }
        else if (foodName == "FishFry") {
            price = 260;
            return price;
        }
        else if (foodName == "ChickenFry") {
            price = 240;
            return price;
        }
        else if (foodName == "MuttonCurry") {
            price = 320;
            return price;
        }
        else if (foodName == "GobiManchurian") {
            price = 150;
            return price;
        }
        else if (foodName == "SpringRoll") {
            price = 100;
            return price;
        }
        else if (foodName == "Kebab") {
            price = 230;
            return price;
        }
        else if (foodName == "Shawarma") {
            price = 160;
            return price;
        }
        else if (foodName == "Falooda") {
            price = 120;
            return price;
        }
        else if (foodName == "Milkshake") {
            price = 90;
            return price;
        }
        else if (foodName == "Brownie") {
            price = 85;
            return price;
        }
        else if (foodName == "Donut") {
            price = 75;
            return price;
        }
        else if (foodName == "Cupcake") {
            price = 60;
            return price;
        }
        else if (foodName == "HotDog") {
            price = 140;
            return price;
        }
        else if (foodName == "Tacos") {
            price = 170;
            return price;
        }
        else if (foodName == "Nachos") {
            price = 150;
            return price;
        }
        else if (foodName == "MacAndCheese") {
            price = 190;
            return price;
        }
        else if (foodName == "Lasagna") {
            price = 260;
            return price;
        }
        else if (foodName == "PavBhaji") {
            price = 110;
            return price;
        }
        else if (foodName == "BhelPuri") {
            price = 60;
            return price;
        }
        else if (foodName == "Kachori") {
            price = 35;
            return price;
        }
        else if (foodName == "Rasgulla") {
            price = 40;
            return price;
        }
        else if (foodName == "GulabJamun") {
            price = 45;
            return price;
        }
        else if (foodName == "Jalebi") {
            price = 50;
            return price;
        }
        else if (foodName == "Kheer") {
            price = 70;
            return price;
        }
        else if (foodName == "Payasam") {
            price = 75;
            return price;
        }
        else if (foodName == "FruitSalad") {
            price = 90;
            return price;
        }
        else if (foodName == "Soup") {
            price = 80;
            return price;
        }
        else if (foodName == "Rice"){
			price = 15;
			return price;
		}
		else{
            System.out.println("Food not available");
            return price;
        }
    }
}
