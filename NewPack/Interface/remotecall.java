package NewPack.Interface;

public class remotecall{

    public static void main(String[] args) {

        remotecontrol t = new television();
        remotecontrol c = new aircondition();
        bank a = new television();
        bank b = new aircondition();

        t.turnon();
        t.turnoff();
        System.out.println("-------------------------");
        c.turnon();
        c.turnoff();
        System.out.println("-------------------------");
        a.bankbalance();
        a.deposit(25000);
        a.withdraw(30000);
        System.out.println("-------------------------");
        b.bankbalance();
        b.deposit(55000);
        b.withdraw(75000);
    }
}
