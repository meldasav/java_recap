package oop_package;

public abstract class Animal {

    int age;
    int weight;
    String gender;

    public Animal(int age , String gender , int weight){
        this.age= age;
        this.gender=gender;
        this.weight=weight;
    }

    public void eat(){
        System.out.println("Eating ");
    }
    public void sleep(){
        System.out.println("Sleeping ");
    }

    public abstract void move();
}
