package Reference;

public class Teamtest {
    public static void main(String[] args) {
//      한국
        Player kim = new Player("Kim", new int[] {9, 8, 10});
        Player lee = new Player("Lee", new int[] {10, 9, 10});
        Player park = new Player("Park", new int[] {8, 10, 9});
//      중국
        Player xiao = new Player("Xiao", new int[] {10, 9, 10});
        Player yu = new Player("Yu", new int[] {8, 9, 10});
        Player xui = new Player("Xui", new int[] {8, 9, 9});

        Player[] koreaPlayers = {kim, lee, park};
        Player[] chinaPlayers = {xiao, yu, xui};

        Team korea = new Team("KOREA", koreaPlayers);
        Team china = new Team("CHINA", chinaPlayers);

        korea.printTeamPoints();
        china.printTeamPoints();
    }
}

class Team {
    String nation;
    Player[] players;

    Team(String nation, Player[] players) {
        this.nation = nation;
        this.players = players;
    }

    void printTeamPoints() {
        int sum = 0;
        for(int i=0; i<players.length; i++) {
            sum += players[i].totalPoints();
        }
        System.out.printf("%s => %d points\n", nation, sum);
    }
}
