package HomeWork7;

public class Test {
    public static void main(String[] args) {
        System.out.printf("%n Example 1:%n");
        Team team1 = new Team("Barcelona");
        Player player1 = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
        Player player2 = new Player("Gerard_Pique", 95, 82, 82, 89, 68);
        //team1.addPlayer(player2);
        team1.removePlayer(player2);
        team1.printTeam();

        System.out.printf("%n Example 2:%n");
        Team team2 = new Team("Barcelona");
        Player player3 = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
        Player player4 = new Player("Gerard_Pique", 195, 82, 82, 89, 68);
        //team2.addPlayer(player4);
        team2.removePlayer(player4);
        team2.printTeam();

        System.out.printf("%nThird example:");
        Team team3 = new Team("Barcelona");
        team3.printTeam();
    }
}
