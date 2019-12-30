package Memento;

public class Test {
    public static void main(String[] args) {


        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("off");
        originator.show();

        caretaker.setMemento(originator.creatMemento());

        originator.setState("on");
        originator.show();

        originator.setMemento(caretaker.getMemento());

        originator.show();
    }
}
