package Decorator;

public class ConDeB extends Decorator {


    @Override
    public void Operation() {
        getComponent(). Operation();
        System.out.println("具体装饰对象B的动作");
    }
}
