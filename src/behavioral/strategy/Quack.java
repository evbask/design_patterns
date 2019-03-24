package behavioral.strategy;

public class Quack implements QuackBehavior{ //первая реализация поведения квакающих уток
    public void quack(){
        System.out.println("Quack");
    }
}
