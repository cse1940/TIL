package Reference;

public class PlayerTest {
    public static void main(String[] args) {
        int[] points0 = {10, 9, 9, 8};
        int[] points1 = {9, 10, 9, 9};
        int[] points2 = {10, 9, 10, 10};

        Player p1 = new Player("Kim", points0);
        Player p2 = new Player("Lee", points1);
        Player p3 = new Player("Park", points2);

        Player[] players = {p1, p2, p3};

        for(int i=0; i<players.length; i++) {
            players[i].printTotalPoints();
        }
    }
}

class Player {
    String name;
    int[] points;

    Player(String name, int[] points) {
        this.name = name;
        this.points = points;
    }

    void printTotalPoints() {
        System.out.printf("%s => %d점\n", name, totalPoints());
    }

    int totalPoints() {
        int sum = 0;
        for(int i=0; i<points.length; i++) {
            sum += points[i];
        }
        return sum;
    }
}
