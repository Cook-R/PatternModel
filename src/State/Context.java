package State;

public class Context {
    private AbstracrtState abstracrtState;

    public Context(AbstracrtState abstracrtState) {

        this.abstracrtState = abstracrtState;
    }

    public AbstracrtState getAbstracrtState() {
        return abstracrtState;
    }

    public void setAbstracrtState(AbstracrtState abstracrtState) {
        System.out.println(abstracrtState.getClass().getName());
        this.abstracrtState = abstracrtState;

    }


    public void request() {
        abstracrtState.Handler(this);
    }
}
