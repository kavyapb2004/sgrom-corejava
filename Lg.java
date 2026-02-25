class Lg {

    static String brand;
    static String model;
    static double price;
    static int capacity;
    static String type;
    static int warrantyYears;
    static boolean isInverter;
    static String color;
    static int doorCount;
    static double rating;

    public static boolean createRefrigerator(String refBrand, String refModel,double refPrice, int refCapacity,String refType, int refWarranty, boolean inverter, String refColor,int refDoorCount, double refRating) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isInverterValid = false;
        boolean isColorValid = false;
        boolean isDoorValid = false;
        boolean isRatingValid = false;

        if (refBrand != null && !refBrand.isEmpty()) {
            brand = refBrand;
            isBrandValid = true;
        } else {
            System.out.println("Brand not valid");
        }

        if (refModel != null && !refModel.isEmpty()) {
            model = refModel;
            isModelValid = true;
        } else {
            System.out.println("Model not valid");
        }

        if (refPrice > 0) {
            price = refPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if (refCapacity > 0) {
            capacity = refCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity not valid");
        }

        if (refType != null && !refType.isEmpty()) {
            type = refType;
            isTypeValid = true;
        } else {
            System.out.println("Type not valid");
        }

        if (refWarranty >= 0) {
            warrantyYears = refWarranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty not valid");
        }

        isInverter = inverter;
        isInverterValid = true;

        if (refColor != null && !refColor.isEmpty()) {
            color = refColor;
            isColorValid = true;
        } else {
            System.out.println("Color not valid");
        }

        if (refDoorCount > 0) {
            doorCount = refDoorCount;
            isDoorValid = true;
        } else {
            System.out.println("Door count not valid");
        }

        if (refRating >= 0 && refRating <= 5) {
            rating = refRating;
            isRatingValid = true;
        } else {
            System.out.println("Rating not valid");
        }

        if (isBrandValid && isModelValid && isPriceValid && isCapacityValid &&
            isTypeValid && isWarrantyValid && isInverterValid &&
            isColorValid && isDoorValid && isRatingValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getRefrigeratorDetails() {
        System.out.println("Fetching Refrigerator Details...........");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);
        System.out.println("Warranty Years : " + warrantyYears);
        System.out.println("Inverter : " + isInverter);
        System.out.println("Color : " + color);
        System.out.println("Door Count : " + doorCount);
        System.out.println("Rating : " + rating);
    }
}