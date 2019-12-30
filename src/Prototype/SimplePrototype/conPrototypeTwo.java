package Prototype.SimplePrototype;

public class conPrototypeTwo implements Prototype {
    @Override
    public Prototype clone() {
        conPrototypeTwo conPrototypeTwo = new conPrototypeTwo();
        return conPrototypeTwo;
    }
}
