package Composite;

public abstract class Component {
     String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void Add(Component component) ;

    public abstract void remove(Component component);

    public abstract void disPlay(int mum);
}
