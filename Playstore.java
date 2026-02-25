class Playstore {

    static String appName;
    static String developerName;
    static String category;
    static double appSize;
    static double rating;
    static int downloads;
    static boolean isFree;
    static double price;

    public static boolean createApp(String name, String developer, String appCategory, double size, double appRating,int totalDownloads, boolean free, double appPrice) {

        boolean isAppCreated = false;

        boolean isNameValid = false;
        boolean isDeveloperValid = false;
        boolean isCategoryValid = false;
        boolean isSizeValid = false;
        boolean isRatingValid = false;
        boolean isDownloadsValid = false;
        boolean isFreeValid = false;
        boolean isPriceValid = false;

        if(name != null && !name.isEmpty()) {
            appName = name;
            isNameValid = true;
        } else {
            System.out.println("App name not valid");
        }

        if(developer != null && !developer.isEmpty()) {
            developerName = developer;
            isDeveloperValid = true;
        } else {
            System.out.println("Developer name not valid");
        }

        if(appCategory != null && !appCategory.isEmpty()) {
            category = appCategory;
            isCategoryValid = true;
        } else {
            System.out.println("Category not valid");
        }

        if(size > 0) {
            appSize = size;
            isSizeValid = true;
        } else {
            System.out.println("App size not valid");
        }

        if(appRating >= 0 && appRating <= 5) {
            rating = appRating;
            isRatingValid = true;
        } else {
            System.out.println("Rating not valid");
        }

        if(totalDownloads >= 0) {
            downloads = totalDownloads;
            isDownloadsValid = true;
        } else {
            System.out.println("Downloads not valid");
        }

        isFree = free;
        isFreeValid = true;

        if(free == true) {
            price = 0;
            isPriceValid = true;
        } else if(appPrice > 0) {
            price = appPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if(isNameValid && isDeveloperValid && isCategoryValid && isSizeValid &&
           isRatingValid && isDownloadsValid && isFreeValid && isPriceValid) {

            isAppCreated = true;
        }

        return isAppCreated;
    }

    public static void getAppDetails() {
        System.out.println("Fetching App Details...........");
        System.out.println("App Name : " + appName);
        System.out.println("Developer : " + developerName);
        System.out.println("Category : " + category);
        System.out.println("Size (MB) : " + appSize);
        System.out.println("Rating : " + rating);
        System.out.println("Downloads : " + downloads);
        System.out.println("Is Free : " + isFree);
        System.out.println("Price : " + price);
    }
}