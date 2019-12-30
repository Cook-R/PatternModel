package FactoryMethod;


public class OpAdd extends Operation {
    @Override
    public double GetResult() {
        double result=0.0;
        result = getNumberA()+getNumberB();
//        System.out.println(result);
        return result;
    }
}
