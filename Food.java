class Food {

    static String foodName;
    static double price;
    static String type;
    static int quantity;
    static String restaurantName;

    public static boolean createFood(String name, double foodPrice,String foodType, int qty,String hotelName) {

        boolean isFoodCreated = false;

        boolean isNameValid = false;
        boolean isPriceValid = false;
        boolean isTypeValid = false;
        boolean isQuantityValid = false;
        boolean isRestaurantValid = false;

        if(name != null && !name.isEmpty()) {
            foodName = name;
            isNameValid = true;
        } else {
            System.out.println("Food name not valid");
        }

        if(foodPrice > 0) {
            price = foodPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if(foodType != null && !foodType.isEmpty()) {
            type = foodType;
            isTypeValid = true;
        } else {
            System.out.println("Food type not valid");
        }

        if(qty > 0) {
            quantity = qty;
            isQuantityValid = true;
        } else {
            System.out.println("Quantity not valid");
        }

        if(hotelName != null && !hotelName.isEmpty()) {
            restaurantName = hotelName;
            isRestaurantValid = true;
        } else {
            System.out.println("Restaurant name not valid");
        }

        if(isNameValid && isPriceValid && isTypeValid &&
           isQuantityValid && isRestaurantValid) {

            isFoodCreated = true;
        }

        return isFoodCreated;
    }

    public static void getFoodDetails() {
        System.out.println("Fetching Food Details...........");
        System.out.println("Food Name : " + foodName);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);
        System.out.println("Quantity : " + quantity);
        System.out.println("Restaurant Name : " + restaurantName);
    }
}