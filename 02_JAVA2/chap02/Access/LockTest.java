package Access;

public class LockTest {
    public static void main(String[] args) {
        Lock lock = new Lock("123!@#");

        lock.setPassword("654#@!");

        System.out.println(lock.toString());
    }
}

class Lock {
    private String password;

    public Lock(String p) {
        this.password = p;
    }

    public String toString() {
        return String.format("Lock { password: %s }", password);
    }

//  비밀번호 변경을 위한 setter 메서드를 추가하기
    public void setPassword(String pw) {
        this.password = pw;
    }
}
