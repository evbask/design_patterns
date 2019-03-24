package behavioral.strategy;

public class Squeak implements QuackBehavior { //третья реализация поведения квакающих уток
    public void quack(){
        System.out.println("Squeak");
    }
}
