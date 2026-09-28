package NewPack.controlstatement;

public class nestedifstat {

    public static void adminssion(int a, int m) {

        int age = a;
        int marks = m;
        int score = marks;

        if (age >= 0 && age <= 100) {
            if (age > 17 && age <= 21) {
                System.out.println("Age is Eligible for Admission");
            } else if (age > 21 && age < 100) {
                System.out.println("Age is higher for Admission");
            } else if (age > 0 && age < 18) {
                System.out.println("Minimum Age need for Admission is 18 years");
            }
        } else {
            System.out.println("Invalid Age");
        }

        if (marks >= 35 && marks <= 100) {
            System.out.println("Candidate Pass");
            if (marks <= 100 && marks >= 90) {
                System.out.println("Grade A");
                System.out.println("Marks Eligible for Admission");
            } else if (marks < 90 && marks >= 75) {
                System.out.println("Grade B");
                System.out.println("Marks Eligible for Admission");
            } else if (marks < 75 && marks >= 60) {
                System.out.println("Grade C");
                System.out.println("Marks Not Eligible for Admission");
            } else if (marks < 60 && marks >= 50) {
                System.out.println("grade D");
                System.out.println("Marks Not Eligible for Admission");
            } else if (marks < 50 && marks >= 35) {
                System.out.println("Just Pass - No Grades");
                System.out.println("Not Eligible for Admission");
            }
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Fail");
            System.out.println("Not Eligible for Admission");
        } else {
            System.out.println("Invalid Marks");
        }

//        if (score >= 90 && score <= 100 && age > 17 && age <= 21) {
//            System.out.println("Eligible for Admission");
//        } else if (score >= 75 && score < 90 && age > 17 && age <= 21) {
//            System.out.println("Eligible for Admission");
//        } else if (score < 75 && score > 34) {
//            System.out.println("Marks not Eligible for Admission");
//        } else if (score >= 0 && score < 35) {
//            System.out.println("Fail - Not Eligible");
//        }else{
//            System.out.println("Invalid Marks");
//        }

    }

    public static void main(String[] args) {

        adminssion(24, 90);
    }

}
