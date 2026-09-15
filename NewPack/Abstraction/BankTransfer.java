package NewPack.Abstraction;

public class BankTransfer extends payment{

    @Override
    public void makepayment() {

        System.out.println("Payment transferred through Bank Transfer");
    }
}
