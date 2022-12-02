package chap12;

public class Walking {
    public static void main(String[] args) {
        double kcal = calculateWalkingKcal(5000);
        System.out.println("소모 칼로리: " + kcal + " kcal");
    }

    public static double calculateWalkingKcal(int walkingCount) {
        return walkingCount * 0.02;
    }
}
