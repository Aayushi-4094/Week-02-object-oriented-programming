package week2.constructors.level1;

public class Person {
    String name;
    int age;

    Person() {
        name = "Aayushi";
        age = 22;
}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
}

    Person(Person prevPerson) {
        this.name = prevPerson.name;
        this.age = prevPerson.age;
    }

    void displayDetails() {
        System.out.println("Person name : " + name);
        System.out.println("Person age : " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Person 1 details:");
        p1.displayDetails();;

        Person p2 = new Person("Pritesh", 21);
        System.out.println("Person 2 details :");
        p2.displayDetails();

        Person p3 = new Person(p2); 
        System.out.println("P3 (copy of p2)");
        p3.displayDetails();
    }
}
