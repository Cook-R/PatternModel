package Stratery;

public class Test {
    public static void main(String[] args) {

        Context context = new Context();
        context.setAbstractStratery(new ConStraA());
        context.Operation();
    }
}
