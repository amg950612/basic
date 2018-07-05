
import java.util.Random;

public class FootballMatch implements Football {

    private static int homeTeamScore = 0;
    private static int visitingTeamScore = 0;
    private static int homeTeamPenalties = 0;
    private static int visitingTeamPenalties = 0;
    private static String homeTeam;
    private static String visitingTeam;

    public static void main(String[] args) throws InterruptedException {
        FootballMatch match = new FootballMatch();

        homeTeam = match.setHomeTeam("Brazil");
        visitingTeam = match.setVisitingTeam("Poland");

        System.out.println("Today is a UEFA World Cup final match between: " + homeTeam + " and " + visitingTeam + " !!!");

        Thread.sleep(2000);

        System.out.println("First half: ");

        match.counting("first");

        match.teamsScoredFirstHalf();

        match.endOfHalf("First");

        Thread.sleep(2000);

        System.out.println("Second half: ");

        match.counting("second");

        match.teamsScoredSecondHalf();

        match.endOfHalf("Second");

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
            for(int i=1;i<=45;i++)
            {
                System.out.println(i + "min");
                Thread.sleep(100);
            }}

            else if (time.equals("second")){
                for(int i=45;i<=90;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);
                }}
            else if (time.equals("extra1")){
                for(int i=90;i<=105;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);
                }}
            else if (time.equals("extra2")){
                for(int i=105;i<=120;i++)
                {
                    System.out.println(i + "min");
                    Thread.sleep(100);
                }}


        }catch(InterruptedException e ) {}
    }

    @Override
    public void teamsScoredFirstHalf() {

        Random generator = new Random();

       int homePoints = generator.nextInt(5);
       int visitingPoints = generator.nextInt(5);

        homeTeamScore = homeTeamScore + homePoints;
        visitingTeamScore = visitingTeamScore + visitingPoints;

    }


    @Override
    public void teamsScoredSecondHalf()  {

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
    public void endOfHalf(String half) {

        try{

            if(half.equals("First") || half.equals("Second"))
            {
            System.out.println("End of the " + half + " half, the result is: " +  homeTeamScore + ":" + visitingTeamScore );
            }

            Thread.sleep(2000);

            if(half.equals("Second") && homeTeamScore==visitingTeamScore)
            {
                System.out.println("First extra time: ");
                counting("extra1");
                extraTime();
                Thread.sleep(2000);

                System.out.println("Second extra time: ");
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
                System.out.println("The UEFA World Cup 2018 winner is: " + homeTeam);

            } else System.out.println("The UEFA World Cup 2018 winner is: " + visitingTeam);
        }
    }

