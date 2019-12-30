package Mediator;

public class Test {
    public static void main(String[] args) {

        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB b = new ConcreteColleagueB(concreteMediator);

        concreteMediator.setConcreteColleagueA(a);
        concreteMediator.setConcreteColleagueB(b);
        a.send("你好");
        b.send("哈喽");

    }
}
