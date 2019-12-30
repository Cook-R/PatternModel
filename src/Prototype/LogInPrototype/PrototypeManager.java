package Prototype.LogInPrototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private static Map<String, ProtoType> map = new HashMap<String, ProtoType>();

    public synchronized static void setPrototype(String string, ProtoType protoType) {
        map.put(string, protoType);
    }

    public synchronized static ProtoType getPrototype(String string) {
        ProtoType protoType = map.get(string);
        if (protoType==null) {
            System.out.println("还未注册");
        }
        return protoType;
    }

    public synchronized static void removePrototype(String string) {
        map.remove(string);
    }

}
