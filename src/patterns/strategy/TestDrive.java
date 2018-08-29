package patterns.strategy;

public class TestDrive {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        ModelDuck modelDuck = new ModelDuck();
        
        mallardDuck.performFly();
        mallardDuck.performQuack();
        
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performQuack();
        
    }
}
