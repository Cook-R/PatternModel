package Flyweight;

public class UnConFly implements Flyweight {
    @Override
    public void Operation(int num) {
        System.out.println("不共享的" + num);
    }
}
