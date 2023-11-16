/*
(b) Write a method that returns this team's current number of points
(each win is three points, each tie is one point)
Write a reset method that zeroes out this team's wins, losses, and ties.
*/

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    public SoccerTeam(){//All starts with 0.
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played (SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){//Listing possibilities.
           this.wins++;
           other.losses++;
        } else if (myScore < otherScore){
        this.losses++;
        other.wins++;
        } else{
            this.ties++;
            other.ties++;
        }
    }
    /*
(b) Write a method that returns this team's current number of points
(each win is three points, each tie is one point)
Write a reset method that zeroes out this team's wins, losses, and ties.
*/
    public int points(int points){
       points += wins * 3;
       points += ties;
       return points;
    }

    public  





}
