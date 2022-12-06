package chap07;

public class TimeConversion {
    public static void main(String[] args) {
        int totalSec = 7582;

        int sec = totalSec % 60;
        int min = totalSec % 3600 / 60;
        int hour = totalSec / 3600;

        System.out.printf("%d시간 %d분 %d초", hour, min, sec);
    }
}
