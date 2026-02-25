class PlaystoreExecutor {

    public static void main(String[] args) {

        boolean createApp = Playstore.createApp( "Instagram", "Meta", "Social Media", 85.5, 4.5, 1000000000, true,0);

        Playstore.getAppDetails();
    }
}