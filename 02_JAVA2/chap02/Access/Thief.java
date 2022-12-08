package Access;

public class Thief {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(30000);
        System.out.print(wallet.toString());

        Thief.steal(wallet);
    
        System.out.println(" => " + wallet.toString());
    }

    public static void steal(Wallet target) {
//      target.money = 0; => private 접근 불가능
    }
}

class Wallet {
    private int money;

    public Wallet(int i) {
        this.money = i;
    }

    public String toString() {
        return String.format("Wallet { money: %d }", money);
    }
}
