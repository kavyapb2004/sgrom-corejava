class Girias {

    static String brand;
    static String model;
    static double price;
    static int capacity;
    static String type;
    static int warrantyYears;
    static boolean isInverterTechnology;
    static String color;
    static int spinSpeed;
    static double rating;

    public static boolean createWashingMachine(String wmBrand, String wmModel, double wmPrice, int wmCapacity, String wmType, int wmWarranty, boolean inverter, String wmColor,int wmSpinSpeed, double wmRating) {
	boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isInverterValid = false;
        boolean isColorValid = false;
        boolean isSpinValid = false;
        boolean isRatingValid = false;

        if (wmBrand != null && !wmBrand.isEmpty()) {
            brand = wmBrand;
            isBrandValid = true;
        } else {
            System.out.println("Brand not valid");
        }

        if (wmModel != null && !wmModel.isEmpty()) {
            model = wmModel;
            isModelValid = true;
        } else {
            System.out.println("Model not valid");
        }

        if (wmPrice > 0) {
            price = wmPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if (wmCapacity > 0) {
            capacity = wmCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity not valid");
        }

        if (wmType != null && !wmType.isEmpty()) {
            type = wmType;
            isTypeValid = true;
        } else {
            System.out.println("Type not valid");
        }

        if (wmWarranty >= 0) {
            warrantyYears = wmWarranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty not valid");
        }

        isInverterTechnology = inverter;
        isInverterValid = true;

        if (wmColor != null && !wmColor.isEmpty()) {
            color = wmColor;
            isColorValid = true;
        } else {
            System.out.println("Color not valid");
        }

        if (wmSpinSpeed > 0) {
            spinSpeed = wmSpinSpeed;
            isSpinValid = true;
        } else {
            System.out.println("Spin speed not valid");
        }

        if (wmRating >= 0 && wmRating <= 5) {
            rating = wmRating;
            isRatingValid = true;
        } else {
            System.out.println("Rating not valid");
        }

        if (isBrandValid && isModelValid && isPriceValid && isCapacityValid &&
            isTypeValid && isWarrantyValid && isInverterValid &&
            isColorValid && isSpinValid && isRatingValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getWashingMachineDetails() {
        System.out.println("Fetching Washing Machine Details...........");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);
        System.out.println("Warranty Years : " + warrantyYears);
        System.out.println("Inverter Technology : " + isInverterTechnology);
        System.out.println("Color : " + color);
        System.out.println("Spin Speed : " + spinSpeed);
        System.out.println("Rating : " + rating);
    }
}