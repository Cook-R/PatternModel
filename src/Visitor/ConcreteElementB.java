package Visitor;

public class ConcreteElementB extends Element {
    @Override
    void Accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
