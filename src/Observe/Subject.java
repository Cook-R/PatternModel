package Observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observe> list = new ArrayList<Observe>();

    public void Add(Observe observe) {
        list.add(observe);
    }

    public void Remove(Observe observe) {
        list.remove(observe);
    }

    public void Notify() {
        for (Observe observe : list) {
            observe.Update();
        }
    }
}
