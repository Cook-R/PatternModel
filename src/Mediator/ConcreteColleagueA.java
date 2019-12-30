package Mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mdeiator mdeiator) {
        super(mdeiator);
    }

    public void send(String message) {
        getMdeiator().send(message,this);
    }

    public void Notify(String mess) {
        System.out.println("同事A已经接收消息"+mess);
    }
}
