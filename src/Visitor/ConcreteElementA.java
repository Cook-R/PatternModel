package Visitor;

public class ConcreteElementA extends  Element {
    @Override
    void Accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
