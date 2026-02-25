class Eatsure {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "HyderabadiDumBiryani") { price = 299; return price; }
        else if (foodName == "LucknowiBiryani") { price = 289; return price; }
        else if (foodName == "KolkataBiryani") { price = 279; return price; }
        else if (foodName == "AndhraChickenBiryani") { price = 319; return price; }
        else if (foodName == "MalabarBiryani") { price = 309; return price; }
        else if (foodName == "ButterChickenMeal") { price = 349; return price; }
        else if (foodName == "RajmaChawal") { price = 189; return price; }
        else if (foodName == "CholeBhature") { price = 199; return price; }
        else if (foodName == "DalMakhaniMeal") { price = 229; return price; }
        else if (foodName == "KadhaiPaneerMeal") { price = 249; return price; }

        else if (foodName == "FishCurryMeal") { price = 329; return price; }
        else if (foodName == "PrawnBiryani") { price = 369; return price; }
        else if (foodName == "ChickenKeema") { price = 289; return price; }
        else if (foodName == "MuttonRoganJosh") { price = 399; return price; }
        else if (foodName == "VegKoftaCurry") { price = 219; return price; }
        else if (foodName == "PalakPaneerMeal") { price = 239; return price; }
        else if (foodName == "BhindiMasalaMeal") { price = 199; return price; }
        else if (foodName == "BainganBhartaMeal") { price = 209; return price; }
        else if (foodName == "PaneerButterMasalaMeal") { price = 259; return price; }
        else if (foodName == "ChickenKolhapuri") { price = 319; return price; }

        else if (foodName == "VegFriedRiceMeal") { price = 189; return price; }
        else if (foodName == "ChickenFriedRiceMeal") { price = 229; return price; }
        else if (foodName == "EggFriedRiceMeal") { price = 209; return price; }
        else if (foodName == "SchezwanNoodlesVeg") { price = 199; return price; }
        else if (foodName == "SchezwanNoodlesChicken") { price = 239; return price; }
        else if (foodName == "HakkaNoodlesVeg") { price = 189; return price; }
        else if (foodName == "HakkaNoodlesChicken") { price = 229; return price; }
        else if (foodName == "VegSpringRolls") { price = 179; return price; }
        else if (foodName == "ChickenSpringRolls") { price = 219; return price; }
        else if (foodName == "GobiManchurianDry") { price = 199; return price; }

        else if (foodName == "ChickenManchurianGravy") { price = 249; return price; }
        else if (foodName == "VegChowmein") { price = 179; return price; }
        else if (foodName == "ChickenChowmein") { price = 219; return price; }
        else if (foodName == "PaneerNoodles") { price = 209; return price; }
        else if (foodName == "EggNoodles") { price = 199; return price; }
        else if (foodName == "MasalaKhichdi") { price = 169; return price; }
        else if (foodName == "CurdRiceMeal") { price = 159; return price; }
        else if (foodName == "SambarRiceMeal") { price = 169; return price; }
        else if (foodName == "RasamRiceMeal") { price = 159; return price; }
        else if (foodName == "JeeraAlooMeal") { price = 179; return price; }

        else if (foodName == "StuffedParathaMeal") { price = 199; return price; }
        else if (foodName == "PaneerBhunaMeal") { price = 239; return price; }
        else if (foodName == "ChickenHandiMeal") { price = 299; return price; }
        else if (foodName == "MethiChickenMeal") { price = 309; return price; }
        else if (foodName == "EggMasalaMeal") { price = 229; return price; }
        else if (foodName == "FishFryMeal") { price = 349; return price; }
        else if (foodName == "VegStewMeal") { price = 189; return price; }
        else if (foodName == "ChickenStewMeal") { price = 279; return price; }
        else if (foodName == "PaneerWrapMeal") { price = 209; return price; }
        else if (foodName == "ChickenWrapMeal") { price = 249; return price; }

        else if (foodName == "VegComboBox") { price = 299; return price; }
        else if (foodName == "NonVegComboBox") { price = 399; return price; }
        else if (foodName == "FamilyBiryaniPack") { price = 599; return price; }
        else if (foodName == "FamilyMealBox") { price = 649; return price; }
        else if (foodName == "FestivalSpecialThali") { price = 499; return price; }

        else {
            System.out.println("Food not available in Eatsure");
            return price;
        }
    }
	public static double search(String foodName,int quantity) {

        double price = 0.0;

        if (foodName == "HyderabadiDumBiryani") { price = 299 * quantity ; return price; }
        else if (foodName == "LucknowiBiryani") { price = 289 * quantity; return price; }
        else if (foodName == "KolkataBiryani") { price = 279 * quantity; return price; }
        else if (foodName == "AndhraChickenBiryani") { price = 319 * quantity; return price; }
        else if (foodName == "MalabarBiryani") { price = 309 * quantity; return price; }
        else if (foodName == "ButterChickenMeal") { price = 349 * quantity; return price; }
        else if (foodName == "RajmaChawal") { price = 189 * quantity; return price; }
        else if (foodName == "CholeBhature") { price = 199 * quantity; return price; }
        else if (foodName == "DalMakhaniMeal") { price = 229 * quantity; return price; }
        else if (foodName == "KadhaiPaneerMeal") { price = 249 * quantity; return price; }

        else if (foodName == "FishCurryMeal") { price = 329 * quantity; return price; }
        else if (foodName == "PrawnBiryani") { price = 369 * quantity; return price; }
        else if (foodName == "ChickenKeema") { price = 289 * quantity; return price; }
        else if (foodName == "MuttonRoganJosh") { price = 399 * quantity; return price; }
        else if (foodName == "VegKoftaCurry") { price = 219 * quantity; return price; }
        else if (foodName == "PalakPaneerMeal") { price = 239 * quantity; return price; }
        else if (foodName == "BhindiMasalaMeal") { price = 199 * quantity; return price; }
        else if (foodName == "BainganBhartaMeal") { price = 209 * quantity; return price; }
        else if (foodName == "PaneerButterMasalaMeal") { price = 259 * quantity; return price; }
        else if (foodName == "ChickenKolhapuri") { price = 319 * quantity; return price; }

        else if (foodName == "VegFriedRiceMeal") { price = 189 * quantity; return price; }
        else if (foodName == "ChickenFriedRiceMeal") { price = 229 * quantity; return price; }
        else if (foodName == "EggFriedRiceMeal") { price = 209 * quantity; return price; }
        else if (foodName == "SchezwanNoodlesVeg") { price = 199 * quantity; return price; }
        else if (foodName == "SchezwanNoodlesChicken") { price = 239 * quantity; return price; }
        else if (foodName == "HakkaNoodlesVeg") { price = 189 * quantity; return price; }
        else if (foodName == "HakkaNoodlesChicken") { price = 229 * quantity; return price; }
        else if (foodName == "VegSpringRolls") { price = 179 * quantity; return price; }
        else if (foodName == "ChickenSpringRolls") { price = 219 * quantity; return price; }
        else if (foodName == "GobiManchurianDry") { price = 199 * quantity; return price; }

        else if (foodName == "ChickenManchurianGravy") { price = 249 * quantity; return price; }
        else if (foodName == "VegChowmein") { price = 179 * quantity; return price; }
        else if (foodName == "ChickenChowmein") { price = 219 * quantity; return price; }
        else if (foodName == "PaneerNoodles") { price = 209 * quantity; return price; }
        else if (foodName == "EggNoodles") { price = 199 * quantity; return price; }
        else if (foodName == "MasalaKhichdi") { price = 169 * quantity; return price; }
        else if (foodName == "CurdRiceMeal") { price = 159 * quantity; return price; }
        else if (foodName == "SambarRiceMeal") { price = 169 * quantity; return price; }
        else if (foodName == "RasamRiceMeal") { price = 159 * quantity; return price; }
        else if (foodName == "JeeraAlooMeal") { price = 179 * quantity; return price; }

        else if (foodName == "StuffedParathaMeal") { price = 199 * quantity; return price; }
        else if (foodName == "PaneerBhunaMeal") { price = 239 * quantity; return price; }
        else if (foodName == "ChickenHandiMeal") { price = 299 * quantity; return price; }
        else if (foodName == "MethiChickenMeal") { price = 309 * quantity; return price; }
        else if (foodName == "EggMasalaMeal") { price = 229 * quantity; return price; }
        else if (foodName == "FishFryMeal") { price = 349 * quantity; return price; }
        else if (foodName == "VegStewMeal") { price = 189 * quantity; return price; }
        else if (foodName == "ChickenStewMeal") { price = 279 * quantity; return price; }
        else if (foodName == "PaneerWrapMeal") { price = 209 * quantity; return price; }
        else if (foodName == "ChickenWrapMeal") { price = 249 * quantity; return price; }

        else if (foodName == "VegComboBox") { price = 299 * quantity; return price; }
        else if (foodName == "NonVegComboBox") { price = 399 * quantity; return price; }
        else if (foodName == "FamilyBiryaniPack") { price = 599 * quantity; return price; }
        else if (foodName == "FamilyMealBox") { price = 649 * quantity; return price; }
        else if (foodName == "FestivalSpecialThali") { price = 499 * quantity; return price; }

        else {
            System.out.println("Food not available in Eatsure");
            return price;
        }
    }
}
