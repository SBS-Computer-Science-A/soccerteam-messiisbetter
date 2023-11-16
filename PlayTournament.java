/*
makes them "play" a few games with each other, and then reports each team's points
as well as the total number of games played and the total number of goals scored
by all teams in the tournament. The program should then repeat this for another tournament

 */

public class PlayTournament {
public static void main(String[] gift){
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

    */
    System.out.println("Total Games Played by Team 1: " + Team1.getTotalGamesPlayed());
    System.out.println("Total Games Played by Team 2: " + Team2.getTotalGamesPlayed());
    System.out.println("Total Games Played by Team 3: " + Team3.getTotalGamesPlayed());
    System.out.println("Total Games Played by Team 4: " + Team4.getTotalGamesPlayed());
}



}



