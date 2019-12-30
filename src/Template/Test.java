package Template;

public class Test {
    public static void main(String[] args) {

        AbstractClass abstractClass;
        abstractClass = new ConOpA();
        abstractClass.TemplateMethod();

        abstractClass = new ConOpB();
        abstractClass.TemplateMethod();
    }
}
