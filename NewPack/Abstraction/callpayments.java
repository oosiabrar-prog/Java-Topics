package NewPack.Abstraction;

public class callpayments {

    public static void main(String[] args) {

        payment p = new BankTransfer();
        p.makepayment();

        payment pm = new MobilePayment();
        pm.makepayment();
    }
}
