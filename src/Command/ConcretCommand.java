package Command;

public class ConcretCommand extends Command {
    public ConcretCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        getReceiver().Action();
    }
}
