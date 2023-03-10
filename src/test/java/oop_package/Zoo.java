package oop_package;

public class Zoo {
    public static void main(String[] args) {

        Bird bird1= new Bird(3,"girl",20);
        bird1.eat();
        bird1.sleep();

        Chicken chicken = new Chicken(1,"boy",6);
        Animal sparrow = new Sparrow(1,"m",4);
        sparrow.move();

        Animal fish = new Fish(1,"g",1);
        fish.move();
        moveAnimals(fish);
        moveAnimals(sparrow);

        Flyable flyable = new Sparrow(1,"M",2);
        flyable.fly();

    }
    public static void moveAnimals(Animal animal){
        animal.move();
    }


}