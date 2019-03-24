package behavioral.strategy;

public class FlyNoWay implements FlyBehavior {  //вторая реализация поведения летающих уток
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
