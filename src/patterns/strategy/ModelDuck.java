package patterns.strategy;

public class ModelDuck extends AbstractDuck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
