package Flyweight;

public class Test {
    public static void main(String[] args) {
        int num = 20;
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

        Flyweight x = flyWeightFactory.GetFly("X");
        x.Operation(--num);

        Flyweight y = flyWeightFactory.GetFly("Y");
        y.Operation(--num);

        Flyweight z = flyWeightFactory.GetFly("Z");
        z.Operation(--num);


        UnConFly unConFly = new UnConFly();
        unConFly.Operation(--num);

    }
}
