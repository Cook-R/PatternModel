package Singleton;

public class Test {
    public static void main(String[] args) {
        Sington sington = Sington.getInstance();
        Sington sington1 = Sington.getInstance();

        if (sington == sington1) {
            System.out.println("是同一个对象");
        }

        HSington instance = HSington.getInstance();
        HSington instance1 = HSington.getInstance();

        if (instance== instance1) {
            System.out.println("是同一个对象");
        }
    }
}
