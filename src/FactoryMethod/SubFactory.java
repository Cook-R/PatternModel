package FactoryMethod;

public class SubFactory implements Factory {
    @Override
    public Operation CreateOp() {
        return new OpSub();
    }
}
