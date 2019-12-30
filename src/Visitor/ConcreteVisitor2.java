package Visitor;

import Mediator.ConcreteColleagueA;
import Mediator.ConcreteColleagueB;

public class ConcreteVisitor2 extends Visitor {
    @Override
    void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + " 正在被" + this.getClass().getName() + "访问");
    }

    @Override
    void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + " 正在被" + this.getClass().getName() + "访问");

    }
}
