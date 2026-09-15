package NewPack.Interface;

public class aircondition implements remotecontrol, bank {

    int totalamt = 45000;

    @Override
    public void turnon() {
        System.out.println("Television is On");

    }

    @Override
    public void turnoff() {
        System.out.println("Aircondition is Off");

    }

    @Override
    public void bankbalance() {
        System.out.println("The total amount balance is "+totalamt);
    }

    @Override
    public void deposit(int d) {

        totalamt = totalamt + d;
        System.out.println("Total amount after deposit is "+totalamt);

    }

    @Override
    public void withdraw(int w) {

        totalamt = totalamt - w;
        System.out.println("Total amount after withdraw is "+totalamt);

    }
}
