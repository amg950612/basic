
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

        match.counting("normal");

        match.teamsScoredFirstTierce();

        match.endOfTierce("First");

        Thread.sleep(2000);

        System.out.println("Second tierce: ");

        match.counting("normal");

        match.teamsScoredSecondTierce();

        match.endOfTierce("Second");

        Thread.sleep(2000);

        System.out.println("Third tierce: ");

        match.counting("normal");

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
            if(time.equals("normal")){
            for(int i=1;i<=20;i++)
            {
                System.out.println(i);
                Thread.sleep(100);}
            }
            else
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(100);
            }


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
                counting("extra");
                extraTime();
                Thread.sleep(2000);

                System.out.println("First extra time: ");
                counting("extra");
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


