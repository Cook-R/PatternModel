package Mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mdeiator mdeiator) {
        super(mdeiator);

    }

    public void send(String message) {
        getMdeiator().send(message, this);
    }

    public void Notify(String mess) {
        System.out.println("同事B接收到消息"+mess);
    }
}
