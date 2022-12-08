package chap01;

public class CylinderVolume {
    public static void main(String[] args) {
        double r = 7.0;
        double h = 5.0;

//      부피 계산
        double v = volume(r, h);

        System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);
    }

    public static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}
