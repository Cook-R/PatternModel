package Prototype.ShallowClone;

public class GoldRingedStaff {
    private float height=100f;
    private float weight = 30f;

    public void grew() {
        this.weight*=2;
        this.height*=2;
    }

    public void shrink() {
        this.weight /= 2;
        this.height /= 2;
    }
}
