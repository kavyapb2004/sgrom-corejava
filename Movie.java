class Movie {

    static String movieName;
    static String director;
    static String hero;
    static String heroine;
    static String language;
    static double budget;
    static int releaseYear;

    public static boolean createMovie(String name, String dir, String leadHero,String leadHeroine, String lang,double movieBudget, int year) {

        boolean isMovieCreated = false;

        boolean isNameValid = false;
        boolean isDirectorValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isLanguageValid = false;
        boolean isBudgetValid = false;
        boolean isYearValid = false;

        if(name != null && !name.isEmpty()) {
            movieName = name;
            isNameValid = true;
        } else {
            System.out.println("Movie name not valid");
        }

        if(dir != null && !dir.isEmpty()) {
            director = dir;
            isDirectorValid = true;
        } else {
            System.out.println("Director not valid");
        }

        if(leadHero != null && !leadHero.isEmpty()) {
            hero = leadHero;
            isHeroValid = true;
        } else {
            System.out.println("Hero not valid");
        }

        if(leadHeroine != null && !leadHeroine.isEmpty()) {
            heroine = leadHeroine;
            isHeroineValid = true;
        } else {
            System.out.println("Heroine not valid");
        }

        if(lang != null && !lang.isEmpty()) {
            language = lang;
            isLanguageValid = true;
        } else {
            System.out.println("Language not valid");
        }

        if(movieBudget > 0) {
            budget = movieBudget;
            isBudgetValid = true;
        } else {
            System.out.println("Budget not valid");
        }

        if(year > 1800 && year <= 2026) {
            releaseYear = year;
            isYearValid = true;
        } else {
            System.out.println("Release year not valid");
        }

        if(isNameValid && isDirectorValid && isHeroValid &&
           isHeroineValid && isLanguageValid &&
           isBudgetValid && isYearValid) {

            isMovieCreated = true;
        }

        return isMovieCreated;
    }

    public static void getMovieDetails() {
        System.out.println("Fetching Movie Details...........");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Director : " + director);
        System.out.println("Hero : " + hero);
        System.out.println("Heroine : " + heroine);
        System.out.println("Language : " + language);
        System.out.println("Budget : " + budget);
        System.out.println("Release Year : " + releaseYear);
    }
}