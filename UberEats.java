class UberEats {

    public static double search(String foodName,int quantity) {

        double price = 0.0;

        if (foodName == "BBQPork") { price = 305 * quantity; return price; }
        else if (foodName == "GrilledSalmon") { price = 345 * quantity; return price; }
        else if (foodName == "BeefSteak") { price = 415* quantity; return price; }
        else if (foodName == "ChickenAlfredo") { price = 275 * quantity; return price; }
        else if (foodName == "ShrimpPasta") { price = 325 * quantity; return price; }
        else if (foodName == "VeggieWrap") { price = 165 * quantity; return price; }
        else if (foodName == "TofuStirFry") { price = 225 * quantity; return price; }
        else if (foodName == "GrilledChickenSalad") { price = 235 * quantity; return price; }
        else if (foodName == "CaesarSalad") { price = 185 * quantity; return price; }
        else if (foodName == "ClubSandwich") { price = 195 * quantity; return price; }
        else if (foodName == "BBQChickenPizza") { price = 365 * quantity; return price; }
        else if (foodName == "StuffedCrustPizza") { price = 395 * quantity; return price; }
        else if (foodName == "SeafoodPlatter") { price = 455 * quantity; return price; }
        else if (foodName == "LobsterRoll") { price = 475 * quantity; return price; }
        else if (foodName == "AvocadoToast") { price = 145 * quantity; return price; }
        else if (foodName == "ChickenQuesadilla") { price = 285 * quantity; return price; }
        else if (foodName == "BeefTaco") { price = 255 * quantity; return price; }
        else if (foodName == "ChickenFajita") { price = 295 * quantity; return price; }
        else if (foodName == "VeggieBurger") { price = 175 * quantity; return price; }
        else if (foodName == "LoadedFries") { price = 155 * quantity; return price; }
        else if (foodName == "ChickenWings") { price = 265 * quantity; return price; }
        else if (foodName == "BBQRibs") { price = 385 * quantity; return price; }
        else if (foodName == "GarlicShrimp") { price = 315 * quantity; return price; }
        else if (foodName == "SpinachLasagna") { price = 305 * quantity; return price; }
        else if (foodName == "MargaritaFlatbread") { price = 245 * quantity; return price; }
        else if (foodName == "TeriyakiChicken") { price = 275 * quantity; return price; }
        else if (foodName == "SushiRoll") { price = 295 * quantity; return price; }
        else if (foodName == "TempuraPrawns") { price = 335 * quantity; return price; }
        else if (foodName == "RamenBowl") { price = 225 * quantity; return price; }
        else if (foodName == "PhoSoup") { price = 205 * quantity; return price; }
        else if (foodName == "TurkeySandwich") { price = 185 * quantity; return price; }
        else if (foodName == "GreekSalad") { price = 175 * quantity; return price; }
        else if (foodName == "FalafelWrap") { price = 165 * quantity; return price; }
        else if (foodName == "HummusPlatter") { price = 155 * quantity; return price; }
        else if (foodName == "ChickenGyro") { price = 235 * quantity; return price; }
        else if (foodName == "BeefBurger") { price = 295 * quantity; return price; }
        else if (foodName == "DoubleCheeseBurger") { price = 325 * quantity; return price; }
        else if (foodName == "BaconHotdog") { price = 215 * quantity; return price; }
        else if (foodName == "MacaroniBake") { price = 205 * quantity; return price; }
        else if (foodName == "ChickenPotPie") { price = 245 * quantity ; return price; }
        else if (foodName == "Tiramisu") { price = 185 * quantity; return price; }
        else if (foodName == "Cheesecake") { price = 195 * quantity; return price; }
        else if (foodName == "ChocolateMousse") { price = 175 * quantity; return price; }
        else if (foodName == "ApplePie") { price = 165 * quantity; return price; }
        else if (foodName == "BananaSplit") { price = 155 * quantity; return price; }
        else if (foodName == "CaramelPudding") { price = 145 * quantity; return price; }
        else if (foodName == "IcedLatte") { price = 125 * quantity; return price; }
        else if (foodName == "Cappuccino") { price = 135 * quantity; return price; }
        else if (foodName == "Espresso") { price = 115 * quantity; return price; }
        else if (foodName == "MintLemonade") { price = 105 * quantity; return price; }
        else if (foodName == "OrangeJuice") { price = 95 * quantity; return price; }
        else if (foodName == "WatermelonJuice") { price = 85 * quantity; return price; }
        else if (foodName == "ProteinShake") { price = 165 * quantity; return price; }
        else if (foodName == "EnergyDrink") { price = 145 * quantity; return price; }
        else if (foodName == "VegComboMeal") { price = 355 * quantity; return price; }

        else {
            System.out.println("Food not available in UberEats");
            return price;
        }
    }
}
