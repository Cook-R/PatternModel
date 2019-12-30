package FactoryMethod;

public class FacMetTest {
    public static void main(String[] args) {

//        Factory addFactory = new AddFactory();
//        Operation oper = addFactory.CreateOp();
//        oper.setNumberA(1.0);
//        oper.setNumberB(2.0);
//        System.out.println(oper.GetResult());

        Factory factoryOne;
        factoryOne =(Factory) XMLUtil.getBean();
        Operation operation = factoryOne.CreateOp();
        operation.setNumberB(9.0);
        operation.setNumberA(8.0);
        System.out.println(operation.GetResult());

    }
}
