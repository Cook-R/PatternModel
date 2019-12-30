package Flyweight;

public class ConFlyThree implements Flyweight {

    @Override
    public void Operation(int num) {
        System.out.println("具体Flyweight" + num);
    }
}
