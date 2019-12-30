package Visitor;

import Mediator.ConcreteColleagueA;
import Mediator.ConcreteColleagueB;

public abstract class Visitor {
    abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
