class FoodExecutor {

    public static void main(String[] args) {

        boolean createFood = Food.createFood(
                "Biryani",
                250.0,
                "Non-Veg",
                2,
                "Meghana Foods"
        );

        Food.getFoodDetails();
    }
}