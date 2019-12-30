package FactoryMethod;

public class AddFactory implements Factory {
    @Override
    public Operation CreateOp() {
        return new OpAdd();
    }
}
