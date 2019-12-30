package Prototype.LogInPrototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ConPrototype conPrototype = new ConPrototype();

        PrototypeManager.setPrototype("1", conPrototype);

        ProtoType p1 = PrototypeManager.getPrototype("1").Clone();
        p1.SetName("张三");
        System.out.println(p1);

    }
}
