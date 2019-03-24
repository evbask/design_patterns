package behavioral.strategy;

public class MuteQuack implements QuackBehavior {   //вторая реализация поведения квакающих уток
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
