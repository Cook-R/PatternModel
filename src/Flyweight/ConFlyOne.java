package Flyweight;

public class ConFlyOne implements  Flyweight {
    @Override
    public void Operation(int num) {
        System.out.println("具体Flyweight" + num);
    }
}
