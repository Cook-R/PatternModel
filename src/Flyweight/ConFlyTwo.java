package Flyweight;

public class ConFlyTwo implements Flyweight {
    @Override
    public void Operation(int num) {
        System.out.println("具体Flyweight" + num);
    }
}
