package Decorator;

public class ConDecA extends Decorator {


    @Override
    public void Operation() {

        getComponent().Operation();
        System.out.println("具体装饰对象A的动作");
    }
}
