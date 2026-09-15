package NewPack.Interface;

public class television implements remotecontrol, bank {

    int totalamt = 65000;

    @Override
    public void turnon() {
        System.out.println("Turn on the Television");

    }

    @Override
    public void turnoff() {
        System.out.println("Turnoff the Aircondition");

    }

    @Override
    public void bankbalance() {

        System.out.println("Total bank balance is "+totalamt);

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
