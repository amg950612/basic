
import java.util.Random;

public class HockeyMatch implements Hockey {

    private static int homeTeamScore = 0;
    private static int visitingTeamScore = 0;
    private static int homeTeamPenalties = 0;
    private static int visitingTeamPenalties = 0;
    private static String homeTeam;
    private static String visitingTeam;

    public static void main(String[] args) throws InterruptedException {
        HockeyMatch match = new HockeyMatch();

        homeTeam = match.setHomeTeam("USA");
        visitingTeam = match.setVisitingTeam("Brazil");

        System.out.println("Today is a hockey match between: " + homeTeam + " and " + visitingTeam + " !!!");

        Thread.sleep(2000);

        System.out.println("First tierce: ");

        match.counting("first");

        match.teamsScoredFirstTierce();

        match.endOfTierce("First");

        Thread.sleep(2000);

        System.out.println("Second tierce: ");

        match.counting("second");

        match.teamsScoredSecondTierce();

        match.endOfTierce("Second");

        Thread.sleep(2000);

        System.out.println("Third tierce: ");

        match.counting("third");

        match.teamsScoredThirdTierce();

        match.endOfTierce("Third");

        Thread.sleep(2000);

        match.matchResult();

    }

    @Override
    public String setHomeTeam(String name) {

        return name;
    }

    @Override
    public String setVisitingTeam(String name) {

        return name;
    }

    public void counting(String time)  {

        try{
            if(time.equals("first")){
            for(int i=1;i<=20;i++)
            {
                System.out.println(i + "min");
                Thread.sleep(100);}
            }

            else if(time.equals("second")){
                for(int i=20;i<=40;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);}
            }

            else if(time.equals("third")){
                for(int i=40;i<=60;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);}
            }

            else if (time.equals("extra1")){
            for(int i=60;i<=65;i++)
            {
                System.out.println(i + "min");
                Thread.sleep(100);
            }}

            else if (time.equals("extra2")){
                for(int i=65;i<=70;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);
                }}

        } catch(InterruptedException e) {}
    }

    @Override
    public void teamsScoredFirstTierce() {

        Random generator = new Random();

        int homePoints = generator.nextInt(5);
        int visitingPoints = generator.nextInt(5);

        homeTeamScore = homeTeamScore + homePoints;
        visitingTeamScore = visitingTeamScore + visitingPoints;

    }


    @Override
    public void teamsScoredSecondTierce()  {

        Random generator = new Random();

        int homePoints = generator.nextInt(5);
        int visitingPoints = generator.nextInt(5);

        homeTeamScore = homeTeamScore + homePoints;
        visitingTeamScore = visitingTeamScore + visitingPoints;

    }

    @Override
    public void teamsScoredThirdTierce()  {

        Random generator = new Random();

        int homePoints = generator.nextInt(5);
        int visitingPoints = generator.nextInt(5);

        homeTeamScore = homeTeamScore + homePoints;
        visitingTeamScore = visitingTeamScore + visitingPoints;

    }


    @Override
    public void extraTime() {
        Random generator = new Random();

        int homePoints = generator.nextInt(5);
        int visitingPoints = generator.nextInt(5);

        homeTeamScore= homeTeamScore + homePoints;
        visitingTeamScore = visitingTeamScore + visitingPoints;
        System.out.println("The result after extra time is: " + homeTeamScore + ":" + visitingTeamScore);

    }

    @Override
    public void endOfTierce(String tierce) {

        try{

            if(tierce.equals("First") || tierce.equals("Second") || tierce.equals("Third"))
            {
                System.out.println("End of the " + tierce + " tierce, the result is: " +  homeTeamScore + ":" + visitingTeamScore );
            }

            Thread.sleep(2000);

            if(tierce.equals("Third") && homeTeamScore==visitingTeamScore)
            {
                System.out.println("First extra time: ");
                counting("extra1");
                extraTime();
                Thread.sleep(2000);

                System.out.println("First extra time: ");
                counting("extra2");
                extraTime();
                Thread.sleep(2000);

                if (homeTeamScore==visitingTeamScore)
                {
                    penalties();
                }
            } } catch (InterruptedException e) {}

    }

    @Override
    public void penalties() {

        Random generator = new Random();

        int homePenalties = generator.nextInt(5);
        int visitingPenalties = generator.nextInt(5);

        homeTeamPenalties = homePenalties;
        visitingTeamPenalties = visitingPenalties;

        while (homeTeamPenalties==visitingTeamPenalties) {
            homePenalties = generator.nextInt(5);
            visitingPenalties = generator.nextInt(5);
            homeTeamPenalties = homeTeamPenalties + homePenalties;
            visitingTeamPenalties = visitingTeamPenalties + visitingPenalties;}

        System.out.println("The result after penalties is: " + homeTeamPenalties + ":" + visitingTeamPenalties);

    }

    @Override
    public void matchResult() {

        if (homeTeamScore > visitingTeamScore || (homeTeamScore==visitingTeamScore&&homeTeamPenalties>visitingTeamPenalties))
        {
            System.out.println("The winner is: " + homeTeam);

        } else System.out.println("The winner is: " + visitingTeam);
    }
}


