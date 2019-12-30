package Template;

public abstract class AbstractClass {
    abstract void Operation1();

    abstract void Operation2();

    public void TemplateMethod() {
        Operation1();
        Operation2();
        System.out.println("");
        if (IsNotTrue()) {
            Operation3();

        }
    }

    abstract boolean IsNotTrue();
    private void Operation3() {
        System.out.println("如果为true，则执行此方法");
    }
}
