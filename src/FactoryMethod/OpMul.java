package FactoryMethod;

public class OpMul extends Operation {
    @Override
    public double GetResult() {
        double result=0.0;
        result = getNumberA()*getNumberB();
        return result;
    }
}
