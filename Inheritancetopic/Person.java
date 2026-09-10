package Inheritancetopic;

public class Person {

    String name;
    int age;

    Person(String name, int age){

        this.name = name;
        this.age = age;

    }

    public void displayperson(){

        System.out.println("Name:"+ name);
        System.out.println("Age:" + age);

    }
}
