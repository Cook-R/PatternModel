package FactoryMethod;

public class MulFactory implements Factory {
    @Override
    public Operation CreateOp() {
        return new OpMul();
    }
}
