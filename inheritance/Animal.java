package week2.inheritance;

public class Animal {
String name;
int age;

public void makeSound() {
    System.out.println("Animal making sound");
}

}

class Dog extends Animal {
@Override
public void makeSound() {
System.out.println("Dog barking");
}
}

class Cat extends Animal {
@Override
public void makeSound() {
System.out.println("Cat meowing");
}
}

class Bird extends Animal {
@Override
public void makeSound() {
System.out.println("Bird chirping");
}
}