package chap13;

public class RareItem {
    public static void main(String[] args) {
        int hp = Integer.parseInt("2800");
        int mp = Integer.parseInt("2000");
        System.out.println(wearResult(hp, mp));
    }

    public static String wearResult(int hp, int mp) {
        String result = "아이템을 착용할 수 없습니다.";
        if(hp >= 2000 && mp >= 2000) {
            result = "아이템이 착용 되었습니다.";
        } return result;
    }
}
