package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> list= new ArrayList<Component>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void disPlay(int mum) {
        System.out.println("++第" + mum + "层++名字为：" + name);
        for (Component component : list) {
            component.disPlay(mum + 1);
        }
    }
}
