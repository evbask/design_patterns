package behavioral.strategy;
    public class FlyWithWings implements FlyBehavior{       //первая реализация поведения летающих уток
        @Override
        public void fly() {
            System.out.println("I'm flying");
        }
    }


