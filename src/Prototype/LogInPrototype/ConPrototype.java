package Prototype.LogInPrototype;

public class ConPrototype implements ProtoType {

    private String name;
    @Override
    public ProtoType Clone() {
        ConPrototype conPrototype = new ConPrototype();
        conPrototype.SetName(this.name);
        return conPrototype;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void SetName(String name) {
        this.name=name;
    }

@Override
    public String toString() {
        return "now in this name=" + this.name;
    }
}
