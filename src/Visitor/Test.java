package Visitor;

public class Test {
    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());

        structure.Access(new ConcreteVisitor1());
        structure.Access(new ConcreteVisitor2());

    }
}
