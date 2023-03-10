package oop_package;

public class Zoo {
    public static void main(String[] args) {


        Animal dog = new Animal(5, "boy", 100);
        Animal cat = new Animal(3, "girl", 15);

        dog.eat();

        Bird bird1= new Bird();
        bird1.fly();
    }
}