package Mediator;

public class ConcreteMediator extends Mdeiator {

    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;


    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    void send(String Message, Colleague colleague) {
        concreteColleagueA.Notify(Message);
        concreteColleagueB.Notify(Message);
    }


}
