package State;

public class ConSateB extends AbstracrtState {
    @Override
    void Handler(Context context) {
        System.out.println("调用A");
        context.setAbstracrtState(new ConStateA());
    }
}
