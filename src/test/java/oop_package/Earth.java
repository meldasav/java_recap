package oop_package;

public class Earth {

    public static void main(String[] args) {

        Human human1= new Human("Tom",25,76,"Blue");
        Human human2= new Human("Joe",28,68,"Brown");

        human1.speak();
        human2.speak();

    }
}