package Composite;

public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Composite compositX = new Composite("composit X");
        root.Add(compositX);
        compositX.Add(new Leaf("Leaf XA"));
        compositX.Add(new Leaf("Leaf XB"));



        Composite compositF = new Composite("composit F");
        compositX.Add(compositF);
        compositF.Add(new Leaf("Leaf FXA"));
        compositF.Add(new Leaf("Leaf FXB"));


//        root.Add(compositF);

        root.disPlay(1);
    }
}
