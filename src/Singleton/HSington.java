package Singleton;

public class HSington {
    private static HSington hSington=new HSington();

    private HSington() {
    }

    public static HSington getInstance( ) {
        return hSington;

    }
}
