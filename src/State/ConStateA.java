package State;

public class ConStateA extends AbstracrtState {
    @Override
    void Handler(Context context) {
        System.out.println("调用B");
        context.setAbstracrtState(new ConSateB());
    }
}
