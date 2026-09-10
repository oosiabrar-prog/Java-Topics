package Inheritancetopic;

public class student extends Person{

    int rollNo;

    student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    public void displaystudent(){

        displayperson();
        System.out.println("Roll no:"+ rollNo);

    }

    public static void main(String[] args) {

        student s = new student("Abrar", 43, 110);
        s.displaystudent();
    }
}

