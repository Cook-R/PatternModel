package Prototype.SimplePrototype;

public class conPrototypeOne implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new conPrototypeOne();
        return prototype;

    }
}
