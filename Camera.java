class Camera {

    static String brand;
    static String model;
    static double price;
    static int megapixel;
    static String lensType;
    static boolean isWifiAvailable;
    static boolean is4KSupported;
    static int batteryCapacity;
    static String color;
    static double weight;

    public static boolean createCamera(String camBrand, String camModel, double camPrice,int camMegapixel, String camLensType,boolean wifi, boolean support4K,int battery, String camColor, double camWeight) {

        boolean isCameraCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isMegapixelValid = false;
        boolean isLensValid = false;
        boolean isWifiValid = false;
        boolean is4KValid = false;
        boolean isBatteryValid = false;
        boolean isColorValid = false;
        boolean isWeightValid = false;

        if (camBrand != null && !camBrand.isEmpty()) {
            brand = camBrand;
            isBrandValid = true;
        } else {
            System.out.println("Brand not valid");
        }

        if (camModel != null && !camModel.isEmpty()) {
            model = camModel;
            isModelValid = true;
        } else {
            System.out.println("Model not valid");
        }

        if (camPrice > 0) {
            price = camPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if (camMegapixel > 0) {
            megapixel = camMegapixel;
            isMegapixelValid = true;
        } else {
            System.out.println("Megapixel not valid");
        }

        if (camLensType != null && !camLensType.isEmpty()) {
            lensType = camLensType;
            isLensValid = true;
        } else {
            System.out.println("Lens type not valid");
        }

        isWifiAvailable = wifi;
        isWifiValid = true;

        is4KSupported = support4K;
        is4KValid = true;

        if (battery > 0) {
            batteryCapacity = battery;
            isBatteryValid = true;
        } else {
            System.out.println("Battery capacity not valid");
        }

        if (camColor != null && !camColor.isEmpty()) {
            color = camColor;
            isColorValid = true;
        } else {
            System.out.println("Color not valid");
        }

        if (camWeight > 0) {
            weight = camWeight;
            isWeightValid = true;
        } else {
            System.out.println("Weight not valid");
        }

        if (isBrandValid && isModelValid && isPriceValid && isMegapixelValid &&
            isLensValid && isWifiValid && is4KValid && isBatteryValid &&
            isColorValid && isWeightValid) {

            isCameraCreated = true;
        }

        return isCameraCreated;
    }

    public static void getCameraDetails() {
        System.out.println("Fetching Camera Details...........");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Megapixel : " + megapixel);
        System.out.println("Lens Type : " + lensType);
        System.out.println("WiFi Available : " + isWifiAvailable);
        System.out.println("4K Supported : " + is4KSupported);
        System.out.println("Battery Capacity : " + batteryCapacity);
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
    }
}