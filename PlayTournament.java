/*
makes them "play" a few games with each other, and then reports each team's points
as well as the total number of games played and the total number of goals scored
by all teams in the tournament. The program should then repeat this for another tournament

 */

/*public class PlayTournament {
public static void main(String[] args){
    SoccerTeam Team1 = new SoccerTeam();
    SoccerTeam Team2 = new SoccerTeam();
    SoccerTeam Team3 = new SoccerTeam();
    SoccerTeam Team4 = new SoccerTeam();

    Team1.played(Team2, 3,1);
    Team1.played(Team3, 2,1);
    Team1.played(Team4, 3,3);
    Team2.played(Team3, 7,8);
    Team2.played(Team4, 0,1);
    Team3.played(Team4, 1,4);

    System.out.println(Team1.points());
    System.out.println(Team2.points());
    System.out.println(Team3.points());
    System.out.println(Team4.points());

   /* System.out.println(Team1.getTotalGamesPlayed());
    System.out.println(Team2.getTotalGamesPlayed());
    System.out.println(Team3.getTotalGamesPlayed());
    System.out.println(Team4.getTotalGamesPlayed());



}



}




 */

public class PlayTournament {



    public static void main(String[] args) {
        SoccerTeam Team1 = new SoccerTeam();
        SoccerTeam Team2 = new SoccerTeam();
        SoccerTeam Team3 = new SoccerTeam();
        SoccerTeam Team4 = new SoccerTeam();

        Team1.played(Team2, 3, 1);
        Team1.played(Team3, 2, 1);
        Team1.played(Team4, 3, 3);
        Team2.played(Team3, 7, 8);
        Team2.played(Team4, 0, 1);
        Team3.played(Team4, 1, 4);

        // Display results for Tournament 1
        System.out.println("Tournament 1");
        System.out.println(Team1.points());
        System.out.println(Team2.points());
        System.out.println(Team3.points());
        System.out.println(Team4.points());

        System.out.println(Team1.getTotalGamesPlayed());
        System.out.println(Team2.getTotalGamesPlayed());
        System.out.println(Team3.getTotalGamesPlayed());
        System.out.println(Team4.getTotalGamesPlayed());


        System.out.println(Team1.getTotalGoalsScored());
        System.out.println(Team2.getTotalGoalsScored());
        System.out.println(Team3.getTotalGoalsScored());
        System.out.println(Team4.getTotalGoalsScored());


        // Tournament 2
        SoccerTeam Team5 = new SoccerTeam();
        SoccerTeam Team6 = new SoccerTeam();
        SoccerTeam Team7 = new SoccerTeam();
        SoccerTeam Team8 = new SoccerTeam();

        Team5.played(Team6, 2, 2);
        Team5.played(Team7, 1, 0);
        Team5.played(Team8, 3, 1);
        Team6.played(Team7, 0, 1);
        Team6.played(Team8, 2, 1);
        Team7.played(Team8, 1, 2);

        System.out.println("Tournament 2");
        System.out.println(Team5.points());
        System.out.println(Team6.points());
        System.out.println(Team7.points());
        System.out.println(Team8.points());

        System.out.println(Team5.getTotalGamesPlayed());
        System.out.println(Team6.getTotalGamesPlayed());
        System.out.println(Team7.getTotalGamesPlayed());
        System.out.println(Team8.getTotalGamesPlayed());


        System.out.println(Team5.getTotalGoalsScored());
        System.out.println(Team6.getTotalGoalsScored());
        System.out.println(Team7.getTotalGoalsScored());
        System.out.println(Team8.getTotalGoalsScored());
    }
}