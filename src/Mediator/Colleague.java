package Mediator;

public abstract class Colleague {
    private Mdeiator mdeiator;

    public Mdeiator getMdeiator() {
        return mdeiator;
    }

    public Colleague(Mdeiator mdeiator) {
        this.mdeiator = mdeiator;
    }


}
