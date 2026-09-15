package NewPack.Interface;

public class Unionbank implements bank{

    int totalamt = 35000;

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
