package Singleton;

public class Sington {
    private static Sington sington;

    private Sington() {
    }

    public static Sington getInstance( ) {

        if (sington == null) {
             sington = new Sington();
        }
        return sington;

    }
}
