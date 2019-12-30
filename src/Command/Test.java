package Command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ConcretCommand concretCommand = new ConcretCommand(receiver);


        Invoker invoker = new Invoker();
        invoker.setCommand(concretCommand);

        invoker.ExecuteCommand();
    }
}
