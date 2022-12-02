package chap13;

public class BusCard {
    public static void main(String[] args) {
//      입력
        int age = Integer.parseInt("17");
//      메서드 수행        
        String role = getRole(age);
//      결과 출력
        System.out.println(role);
    }

    public static String getRole(int age) {
        String role = "";
        if(age >= 18) {
            role = "성인";
        } else if(age >= 13) {
            role = "청소년";
        } else if(age >= 6) {
            role = "어린이";
        } else {
            role = "유아";
        } return role;
    }
    
}
