package Stratery;

public class Context {

    private AbstractStratery abstractStratery;
    public void setAbstractStratery(AbstractStratery abstractStratery) {
        this.abstractStratery = abstractStratery;
    }

    public void Operation() {
        abstractStratery.Operation();
    }
}
