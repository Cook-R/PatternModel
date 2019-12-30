package Visitor;

import Mediator.ConcreteColleagueA;
import Mediator.ConcreteColleagueB;

public class ConcreteVisitor1 extends Visitor {
    @Override
    void visitConcreteElementA(ConcreteElementA concreteColleagueA) {
        System.out.println(concreteColleagueA.getClass().getName() + " 正在被" + this.getClass().getName() + "访问");
    }

    @Override
    void visitConcreteElementB(ConcreteElementB concreteColleagueB) {
        System.out.println(concreteColleagueB.getClass().getName() + " 正在被" + this.getClass().getName() + "访问");

    }
}
