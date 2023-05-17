package OOPS;

public class Inheritance {
    public static void main(String[] args) {
       // Fish shark=new Fish();
       // shark.eat();
       Dog pitbull=new Dog();
       pitbull.eat();
       pitbull.legs=4;
       System.out.println(pitbull.legs);
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}
/*class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}*/
class Mamels extends Animal{
  int legs;
}
class Dog extends Mamels{
String bread;
}
