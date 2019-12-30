package Flyweight;

import java.util.Hashtable;

public class FlyWeightFactory {
    private Hashtable hashtable = new Hashtable();

    public FlyWeightFactory() {
        hashtable.put("X", new ConFlyOne());
        hashtable.put("Y", new ConFlyTwo());
        hashtable.put("Z", new ConFlyThree());
    }

    public Flyweight GetFly(String key) {
        return (Flyweight) hashtable.get(key);
    }

}
