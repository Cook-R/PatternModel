package Decorator;

public class Test {
    public static void main(String[] args) {
        ConComponent conComponent = new ConComponent();

        ConDecA conDecA = new ConDecA();

        ConDeB conDeB = new ConDeB();

        conDecA.setComponent(conComponent);
        conDeB.setComponent(conDecA);
        conDeB.Operation();

    }
}
