package Bridge;

public abstract class HardsetBrand {
    protected Soft soft;

    public HardsetBrand(Soft soft) {
        this.soft = soft;
    }

    abstract void run();
}
