package NewPack.controlstatement;

public class condiotionalstatement {

    public static void vote(int x){

        if(x >= 18 && x <= 120){

            System.out.println("Age Eligible for Voting");
        }
        else if(x<18 && x >0){

            System.out.println("Age is not Eligible for Voting");
        }else{
            System.out.println("Age is Invalid");
        }
    }

    public static void main(String[] args) {

        vote(1);
    }
}
