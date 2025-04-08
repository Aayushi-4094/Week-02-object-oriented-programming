package week2.hybridinheritance;

public class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef's duties:");
        System.out.println("Preparing meals");
        System.out.println("Cooking food");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter's duties:");
        System.out.println("Taking orders");
        System.out.println("Serving customers");
    }

    public static void main(String[] args) {
        Chef chef = new Chef("John", 1);
        Waiter waiter = new Waiter("Jane", 2);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        waiter.displayInfo();
        waiter.performDuties();
}
}
