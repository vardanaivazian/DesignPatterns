package patterns.strategy;

public class MallardDuck extends AbstractDuck {


    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
