class Forever24 {

    static String brandName;
    static String clothType;
    static String size;
    static String color;
    static double price;
    static String material;
    static String gender;
    static boolean isDiscountAvailable;
    static double discountPercentage;
    static int stockAvailable;
    static String countryOfOrigin;
    static String style;

    public static boolean createCloth(String brand, String type, String clothSize, String clothColor, double clothPrice, String clothMaterial, String clothGender,boolean discountAvailable, double discountPercent,int stock, String originCountry, String clothStyle) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isMaterialValid = false;
        boolean isGenderValid = false;
        boolean isDiscountValid = false;
        boolean isDiscountPercentValid = false;
        boolean isStockValid = false;
        boolean isOriginValid = false;
        boolean isStyleValid = false;

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            isBrandValid = true;
        } else {
            System.out.println("Brand not valid");
        }

        if (type != null && !type.isEmpty()) {
            clothType = type;
            isTypeValid = true;
        } else {
            System.out.println("Cloth type not valid");
        }

        if (clothSize != null && !clothSize.isEmpty()) {
            size = clothSize;
            isSizeValid = true;
        } else {
            System.out.println("Size not valid");
        }

        if (clothColor != null && !clothColor.isEmpty()) {
            color = clothColor;
            isColorValid = true;
        } else {
            System.out.println("Color not valid");
        }

        if (clothPrice > 0) {
            price = clothPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if (clothMaterial != null && !clothMaterial.isEmpty()) {
            material = clothMaterial;
            isMaterialValid = true;
        } else {
            System.out.println("Material not valid");
        }

        if (clothGender != null && !clothGender.isEmpty()) {
            gender = clothGender;
            isGenderValid = true;
        } else {
            System.out.println("Gender not valid");
        }

        isDiscountAvailable = discountAvailable;
        isDiscountValid = true;

        if (discountPercent >= 0 && discountPercent <= 100) {
            discountPercentage = discountPercent;
            isDiscountPercentValid = true;
        } else {
            System.out.println("Discount percentage not valid");
        }

        if (stock >= 0) {
            stockAvailable = stock;
            isStockValid = true;
        } else {
            System.out.println("Stock not valid");
        }

        if (originCountry != null && !originCountry.isEmpty()) {
            countryOfOrigin = originCountry;
            isOriginValid = true;
        } else {
            System.out.println("Country of origin not valid");
        }

        if (clothStyle != null && !clothStyle.isEmpty()) {
            style = clothStyle;
            isStyleValid = true;
        } else {
            System.out.println("Style not valid");
        }

        if (isBrandValid && isTypeValid && isSizeValid && isColorValid &&
            isPriceValid && isMaterialValid && isGenderValid &&
            isDiscountValid && isDiscountPercentValid && isStockValid &&
            isOriginValid && isStyleValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getCloth() {
        System.out.println("Fetching Cloth Details...........");
        System.out.println("Brand Name : " + brandName);
        System.out.println("Cloth Type : " + clothType);
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Material : " + material);
        System.out.println("Gender : " + gender);
        System.out.println("Discount Available : " + isDiscountAvailable);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Stock Available : " + stockAvailable);
        System.out.println("Country Of Origin : " + countryOfOrigin);
        System.out.println("Style : " + style);
    }
}