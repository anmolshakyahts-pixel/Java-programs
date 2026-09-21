import java.util.Scanner;
public class Gamer {
    String playerName;
    int matchesPlayed;
    int points;

    void getPlayerDetail() {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the Player name: ");
        playerName = r.nextLine();
        System.out.println("Enter the number  of matches  : ");
        matchesPlayed = r.nextInt();
        System.out.print("Enter the Points: ");
        points = r.nextInt();
    }

    String getTournamentCategory(){
        if(points>=90)
            return "pro";
        else if(points>=70)
            return "Advanced";
        else if(points>=50)
            return "Intermediate";
        else
            return "Beginner";
    }
    void displayPlayerCategory() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Matches played: " + matchesPlayed);
        System.out.println("points: " + points);
        System.out.println("Tournament Category: " + getTournamentCategory());

        }

    public static void main(String[] args){
        Gamer R = new Gamer();
        R.getPlayerDetail();
        R.displayPlayerCategory();
    }

}
