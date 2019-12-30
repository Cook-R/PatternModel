package Prototype.DeepClone;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable {
    private float height=100;
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
