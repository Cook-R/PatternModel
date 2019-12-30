package FactoryMethod;

public class DivFactory implements Factory {
    @Override
    public Operation CreateOp() {
        return new OpDiv();
    }
}
