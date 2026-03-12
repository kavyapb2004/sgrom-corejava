class Cricket{

    String teamName;
    String captain;
    String coach;
    String stadium;
    String country;
    int players;
    int runs;
    int wickets;
    int overs;
    String matchType;
    int ranking;
    int wins;
    int losses;
    int draws;
    int trophies;
    String sponsor;
    String jerseyColor;
    int foundedYear;
    int budget;
    int fans;

    Cricket(){
        System.out.println("Default constructor called");
    }

    Cricket(String teamName,String captain,String coach,String stadium,String country,
            int players,int runs,int wickets,int overs,String matchType,
            int ranking,int wins,int losses,int draws,int trophies,
            String sponsor,String jerseyColor,int foundedYear,int budget,int fans){

        this.teamName=teamName;
        this.captain=captain;
        this.coach=coach;
        this.stadium=stadium;
        this.country=country;
        this.players=players;
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
        this.matchType=matchType;
        this.ranking=ranking;
        this.wins=wins;
        this.losses=losses;
        this.draws=draws;
        this.trophies=trophies;
        this.sponsor=sponsor;
        this.jerseyColor=jerseyColor;
        this.foundedYear=foundedYear;
        this.budget=budget;
        this.fans=fans;

        System.out.println("Parameterized constructor called");
    }
}