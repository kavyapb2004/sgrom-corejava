class Dominos {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "MargheritaPizza") { price = 299; return price; }
        else if (foodName == "FarmhousePizza") { price = 399; return price; }
        else if (foodName == "PeppyPaneerPizza") { price = 379; return price; }
        else if (foodName == "VeggieSupremePizza") { price = 429; return price; }
        else if (foodName == "CheeseBurstPizza") { price = 459; return price; }
        else if (foodName == "MexicanGreenWavePizza") { price = 419; return price; }
        else if (foodName == "PaneerMakhaniPizza") { price = 439; return price; }
        else if (foodName == "IndiTandooriPaneerPizza") { price = 449; return price; }
        else if (foodName == "DominosSpecialPizza") { price = 479; return price; }
        else if (foodName == "DoubleCheeseMargherita") { price = 329; return price; }

        else if (foodName == "GarlicBreadsticks") { price = 149; return price; }
        else if (foodName == "CheesyBreadsticks") { price = 179; return price; }
        else if (foodName == "PeriPeriCheesyBread") { price = 189; return price; }
        else if (foodName == "PlainGarlicBread") { price = 129; return price; }
        else if (foodName == "CheeseDipBread") { price = 199; return price; }
        else if (foodName == "MozzarellaSticks") { price = 219; return price; }
        else if (foodName == "PaneerSticks") { price = 229; return price; }
        else if (foodName == "JalapenoPopperDip") { price = 59; return price; }
        else if (foodName == "ChickenTikkaRoll") { price = 249; return price; }
        else if (foodName == "VeggieRoll") { price = 199; return price; }

        else if (foodName == "BBQChickenWings") { price = 289; return price; }
        else if (foodName == "PeriPeriWings") { price = 269; return price; }
        else if (foodName == "HotandSpicyWings") { price = 279; return price; }
        else if (foodName == "TandooriWings") { price = 299; return price; }
        else if (foodName == "GarlicParmesanWings") { price = 309; return price; }
        else if (foodName == "CrispyChickenStrips") { price = 239; return price; }
        else if (foodName == "PeriPeriChickenStrips") { price = 249; return price; }
        else if (foodName == "ChickenPopcorn") { price = 259; return price; }
        else if (foodName == "SpicyPopcorn") { price = 249; return price; }
        else if (foodName == "VegPopcorn") { price = 219; return price; }

        else if (foodName == "DominosVegPasta") { price = 299; return price; }
        else if (foodName == "DominosRedSaucePasta") { price = 319; return price; }
        else if (foodName == "DominosWhiteSaucePasta") { price = 329; return price; }
        else if (foodName == "DominosAlfredoPasta") { price = 349; return price; }
        else if (foodName == "CheeseCornPasta") { price = 299; return price; }
        else if (foodName == "VegLasagnaDominos") { price = 359; return price; }
        else if (foodName == "ChickenLasagnaDominos") { price = 389; return price; }
        else if (foodName == "VegSupremePasta") { price = 339; return price; }
        else if (foodName == "TandooriPasta") { price = 369; return price; }
        else if (foodName == "PeriPeriPasta") { price = 359; return price; }

        else if (foodName == "VanillaShake") { price = 129; return price; }
        else if (foodName == "ChocolateShake") { price = 139; return price; }
        else if (foodName == "StrawberryShake") { price = 149; return price; }
        else if (foodName == "ColdCoffeeDominos") { price = 119; return price; }
        else if (foodName == "IcedTeaDominos") { price = 99; return price; }
        else if (foodName == "SoftDrinkCan") { price = 79; return price; }
        else if (foodName == "MineralWaterBottle") { price = 49; return price; }
        else if (foodName == "ChocolateBrownieDominos") { price = 159; return price; }
        else if (foodName == "OreoCheesecakeDominos") { price = 189; return price; }
        else if (foodName == "BlueberryCheesecakeDominos") { price = 199; return price; }

        else {
            System.out.println("Food not available in Dominos");
            return price;
        }
    }
	public static double search(String foodName,int quantity) {

        double price = 0.0;

        if (foodName == "MargheritaPizza") { price = 299 * quantity; return price; }
        else if (foodName == "FarmhousePizza") { price = 399 * quantity; return price; }
        else if (foodName == "PeppyPaneerPizza") { price = 379 * quantity; return price; }
        else if (foodName == "VeggieSupremePizza") { price = 429 * quantity; return price; }
        else if (foodName == "CheeseBurstPizza") { price = 459 * quantity; return price; }
        else if (foodName == "MexicanGreenWavePizza") { price = 419 * quantity; return price; }
        else if (foodName == "PaneerMakhaniPizza") { price = 439 * quantity; return price; }
        else if (foodName == "IndiTandooriPaneerPizza") { price = 449 * quantity; return price; }
        else if (foodName == "DominosSpecialPizza") { price = 479 * quantity; return price; }
        else if (foodName == "DoubleCheeseMargherita") { price = 329 * quantity; return price; }

        else if (foodName == "GarlicBreadsticks") { price = 149 * quantity; return price; }
        else if (foodName == "CheesyBreadsticks") { price = 179 * quantity; return price; }
        else if (foodName == "PeriPeriCheesyBread") { price = 189 * quantity; return price; }
        else if (foodName == "PlainGarlicBread") { price = 129 * quantity; return price; }
        else if (foodName == "CheeseDipBread") { price = 199 * quantity; return price; }
        else if (foodName == "MozzarellaSticks") { price = 219 * quantity; return price; }
        else if (foodName == "PaneerSticks") { price = 229 * quantity; return price; }
        else if (foodName == "JalapenoPopperDip") { price = 59 * quantity; return price; }
        else if (foodName == "ChickenTikkaRoll") { price = 249 * quantity; return price; }
        else if (foodName == "VeggieRoll") { price = 199 * quantity; return price; }

        else if (foodName == "BBQChickenWings") { price = 289 * quantity; return price; }
        else if (foodName == "PeriPeriWings") { price = 269 * quantity; return price; }
        else if (foodName == "HotandSpicyWings") { price = 279 * quantity; return price; }
        else if (foodName == "TandooriWings") { price = 299 * quantity; return price; }
        else if (foodName == "GarlicParmesanWings") { price = 309 * quantity; return price; }
        else if (foodName == "CrispyChickenStrips") { price = 239 * quantity; return price; }
        else if (foodName == "PeriPeriChickenStrips") { price = 249 * quantity; return price; }
        else if (foodName == "ChickenPopcorn") { price = 259 * quantity; return price; }
        else if (foodName == "SpicyPopcorn") { price = 249 * quantity; return price; }
        else if (foodName == "VegPopcorn") { price = 219 * quantity; return price; }

        else if (foodName == "DominosVegPasta") { price = 299 * quantity; return price; }
        else if (foodName == "DominosRedSaucePasta") { price = 319 * quantity; return price; }
        else if (foodName == "DominosWhiteSaucePasta") { price = 329 * quantity; return price; }
        else if (foodName == "DominosAlfredoPasta") { price = 349 * quantity; return price; }
        else if (foodName == "CheeseCornPasta") { price = 299 * quantity; return price; }
        else if (foodName == "VegLasagnaDominos") { price = 359 * quantity; return price; }
        else if (foodName == "ChickenLasagnaDominos") { price = 389 * quantity; return price; }
        else if (foodName == "VegSupremePasta") { price = 339 * quantity; return price; }
        else if (foodName == "TandooriPasta") { price = 369 * quantity; return price; }
        else if (foodName == "PeriPeriPasta") { price = 359 * quantity; return price; }

        else if (foodName == "VanillaShake") { price = 129 * quantity; return price; }
        else if (foodName == "ChocolateShake") { price = 139 * quantity; return price; }
        else if (foodName == "StrawberryShake") { price = 149 * quantity; return price; }
        else if (foodName == "ColdCoffeeDominos") { price = 119 * quantity; return price; }
        else if (foodName == "IcedTeaDominos") { price = 99 * quantity; return price; }
        else if (foodName == "SoftDrinkCan") { price = 79 * quantity; return price; }
        else if (foodName == "MineralWaterBottle") { price = 49 * quantity; return price; }
        else if (foodName == "ChocolateBrownieDominos") { price = 159 * quantity; return price; }
        else if (foodName == "OreoCheesecakeDominos") { price = 189 * quantity; return price; }
        else if (foodName == "BlueberryCheesecakeDominos") { price = 199 * quantity; return price; }

        else {
            System.out.println("Food not available in Dominos");
            return price;
        }
    }
}
