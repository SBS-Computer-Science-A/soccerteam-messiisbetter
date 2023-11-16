/*
(c) Add fields to keep track of the total number of games played and
the total number of goals scored by all teams in a tournament, combined.
Modify the played method from Part (a) to update these fields.
Add static accessor methods for these two fields and a static start
Tournament method to zero them out.


(d) Write a program called PlayTournament.java that defines four teams,
makes them "play" a few games with each other, and then reports each team's points
as well as the total number of games played and the total number of goals scored
by all teams in the tournament. The program should then repeat this for another tournament

*/

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played (SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){//Listing possibilities
           this.wins++;
           other.losses++;
        } else if (myScore < otherScore){
        this.losses++;
        other.wins++;
        } else{
            this.ties++;
            other.ties++;
        }
        totNumGoals += myScore;
        totNumGoals += otherScore;
    }

    public int points(int points){
       points += wins * 3;
       points += ties;
       return points;
    }

    public void reset (){
        wins = losses = ties = 0;
    }

    /*
    (c) Add fields to keep track of the total number of games played and
the total number of goals scored by all teams in a tournament, combined.
Modify the played method from Part (a) to update these fields.

Add static accessor methods for these two fields and a static start
Tournament method to zero them out.
     */
    private int gamePlayed;
    private int totNumGoals;
/*
Add static accessor methods for these two fields and a static start
Tournament method to zero them out.

 */
    public static int 



}
