package Template;

public class ConOpA extends AbstractClass {
    @Override
     void Operation1() {
        System.out.println("执行方法A1");
    }

    @Override
    void Operation2() {
        System.out.println("执行方法A2");
    }

    @Override
    boolean IsNotTrue() {
        return false;
    }
}
