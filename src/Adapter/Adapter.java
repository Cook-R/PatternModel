package Adapter;

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        System.out.println("把普通方法转换为特殊方法");
        adaptee.SpecificRequest();
    }
}
